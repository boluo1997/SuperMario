package cn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序方法2: 实现comparable接口
 */

public class Test31_compareTo {

    public static void main(String[] args) {

        Animal3 an1 = new Animal3("张三",20,86);
        Animal3 an2 = new Animal3("李四",20,76);
        Animal3 an3 = new Animal3("王五",20,96);

        List list = new ArrayList();

        list.add(an1);
        list.add(an2);
        list.add(an3);

        Collections.sort(list);
        System.out.println(list);
    }

}

class Animal3 implements Comparable<Animal3>{

    String name;
    int age;
    int score;

    public Animal3(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Animal3 an) {
        return this.score - an.score;
    }

    @Override
    public String toString() {
        return "Animal3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
