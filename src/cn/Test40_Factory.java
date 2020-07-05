package cn;

/**
 * 工厂方法模式：
 *
 *
 */

interface Moveable{     //产品接口
    void run();
}

class MoveableA implements Moveable{

    @Override
    public void run() {
        System.out.println("产品A");
    }
}

class MoveableB implements Moveable{

    @Override
    public void run() {
        System.out.println("产品B");
    }
}

abstract class FactoryParent{       //工厂接口
    abstract Moveable create();
}

class FactoryA extends FactoryParent{       //工厂实现类
    @Override
    Moveable create() {
        return new MoveableA();
    }

}

class FactoryB extends FactoryParent{

    @Override
    Moveable create() {
        return new MoveableB();
    }
}

public class Test40_Factory {
    public static void main(String[] args) {
        FactoryParent f = new FactoryB();
        Moveable m = f.create();
        m.run();
    }
}
