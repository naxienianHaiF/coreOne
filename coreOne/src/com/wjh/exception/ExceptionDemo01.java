package com.wjh.exception;

public class ExceptionDemo01 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			try {
				int a=10;
				int b=0;
				System.out.println(a/b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			String str=null;
			System.out.println(str.substring(1));
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("WJH");
		
		String str=null;
		if (str==null) {
			throw new NullPointerException("ø’÷∏’Î“Ï≥£");
		}
	}
}
