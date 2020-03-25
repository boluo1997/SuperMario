package cn;

//使用匿名内部类来实现抽象方法

interface Animal2{
    void eat();
}

public class Test11_Anonymity {
    public static void main(String[] args) {
        Animal2 an = new Animal2() {
            @Override
            public void eat() {
                System.out.println("此处省略了实现接口的类的创建!");
            }
        };

        an.eat();
    }
}

