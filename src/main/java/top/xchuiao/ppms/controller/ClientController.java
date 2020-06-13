package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Client;
import top.xchuiao.ppms.service.ClientService;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Client)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:47
 */
@RestController
public class ClientController {
    /**
     * 服务对象
     */
    @Resource
    private ClientService clientService;

    @GetMapping("/clients")
    public Responce getAllClients()
    {
        Responce responce=new Responce();
        responce.data=this.clientService.queryAll();
        return responce;
    }
    @PostMapping("/clients")
    public Responce modAllClients(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg= util.ModTable(data,this.clientService, Client.class);
        return responce;
    }
}