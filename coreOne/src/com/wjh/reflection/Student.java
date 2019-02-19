package com.wjh.reflection;

/**
 * @author JHW
 * @date created at 2019/02/19
 */
public class Student {
    private String name;
    public int age;

    public Student() {}

    private Student(String name) {
    	this.name = name;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void method() {
    	System.out.println("private method...");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
