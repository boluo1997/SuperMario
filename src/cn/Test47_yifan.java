package cn;

import java.util.*;
import java.util.stream.Collectors;


public class Test47_yifan {
    public static void main(String[] args) {

        List<Student> allData = new ArrayList<Student>();

        allData.add(new Student("class1", "丁超"));
        allData.add(new Student("class1", "李拓"));
        allData.add(new Student("class1", "张嵩"));
        allData.add(new Student("class2", "小帅"));
        allData.add(new Student("class2", "老毛"));

        List<String> classList = new ArrayList<>();

        //假设学生列表 allData 是个未知数量的 查询出来的动态列表
        allData.forEach(student -> {
            classList.add(student.getClassId());//记录下学生列表中每一条班级号
        });

        List<String> newClassList = classList.stream().distinct().collect(Collectors.toList());//班级号去重处理

        Map<String, List<Student>> map = new HashMap<String, List<Student>>();//将学生列表封装为Map<key:班级号,vlaue:对应的List>

        for (Student student : allData) {
            if (map.get(student.getClassId()) == null) {
                List<Student> list = new ArrayList<Student>();
                list.add(student);
                map.put(student.getClassId(), list);
            } else {
                List<Student> list = map.get(student.getClassId());
                list.add(student);
            }
        }

        newClassList.forEach(s -> {
            //遍历去重后的班级号列表  来取到班级号对应的List
            System.out.println(s);
            for (Student stu : map.get(s)) {
                System.out.println(s);
                System.out.println("班级id为：" + stu.getClassId() + "的" + stu.getName());
            }
        });
    }

    public static class Student {
        /**
         * 班级id
         */
        private String classId;
        /**
         * 学生name
         */
        private String name;

        public Student() {
        }

        public Student(String classId, String name) {
            super();
            this.classId = classId;
            this.name = name;
        }

        public String getClassId() {
            return classId;
        }

        public void setClassId(String classId) {
            this.classId = classId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
