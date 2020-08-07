package cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test50_Map {

    public static void main(String[] args) {

        //Map遍历方法

        //1.for()循环  通过加强for循环map.keySet()，然后通过map.get(key)获取到value值
        Map<String,String> map = new HashMap<>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");

        for(String key : map.keySet()){
            System.out.println(key + "," + map.get(key));
        }

        //2.只遍历键或者值，通过加强for循环
        for(String key : map.keySet()){
            System.out.println(key);
        }

        for(String value : map.values()){
            System.out.println(value);
        }

        //3.  Map.Entry<String, String>的加强for循环遍历输出键key和值value
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key:" + entry.getKey() + "\n" + "value:" + entry.getValue());
        }

        //4.迭代器
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
        }
    }

}
