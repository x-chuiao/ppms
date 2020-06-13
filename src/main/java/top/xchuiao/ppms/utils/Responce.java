package top.xchuiao.ppms.utils;

import java.io.Serializable;

public class Responce implements Serializable {
    public String code="10000";
    public String msg="";
    public Object data=null;
    public static Responce getInstance()
    {
        return new Responce();
    }

}
