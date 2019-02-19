package com.wjh.reflection;

import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws Exception {
		Class<?> c1 = Class.forName("com.wjh.reflection.Student");
		Student student = (Student) c1.newInstance();
		
		Method[] methods = c1.getMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}

		System.out.println(">>>>>>>>>");
		Method[] methods2 = c1.getDeclaredMethods();
		for (Method m : methods2) {
			System.out.println(m.getName());
		}

		System.out.println(">>>>>>>>>");
		Method method = c1.getDeclaredMethod("method");// 获取指定方法，包括私有方法
		/*不设置就会报错 Class com.wjh.reflection.MethodDemo 
		 * can not access a member of class 
		 * com.wjh.reflection.Student with 
		 * modifiers "private"
		 */
		method.setAccessible(true);// 获取私有权限
		method.invoke(student, null);
//		method.invoke(student);
	}
}
