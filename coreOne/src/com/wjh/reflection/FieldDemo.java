package com.wjh.reflection;

import java.lang.reflect.Field;

/**
 * @author JHW
 * @date created at 2019/02/19
 */
public class FieldDemo {

    public static void main(String[] args) throws Exception {
        Class<?> c1 = Class.forName("com.wjh.reflection.Student");
        Class<?> c2 = Student.class;
        Class<?> c3 = new Student().getClass();
        
        Student student = (Student)c1.newInstance();
        student.setName("private field...");

        //获取公开访问属性
        Field field = c1.getField("age");
        System.out.println(field);
        System.out.println(field.getName());
        System.out.println(field.getType());
        
        //获取私有属性
        Field name = c1.getDeclaredField("name");
        //不设置也可以获取到私有属性
        name.setAccessible(true);
        System.out.println(name);
        //修改私有属性的值
        System.out.println("the value is: " +name.get(student));
        name.set(student, "update private field value...");
        System.out.println("update the value is: " +name.get(student));
        
        System.out.println(">>>>>>>>>");
        Field[] fields = c1.getDeclaredFields();
        for (Field f: fields) {
        	System.out.println(f);
        }
        
        
        
    }
}
