package com.wjh.reflection;

import java.lang.reflect.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) throws Exception{
		Class<?> c1 = Class.forName("com.wjh.reflection.Student");

		Constructor<?>[] cs = c1.getDeclaredConstructors();
		for (Constructor c : cs) {
			System.out.println(c);
		}
		
		System.out.println("new Object...");
		Student student = (Student)cs[1].newInstance("constructor",12);
		System.out.println(student);
	}
}
