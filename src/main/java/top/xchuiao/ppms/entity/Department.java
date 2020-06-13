package top.xchuiao.ppms.entity;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 549319578420867791L;
    
    private Integer depId;
    
    private String depName;


    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

}