package com.wjh.exception;

public class WJHTest {

	public static void main(String[] args){
		try {
			throw new WJHException("�Զ����쳣");
		} catch (WJHException e) {
			e.printStackTrace();
		}
	}
}
