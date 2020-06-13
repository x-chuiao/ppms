package top.xchuiao.ppms.entity;

import java.io.Serializable;

/**
 * (Staff)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class Staff implements Serializable {
    private static final long serialVersionUID = -24151204214733582L;
    
    private Long staId;
    
    private Integer posId;
    
    private Integer depId;
    
    private Long accId;
    
    private String staName;
    
    private Integer staAge;
    
    private Integer staSex;
    
    private String staContact;


    public Long getStaId() {
        return staId;
    }

    public void setStaId(Long staId) {
        this.staId = staId;
    }

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public Integer getStaAge() {
        return staAge;
    }

    public void setStaAge(Integer staAge) {
        this.staAge = staAge;
    }

    public Integer getStaSex() {
        return staSex;
    }

    public void setStaSex(Integer staSex) {
        this.staSex = staSex;
    }

    public String getStaContact() {
        return staContact;
    }

    public void setStaContact(String staContact) {
        this.staContact = staContact;
    }

}