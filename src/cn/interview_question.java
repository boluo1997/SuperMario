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

//7.        +=、-=等赋值运算符包含了强制类型转换

//8.定义数组时，程序默认会给赋默认值
/**
 * int 0
 * float double 0.0
 * char '\u0000'
 * boolean false
 */

//9.基本数据类型赋值，是直接把值赋给变量
//  引用数据类型赋值是将堆中的内存地址值赋给变量

//10.switch括号中必须是整型、字符型和String型，对应的case也是

//11.this是当前类的对象，super是父类的对象

//12.在使用this调用类的构造方法时
/**
 * 1.只能在构造方法中使用this调用其他的构造方法
 * 2.在构造方法中，使用this调用构造方法的语句必须在首行，且只能出现一次
 */

//13.构造方法、静态方法都是可以重载，不能重写
/**
 * 构造方法不能重写，因为重写发生在父子类中，构造方法不能被继承
 * 静态方法不能重写，因为静态方法是类级别的，重写是对象级别的
 */

//14.==和equals()的区别
/**
 * 1.==的作用
 *      基本类型：比较值是否相等
 *      引用类型：比较内存地址值是否相等
 *
 * 2.equals()的作用
 *      只能对引用类型用：比较内存地址值是否相等
 */




































