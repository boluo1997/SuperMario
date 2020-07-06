package cn;

/**
 * 装饰器模式：动态地给一个对象添加一些额外的功能，就增加功能来说，装饰器模式比生成子类更加灵活
 */
public class Test43_DecoratorPattern {
    public static void main(String[] args) {
        new RobotDecorator(new FirstRobot()).doMoreThing();
    }
}

interface Robot{        //装饰器要装饰的接口
    void doSomeThing();
}

class FirstRobot implements Robot{      //被修饰的对象

    @Override
    public void doSomeThing() {

    }
}

class RobotDecorator implements Robot{      //装饰器，要和被装饰的对象实现相同的接口

    private Robot robot;

    public RobotDecorator(Robot robot){
        this.robot = robot;
    }

    @Override
    public void doSomeThing() {
        robot.doSomeThing();
    }

    public void doMoreThing(){
        System.out.println("more thing");
    }
}
