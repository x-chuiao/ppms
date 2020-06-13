package top.xchuiao.ppms.entity;

import java.io.Serializable;

/**
 * (Position)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class Position implements Serializable {
    private static final long serialVersionUID = 353631698234502861L;
    
    private Integer posId;
    
    private String posName;


    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

}