package top.xchuiao.ppms.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class util {
    public static <T> T mapToBean(Map<String, Object> map, Class<T> type) {
        JSONObject object = new JSONObject(map);
        return object.toJavaObject(type);
    }

    public static <T> T toJson(String json, Class<T> type) {
        return JSON.parseObject(json, type);
    }

    static <S,T> List<String> mod(S service, List<T> data, String methodName)
    {
        List<String> result=new ArrayList<>();
        if (data==null)
            return result;
        for (T item :
                data) {
            try {
                Method method = service.getClass().getMethod(methodName,item.getClass());
                method.invoke(service,item);
            } catch (Exception e) {
                e.printStackTrace();
               result.add(item.toString());
            }
        }
        return result;
    }
    public static <S, T> String ModTable(Map<String, Object> data, S service, Class<T> type) {
        List<T> add = JSON.parseArray((String) data.get("add"), type);
        List<T> mod = JSON.parseArray((String) data.get("mod"), type);
        List<String> del = JSON.parseArray((String) data.get("del"), String.class);
        Map<String,List<String>> result=new HashMap<>();
        result.put("add",mod(service,add,"insert"));
        result.put("mod",mod(service,mod,"update"));
        result.put("del",mod(service,del,"deleteById"));
        return JSON.toJSONString(result);
    }

    public static <S, T,D> String ModTable(Map<String, Object> data, S service, Class<T> type,Class<D> delType) {
        List<T> add = JSON.parseArray((String) data.get("add"), type);
        List<T> mod = JSON.parseArray((String) data.get("mod"), type);
        List<D> del = JSON.parseArray((String) data.get("del"), delType);
        Map<String,List<String>> result=new HashMap<>();
        result.put("add",mod(service,add,"insert"));
        result.put("mod",mod(service,mod,"update"));
        result.put("del",mod(service,del,"deleteById"));
        return JSON.toJSONString(result);
    }
}
