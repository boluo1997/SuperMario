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

//18.集合
/**
 * Collection(单列集合)：
 * 子接口  List(列表)：元素有序可重复
 *                  实现类：ArrayList、LinkedList、Vector、Stack、
 *
 *        Set(散列)：元素无序不可重复
 *                  实现类：HashSet、TreeSet
 *
 */

//19.
/**
 * 排序方法1：类实现Comparable接口，重写compareTo()方法
 *      class Person implements Comparable{
 *          String name;
 *          int age;
 *
 *          public Person(String name,int age){
 *              this.name = name;
 *              this.age = age;
 *          }
 *
 *          //重写compareTo()方法
 *          public int compareTo(Person person){
 *              return this.age - person.age;
 *          }
 *
 *      }
 *
 *
 *
 *
 *
 *
 * 排序方法2: Comparator:比较器
 *      1):通过集合对象调用sort()方法返回比较器
 *      2):需要对compare()方法进行重写
 */

//20.迭代器:Iterator
/**
 * 调用iterator()返回Iterator接口
 * Iterator<String> in = list.iterator();
 * while(in.hasNext()){
 *      String s = in.next();
 *      ...
 * }
 *
 */

//21.堆、栈、静态区
/**
 * 栈: 保存局部变量的值:
 *      1.用来保存基本数据类型的值；
 *      2.保存类的实例，即堆区对象的引用(指针)。
 *      所有的方法都在栈中执行
 *
 * 堆: 通过new和构造方法创建出的对象存放在堆中
 *      成员变量在堆的对象中
 *
 * 静态区: 存放静态变量和常量
 *
 */

//22.switch的作用类型:
/**
 * byte、short会隐式的转换为 int类型,所以可以
 * jdk1.7加入了 char、String类型
 *
 */

//23.一个.java源文件中可以有多个类,但是只能有一个public类,且public类必须与文件名相同

//24.如果两个对象相同,它们的hashCode()一定相同
//   如果两个对象的hashCode()相同,这两个对象不一定相同

//25.抽象类和接口的区别
/**
 * 1.抽象类中可以有构造方法,只是不能实例化,接口中不能有构造方法
 * 2.抽象类中可以有普通成员变量,接口中不能有普通成员变量
 * 3.抽象类中可以有普通方法,接口中所有方法必须是抽象的
 * 4.接口中定义的属性默认被 public final static 修饰
 *   接口中的抽象方法默认被 public abstract 修饰
 * 5.抽象类中可以有静态方法,接口中不可以
 *
 */

//26.成员变量存储在堆中,生命周期随类
//   局部变量存储在栈中,生命周期随方法

//27.子类不能继承父类的私有信息(属性和方法)和构造方法和构造代码块,其余的都能继承

//28.this代表当前类的对象,super代表父类的对象

//29.多态:
//      编译时多态:方法的重载
//      运行时多态:在运行的时候根据实际情况决定调动的函数
//      运行时多态的条件: 1).继承  2).重写  3).向上造型

//30.局部变量未初始化就使用会报错,局部变量没有初始值,成员变量有初始值.

//31.静态变量是类级别的,不能在任何方法中定义.(静态方法和构造方法中也不可以定义静态变量)

//32.静态方法可以重载,不能重写,静态方法可以被继承,不能被重写的原因是重写是对象级别的,而静态方法是类级别的

//33.构造方法可以重载,不能重写,构造方法不能被继承,不能被重写的原因是构造方法不能被继承

//34
/**
 * 在java中,如果父子类出现了方法签名一致及方法名相同的方法,
 * 要么都是静态方法(就是两个方法,不是重写)
 * 要么都是非静态方法(重写)
 * 否则会报错
 */

//35.静态代码块只在类加载的时候执行一次

//36.final
/**
 * final修饰的类不能被继承
 * final修饰的方法不能被重写
 * final修饰的变量是常量,且只能被赋值一次
 */

//37.如果final修饰的是引用数据类型,就是地址值不能改变,但是元素值可以改变

//38.抽象类不能被final修饰,修饰之后不能被继承,就失去了抽象类的意义

//39.抽象方法不能被private static final 修饰,被修饰之后,方法就不能被重写

//40.抽象类中可以有构造方法,只是不能创建实例,接口中没有构造方法

//41.接口中的方法全都是抽象方法,没有普通成员变量,全部被public static final 修饰

//42.接口与接口之间是多继承、多实现

//43
/**
 * 向上造型: 父类引用指向子类对象     Animal an = new Dog();
 *
 * 向下造型: 子类引用指向父类对象     Dog dog = (Dog) an;
 *
 */

//44.String
/**
 * String是一个final类,主要是为了保证String不可变,
 * 从内存角度看,如果创建字符时,该字符已经存在于字符串常量池中,则返回现有字符串的引用
 * (多个String变量指向同一个内存地址),而不是创建新的对象,
 * 如果字符串是可变的,用一个引用更改字符串将导致其他引用值的错误
 */

//45.如果在常量池中已经定义了字符串直接量,那么后续的字符串直接量如果和前面一致就指向前一个,共享

//46.StringBuffer安全,效率低     StringBuilder不安全,效率高

//47.Collection<T>  由于泛型的存在,集合中只能是引用类型

//48.List可以存放重复数据,Set不能存储重复元素

//49.HashSet    底层基于数组+链表   不保证存放的顺序及迭代的顺序

//50.泛型的上限  <? extends T>   ?只能是T和T的子类
//              <? super T>     ?只能是T和T的父类

//51.开启多线程的三种方法
/**
 * 1. 把线程执行的内容放到一个类中,这个类继承Thread类,重写run()方法,
 * 这个方法里面才是线程真正执行的任务,调用start()开启线程
 *
 * 2. 实现Runnable接口,重写run()方法,通过Runnable实现类对象构建Thread类对象
 * 调用start()方法开启线程: Thread t = new Thread(new RDemo());
 *
 * 3.实现Callable接口,重写call()方法
 *
 */

//52.sleep()和wait()的区别
/**
 * 1. sleep()是Thread类中的静态方法,时间指定不指定都可以,到点自然醒,
 *          如果没有锁,释放线程的执行权,如果有锁,释放线程的执行权,但是不释放锁对象
 *
 * 2. wait()是Object中的方法,时间指定不指定都可以,一定要唤醒,无论是否加锁都释放线程的执行权及锁对象
 */

//53.6步实现JDBC
/**
 * 1.注册数据库驱动
 * 2.获取数据库连接
 * 3.创建传输器
 * 4.传输SQL语句
 * 5.遍历结果
 * 6.关闭连接
 *
 */

//54.IOC的实现原理
/**
 * 在初始化一个Spring容器时,Spring会去解析指定的xml文件,当解析到其中的<bean>标签时,
 * 会根据该标签中的class属性指定类的全路径名,通过反射创建该类的对象,并将该对象存入内置的Map中管理
 * 键为ID,值为该对象,之后,当通过getBean()方法获取对象时,就是根据传入的"person"在Map中寻找是否有对应的值
 * 有则返回,没有则报错
 */

//55.Spring创建对象的方式:
/**
 * 1.默认采用类的无参构造方法创建对象
 * 在Spring容器初始化时,通过<bean>上配置的class属性,反射得到字节码对象,通过newInstance()创建对象
 * 这种方式下Spring创建对象,要求类必须要有无参构造,否则无法通过反射创建对象
 *
 *
 * 2.通过静态工厂创建对象
 *
 * 3.实例工厂创建对象
 *
 * 4.通过Spring工厂创建对象
 * 
 */

































