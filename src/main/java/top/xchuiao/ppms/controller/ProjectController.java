package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.*;
import top.xchuiao.ppms.service.*;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * (Project)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:56
 */
@RestController
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectService projectService;
    @Resource
    private AccountService accountService;
     @Resource
    private ProjectmemberService projectmemberService;
    @Resource
    private StaffinfoService staffinfoService;
    @Resource
    private ClientService clientService;

    @GetMapping("/projects-info")
    public Responce getAllProject(@RequestParam long acc_id) {
        Responce responce = Responce.getInstance();
        int type=accountService.queryById(acc_id).getAccType();
        List<Project> projects=null;
        if(type==1)
        {
            //通过实体查询账户对应的员工
            Staffinfo staffinfo=staffinfoService.queryAll(new Staffinfo(){{setAccId(acc_id);}}).stream().findFirst().orElse(null);
            if(staffinfo==null)
            {}

            List<Projectmember> projectmembers= projectmemberService.queryAll(new Projectmember(){{setStaId(staffinfo.getStaId());}});
            projects=this.projectService.queryAllByProIds(projectmembers.stream().map(Projectmember::getProId).collect(Collectors.toList()));
        }
        else if(type==2)
        {
            Client client=clientService.queryByAccId(acc_id);
            projects=this.projectService.queryAllByCliId(client.getCliId());
        }
        else
        {
            responce.msg="不存在此用户";
            responce.code="10001";
        }
        responce.data=projects;
        return responce;
    }

    @PostMapping("/projects-info")
    public Responce modAllPositions(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg= util.ModTable(data,this.projectService, Project.class);
        return responce;
    }

}