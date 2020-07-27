package cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test50_Map {

    public static void main(String[] args) {

        //Map遍历方法

        //1.for()循环
        Map<String,String> map = new HashMap<String,String>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");

        for(String key : map.keySet()){
            System.out.println(key);
        }

        for(String value : map.values()){
            System.out.println(value);
        }

        //2.迭代器
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, String> entry = entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }

        //3.通过键找值
        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }

}
