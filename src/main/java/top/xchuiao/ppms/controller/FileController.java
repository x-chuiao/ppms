package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.File;
import top.xchuiao.ppms.service.FileService;
import top.xchuiao.ppms.utils.Responce;

import javax.annotation.Resource;
import java.util.List;

/**
 * (File)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:55
 */
@RestController
public class FileController {
    /**
     * 服务对象
     */
    @Resource
    private FileService fileService;

    @GetMapping("/project-file")
    public Responce getAllPfile(@RequestParam("pro_id") long id){

        Responce responce = new Responce();

        List<File> files= fileService.queryAllPfile(id);
        if(files==null)
        {
            responce.code="10001";
            responce.msg="不存在文件列表";
        }
        else
        {
            responce.data=files;
        }
        return responce;
    }

}