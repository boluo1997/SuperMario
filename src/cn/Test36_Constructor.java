package cn;

public class Test36_Constructor {
    public static void main(String[] args) {
        new Cat();
    }

}

class Pig{
    public Pig(int i){
        System.out.println("pig" + i);
    }
}

class Cat{

    Pig p1 = new Pig(1);

    public Cat(){
        System.out.println("cat");
    }

    Pig p2 = new Pig(2);
    Pig p3 = new Pig(3);
}
