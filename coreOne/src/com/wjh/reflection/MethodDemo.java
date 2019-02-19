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
		Method method = c1.getDeclaredMethod("method");// ��ȡָ������������˽�з���
		/*�����þͻᱨ�� Class com.wjh.reflection.MethodDemo 
		 * can not access a member of class 
		 * com.wjh.reflection.Student with 
		 * modifiers "private"
		 */
		method.setAccessible(true);// ��ȡ˽��Ȩ��
		method.invoke(student, null);
//		method.invoke(student);
	}
}
