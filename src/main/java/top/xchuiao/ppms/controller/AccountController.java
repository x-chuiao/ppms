package top.xchuiao.ppms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;
import top.xchuiao.ppms.entity.Account;
import top.xchuiao.ppms.entity.Client;
import top.xchuiao.ppms.entity.Staff;
import top.xchuiao.ppms.entity.Staffinfo;
import top.xchuiao.ppms.service.AccountService;
import top.xchuiao.ppms.service.ClientService;
import top.xchuiao.ppms.service.StaffService;
import top.xchuiao.ppms.service.StaffinfoService;
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
    private StaffinfoService staffinfoService;
    @Resource
    private StaffService staffService;

    @PostMapping("/login")
    public Responce login(long acc_id, String acc_pwd) {
        Responce responce = new Responce();
        Account account = this.accountService.queryById(acc_id);
        if (account == null || !account.getAccPwd().equals(acc_pwd) ){
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
    public Responce modAccount(Long acc_id, String org_pwd,String new_pwd)
    {
        Responce responce=Responce.getInstance();
        Account account = this.accountService.queryById(acc_id);
        if (account == null || !account.getAccPwd().equals(org_pwd) ){
            responce.code = "10001";
            responce.msg = "密码错误";
        } else
        this.accountService.update(new Account(){{setAccId(acc_id);setAccPwd(new_pwd);}});
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
            Client client=util.mapToBean(data,Client.class);
            clientService.update(client);
        }
        else if(type==2)
        {
            Staff staff=util.mapToBean(data,Staff.class);
            staffService.update(staff);

        }
        return responce;
    }

    @GetMapping("/basic-info")
    public Responce getBasicInfo(long acc_id,int acc_type) {
        Responce responce = new Responce();

        if(acc_type==1)
        {
           Client client= clientService.queryByAccId(acc_id);
           if(client==null)
           {
               responce.code = "10001";
               responce.msg = "账号错误";
           }else
               responce.data=client;


        }
        else if(acc_type==2)
        {
            Staffinfo staffinfo= staffinfoService.queryByAccId(acc_id);
            if(staffinfo==null)
            {
                responce.code = "10001";
                responce.msg = "账号错误";
            }else
                responce.data=staffinfo;

        }
        return responce;
    }

}