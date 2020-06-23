package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Staffinfo;
import top.xchuiao.ppms.service.StaffinfoService;

import javax.annotation.Resource;

/**
 * (Staffinfo)表控制层
 *
 * @author makejava
 * @since 2020-06-11 19:05:38
 */
@RestController
public class StaffinfoController {
    /**
     * 服务对象
     */
    @Resource
    private StaffinfoService staffinfoService;


}