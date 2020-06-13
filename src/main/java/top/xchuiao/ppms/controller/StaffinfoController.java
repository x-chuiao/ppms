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
@RequestMapping("staffinfo")
public class StaffinfoController {
    /**
     * 服务对象
     */
    @Resource
    private StaffinfoService staffinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Staffinfo selectOne( id) {
        return this.staffinfoService.queryById(id);
    }

}