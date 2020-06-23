package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Staff;
import top.xchuiao.ppms.service.StaffService;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Staff)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:58
 */
@RestController
public class StaffController {
    /**
     * 服务对象
     */
    @Resource
    private StaffService staffService;

    @GetMapping("/staffs")
    public Responce getAllStaffs()
    {
        Responce responce=new Responce();
        responce.data=this.staffService.queryAllS();
        return responce;
    }
    @PostMapping("/staffs")
    public Responce modAllStaffs(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg= util.ModTable(data,this.staffService, Staff.class);
        return responce;
    }
}