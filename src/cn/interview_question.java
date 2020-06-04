package cn;

class interview_question{

    static float a = 1.12345678945375675f;
    static int b = 1;

    public static void main(String[] args) {

        float c = a;

        System.out.println(b);
        System.out.println(a);
    }

}


//1.jdk和jre的区别
/**
 *
 * jre = jvm + 核心类库
 * jdk = jre + 开发工具
 *
 */

//2.public修饰的类，类名必须和文件名保持一致

//3.java八大基本数据类型
/**
 * byte  字节型 1字节
 * short 短整型 2字节
 * int   整型   4字节
 * long  长整型 8字节
 *
 * float  单精度 4字节
 * double 双精度 8字节
 *
 * boolean 布尔型 1字节
 * char    字符型 2字节
 *
 */

//4.类型从小到大      自动转换
/**
 * byte  short  int  long  float  double
 *
 * 字符可以自动转换成int型
 * char  int  long  float  double
 *
 * 除了boolean类型，其余类型都可以自动转换
 */

//5.byte、short、char在参与运算时，会自动将自己提升为int类型参与运算

//6.        +-*/运算时，如果运算时两个参数类型不一样，则结果的数据类型和2个元素中较大的数据类型保持一致

//7.



































