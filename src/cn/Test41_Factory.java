package cn;

/**
 * 抽象工厂模式
 * 因为我们在工厂方法模式中，定义了一个抽象的产品接口，所以我们只能生产一大类的产品
 * 抽象工厂模式使得这个工厂不仅可以生产某一大类的产品，还可以生产其他类的产品
 *
 * 缺点：添加某一类产品时，仍然要修改工厂类的代码
 */

public class Test41_Factory {
    public static void main(String[] args) {

    }
}

interface AbstractFactory{      //抽象工厂
    //在抽象工厂中定义需要生产的产品，在超级工厂中实现
    Phone createPhone(String param);
    Mask createMask(String param);
}


class SuperFactory implements AbstractFactory{      //超级工厂，生产所有的产品
    @Override
    public Phone createPhone(String param) {
        return new iPhone();
    }

    @Override
    public Mask createMask(String param) {
        return new N95();
    }

}

interface Phone{    //产品大类

}

class iPhone implements Phone{      //产品实现类

}

interface Mask{     //产品大类

}

class N95 implements Mask{          //产品实现类

}
