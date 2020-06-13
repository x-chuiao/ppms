package top.xchuiao.ppms.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:41
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -61733084375905678L;
    
    private Integer rolId;
    
    private String rolName;


    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

}