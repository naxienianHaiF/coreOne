package com.wjh.exception;

public class WJHTest {

	public static void main(String[] args){
		try {
			throw new WJHException("自定义异常");
		} catch (WJHException e) {
			e.printStackTrace();
		}
	}
}
