package cn;

class interview_question{


    public static void main(String[] args) {

        /*
        Integer i = new Integer(100);
        Integer j = new Integer(100);

        System.out.println( i==j );
        System.out.println(i.equals(j));
        */

        /*
        int[] num1 = new int[]{1,2,3};
        int[] num2 = new int[]{1,2,3};

        System.out.println(num1.equals(num2));
        */

        /*
        Integer in1 = new Integer(100);
        Integer in2 = new Integer(100);
        System.out.println(in1 == in2);
        */

        Integer in1 = 100, in2 = 100;
        System.out.println(in1.hashCode() == in2.hashCode());

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
 *      只能对引用类型用：默认情况是饮用比较，比较内存地址值是否相等，但是很多类重写了equals方法
 *      比如String、Integer等把它变成了值比较。
 *
 * 当equals为 true时，==不一定为 true
 *
 */

//15.String中的常用方法
/**
 * 1.charAt()：返回指定下标的字符
 * 2.toCharArray()：把字符串转成字符数组
 * 3.concat()：把新的字符串拼接到原字符串的末尾
 *      +依赖于StringBuilder来拼接，可以拼接任意数据
 *      concat()依赖于底层的数组复制来实现
 * 4.contains()：判断新串是否是原串的子串
 * 5.replace()：替换
 * 6.valueOf()：是静态方法，可以根据类名点出来，把其他任意类型的数据转换成String类型
 */

//16.包装类
/**
 * 1.自动封箱：把基本类型的数据直接赋值给包装类的对象
 *
 * Integer in = 1;  //自动封箱  Integer in = new Integer(1);
 *
 * 2.自动拆箱：把包装类的对象直接赋值给对应的基本类型
 *
 * in = in + 5; //自动拆箱  in.intValue()
 *
 */

//17
/**
 * Integer in1 = 100,in2 = 100;
 * System.out.print(in1 == in2);    //true  因为当数据在byte范围内，JVM不会在堆中开辟新的空间，
 *                                  in2就会指向in1在堆中的内存地址，所以==在这里比较地址值就是true
 *
 * Integer in1 = 200,in2 = 200;
 * System.out.print(in1 == in2);    //false
 *
 *
 */


































