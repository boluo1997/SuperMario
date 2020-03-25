package cn;

//不使用匿名内部类来实现抽象方法

public class Test10_Anonymity {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.eat();
    }
}

class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }
}


interface Animal{
    void eat();
}
