package cn;

/**
 * 代理模式
 * 代理模式和装饰器模式的区别是：
 *      装饰器模式主要是对原始对象的方法增强，增加方法
 *      代理模式主要是对原始对象的代理。
 */

//接口
interface Subject{
    void doWork();
}

//真正目标类
class RealSubject implements Subject{

    @Override
    public void doWork() {

    }
}

//代理类
class proxySubject implements Subject{

    private RealSubject realSubject;

    public proxySubject(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    public void connect(){
        System.out.println("创建连接！");
    }

    public void log(){
        System.out.println("日志收集！");
    }

    @Override
    public void doWork() {
        connect();
        realSubject.doWork();
        log();
    }
}


public class Test51_ProxyPattern {
    public static void main(String[] args) {
        new proxySubject(new RealSubject()).doWork();
    }
}

