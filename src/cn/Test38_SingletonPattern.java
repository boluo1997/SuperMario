package cn;

/**
 * 单例模式
 * 确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 *
 * 不能被外界实例化  private 构造()
 * 只有一个实例：这个实例是当前类的类成员变量
 *
 * 向整个系统提供这个方法，即提供一个静态方法，向外界提供当前类的实例
 * 当前实例只能在类内部进行实例化，不能够放到外面去
 *
 * 单例模式的主要作用是确保一个类只有一个实例的存在
 *
 *
 */
public class Test38_SingletonPattern {
    public static void main(String[] args) {

    }
}

//饿汉式
class Singleton{

    private static Singleton singleton = new Singleton(); //根据实例化实际不同，单例模式又可分为饿汉式和懒汉式
                                        //饿汉式：在类进行加载的时候就进行实例化
    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }
}



