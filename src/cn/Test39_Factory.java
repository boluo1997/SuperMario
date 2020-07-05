package cn;

/**
 * 工厂模式：
 * 1.简单工厂模式：在简单工厂模式中，可以根据传入参数的不同，返回不同类的实例。
 *   简单工厂模式专门定义一个类来负责创建其他类的实例（工厂类），被创建的实例通常都具有共同的父类
 */

abstract class Products{    //产品接口
    public abstract void print();
}

class ProductA extends Products{    //产品实现类

    @Override
    public void print() {
        System.out.println("产品A");
    }
}

class ProductB extends Products{

    @Override
    public void print() {
        System.out.println("产品B");
    }
}

class Factory{      //工厂类
    public static Products createProduct(String str){
        if(str.equals("A")){
            return new ProductA();
        }else {
            return new ProductB();
        }
        //缺点在这里，不够灵活，每次新增一个产品就要修改工厂类
    }
}

public class Test39_Factory {
    public static void main(String[] args) {
        Products p = Factory.createProduct("A");
        p.print();
    }
}
