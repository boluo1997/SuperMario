package cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test56_identityCard {
    public static void main(String[] args) {
        getDate("411628199701234211");
    }

    public static Date getDate(String str){

        if(str == null || str == ""){
            System.out.println("不能为空！");
        }

        if(str.length() != 18){
            System.out.println("长度不合法！");
        }

        String date = str.substring(6,14);

        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

    }
}
