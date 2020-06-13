package top.xchuiao.ppms.entity;

import java.io.Serializable;

/**
 * (Projectmember)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class Projectmember implements Serializable {
    private static final long serialVersionUID = 978435933571707106L;
    
    private Long proId;
    
    private Long staId;


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

}