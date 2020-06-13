package top.xchuiao.ppms.entity;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -90358652156699552L;
    
    private Long accId;
    
    private Integer rolId;
    
    private String accPwd;
    
    private Integer accType;


    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getAccPwd() {
        return accPwd;
    }

    public void setAccPwd(String accPwd) {
        this.accPwd = accPwd;
    }

    public Integer getAccType() {
        return accType;
    }

    public void setAccType(Integer accType) {
        this.accType = accType;
    }

}