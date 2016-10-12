package com.wjh.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd hh:mm");
		String time=format.format(new Date());
		System.out.println(time);
		int index=time.lastIndexOf(":");
		String result=time.substring(0, index);
		System.out.println(result);
		System.out.println(result.length());
	}
}
