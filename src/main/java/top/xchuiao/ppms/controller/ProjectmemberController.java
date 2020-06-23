package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Projectmember;
import top.xchuiao.ppms.service.DepartmentService;
import top.xchuiao.ppms.service.ProjectmemberService;
import top.xchuiao.ppms.service.StaffService;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Projectmember)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:57
 */
@RestController
public class ProjectmemberController {
    /**
     * 服务对象
     */

    @Resource
    private StaffService staffService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private ProjectmemberService projectmemberService;

    @GetMapping("/projects-member")
    public Responce getAllProjectMember(@RequestParam("dep_id") long id){

        Responce responce = new Responce();

        List<Map<String,Object>> projectmember= projectmemberService.queryAllByDepId(id);
        if(projectmember.isEmpty())
        {
            responce.code="10001";
            responce.msg="暂无项目及人员";
        }
        else
        {
            responce.data=projectmember;
        }
        return responce;
    }
    @PostMapping("/projects-member")
    public Responce modAllProjectMember(@RequestParam Map<String,Object> data){
        Responce responce = new Responce();
        responce.code="10002";
        responce.msg=util.ModTable(data,this.projectmemberService, Projectmember.class,Projectmember.class);
        return responce;
    }
}