package top.xchuiao.ppms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Submitrecord)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class Submitrecord implements Serializable {
    private static final long serialVersionUID = 341084232314963967L;
    
    private Long subId;
    
    private Long proId;
    
    private Long staId;
    
    private String subIntro;
    
    private Date submitTime;
    
    private Integer directorAudit;
    
    private String directorComment;
    
    private String clientComment;


    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public Long getStaId() {
        return staId;
    }

    public void setStaId(Long staId) {
        this.staId = staId;
    }

    public String getSubIntro() {
        return subIntro;
    }

    public void setSubIntro(String subIntro) {
        this.subIntro = subIntro;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getDirectorAudit() {
        return directorAudit;
    }

    public void setDirectorAudit(Integer directorAudit) {
        this.directorAudit = directorAudit;
    }

    public String getDirectorComment() {
        return directorComment;
    }

    public void setDirectorComment(String directorComment) {
        this.directorComment = directorComment;
    }

    public String getClientComment() {
        return clientComment;
    }

    public void setClientComment(String clientComment) {
        this.clientComment = clientComment;
    }

}