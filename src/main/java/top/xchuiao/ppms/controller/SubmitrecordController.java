package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Submitrecord;
import top.xchuiao.ppms.service.SubmitrecordService;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Submitrecord)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:59
 */
@RestController

public class SubmitrecordController {
    /**
     * 服务对象
     */
    @Resource
    private SubmitrecordService submitrecordService;

    @GetMapping("/submit-records")
    public Responce getSubm(@RequestParam("sta_id") long id){

        Responce responce = new Responce();

        List<Submitrecord> submitrecords= submitrecordService.queryByStaId(id);
        if(submitrecords==null)
        {
            responce.code="10001";
            responce.msg="不存在记录列表";
        }
        else
        {
            responce.data=submitrecords;
        }
        return responce;
    }

    @PostMapping("/submit-record")
    public Responce modASubmitrecord(@RequestParam Map<String,Object> data){
        // add:[{"pro_id":"","id":""},{"pro_id":"","id":""}，{"pro_id":"","id":""}]
        // del:[{"pro_id":"","id":""},{"pro_id":"","id":""}，{"pro_id":"","id":""}]
        Responce responce = new Responce();
        responce.code="10002";
        responce.msg= util.ModTable(data,this.submitrecordService, Submitrecord.class,Submitrecord.class);
        return responce;
    }
    @GetMapping("/audits")
    public Responce getNoSubm(){
        Responce responce = new Responce();
        List<Submitrecord> submitrecords= submitrecordService.queryByDaudit(1);
        if(submitrecords==null)
        {
            responce.code="10001";
            responce.msg="不存在记录列表";
        }
        else
        {
            responce.data=submitrecords;
        }
        return responce;
    }
    @PostMapping("/submit-reject")
    public Responce modBhSubm(@RequestParam("id") long id, @RequestParam("director_comment") String Dcomment){
        Responce responce = new Responce();
        Submitrecord submitrecords= submitrecordService.queryById(id);
        if(submitrecords==null)
        {
            responce.code="10001";
            responce.msg="不存在记录列表";
        }
        else
        {
            submitrecords.setDirectorAudit(3);
            submitrecords.setDirectorComment(Dcomment);
            this.submitrecordService.update(submitrecords);
            responce.data=submitrecords;

        }
        return responce;
    }
}