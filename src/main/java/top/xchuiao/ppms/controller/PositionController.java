package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Position;
import top.xchuiao.ppms.service.PositionService;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Position)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:56
 */
@RestController
public class PositionController {
    /**
     * 服务对象
     */
    @Resource
    private PositionService positionService;


    @GetMapping("/positions")
    public Responce getAllPositions()
    {
        Responce responce=Responce.getInstance();
        responce.data=this.positionService.queryAll();
        return responce;
    }
     @PostMapping("/positions")
    public Responce modAllPositions(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg=util.ModTable(data,this.positionService,Position.class);
        return responce;
    }

}