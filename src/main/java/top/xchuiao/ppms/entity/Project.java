package top.xchuiao.ppms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Project)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class Project implements Serializable {
    private static final long serialVersionUID = -27898572625022057L;
    
    private Long proId;
    
    private Long cliId;
    
    private String proName;
    
    private Date proSetupTime;
    
    private String proIntro;
    
    private Integer proState;


    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public Long getCliId() {
        return cliId;
    }

    public void setCliId(Long cliId) {
        this.cliId = cliId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Date getProSetupTime() {
        return proSetupTime;
    }

    public void setProSetupTime(Date proSetupTime) {
        this.proSetupTime = proSetupTime;
    }

    public String getProIntro() {
        return proIntro;
    }

    public void setProIntro(String proIntro) {
        this.proIntro = proIntro;
    }

    public Integer getProState() {
        return proState;
    }

    public void setProState(Integer proState) {
        this.proState = proState;
    }

}