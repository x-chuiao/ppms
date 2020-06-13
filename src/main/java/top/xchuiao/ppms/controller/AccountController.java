package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xchuiao.ppms.entity.Account;
import top.xchuiao.ppms.service.AccountService;
import top.xchuiao.ppms.service.ClientService;
import top.xchuiao.ppms.service.StaffService;
import top.xchuiao.ppms.utils.Responce;
import top.xchuiao.ppms.utils.util;

import javax.annotation.Resource;
import java.util.Map;


/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:52
 */
@RestController
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;
    @Resource
    private ClientService clientService;
    @Resource
    private StaffService staffService;


    @PostMapping("/login")
    public Responce login(String id, String pwd) {
        Responce responce = new Responce();
        Account account = this.accountService.queryById(id);
        if (account == null || !account.getAccPwd().equals(pwd) ){
            responce.code = "10001";
            responce.msg = "账密错误";
        } else
            responce.data = account;
        return responce;
    }
    @GetMapping("/accounts")
    public Responce Getallaccount()
    {
        Responce responce=new Responce();
        responce.data=this.accountService.queryAll();
        return responce;
    }
    @PostMapping("/account")
    public Responce modAccount(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        Account account = this.accountService.queryById((Long)data.get("id"));
        if (account == null || !account.getPwd().equals((String)data.get("org_pwd"))) {
            responce.code = "10001";
            responce.msg = "密码错误";
        } else
        this.accountService.update(new Account(){{setAccId((Long)data.get("id"));setPwd((String)data.get("new_pwd"));}});
        return responce;
    }

    @PostMapping("/accounts")
    public Responce modAllAccounts(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg=util.ModTable(data,this.accountService,Account.class);
        return responce;
    }

    @PostMapping("/basic-info")
    public Responce ModBasicInfo(@RequestParam Map<String, Object> data) {
        Responce responce=new Responce();
        int type= (int) data.get("acc_type");
        if(type==1)
        {

        }
        else if(type==2)
        {

        }
        return responce;
    }

    @GetMapping("/basic-info")
    public Responce getBasicInfo(@RequestParam Account account) {
        Responce responce = new Responce();
        int type=account.getAccType();
        if(type==1)
        {

        }
        else if(type==2)
        {

        }
        return responce;
    }

}