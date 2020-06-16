package cn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 排序方法1: 通过比较器Comparator
 * 通过集合对象调用sort()方法返回比较器
 * 需要对compare方法进行重写
 *
 */

public class Test30_compare {
    public static void main(String[] args) {
        Person p1 = new Person("张三",20,86);
        Person p2 = new Person("李四",20,96);
        Person p3 = new Person("王五",20,76);

        List list = new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.score - o2.score;
            }
        });

        System.out.println(list);
    }
}

class Person{

    String name;
    int age;
    int score;

    public Person(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
