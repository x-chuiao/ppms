package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Department;
import top.xchuiao.ppms.service.DepartmentService;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:54
 */
@RestController
public class DepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;

  @GetMapping("/departments")
    public Responce getAllPositions()
    {
        Responce responce=Responce.getInstance();
        responce.data=this.departmentService.queryAll();
        return responce;
    }

     @PostMapping("/departments")
    public Responce modAllPositions(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg= util.ModTable(data,this.departmentService, Department.class);
        return responce;
    }

}