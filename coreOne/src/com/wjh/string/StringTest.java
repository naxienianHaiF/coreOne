package com.wjh.string;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		System.out.println(list.size()==0);
		String string="a b c   d   f h";
		StringBuffer result=new StringBuffer(); 
		String[] str=string.split("\\s+");
		for(int i=0;i<str.length;i++){
			if(i==str.length-1){
				result.append(str[i]);
			}else {
				result.append(str[i]).append("%");
			}
		}
		System.out.println(new String(result));
		for(int i=0;i<str.length;i++){
			if(i==str.length-1)
				System.out.println(str[i]);
			else {
				System.out.print(str[i]+"%");
			}
		}
		
		String string2="<modelCode></modelCode>";
		String[] str2=string2.split("[<>]");
		for(String s:str2)
			System.out.println(s);
		System.out.println("str2="+str2[2]);
		System.out.println(str2[2].length());
		System.out.println("=================================");
		String[] wjh="1 2 3 4 5".split("\\s+");
		for (String string3 : wjh) {
			System.out.print(string3+",");
		}
		System.out.println();
		System.out.println("=================================");
		test();
	}
	
	
	private static void test(){
		char c='ÖÐ';
		System.out.println(c);
		String a="ÖÐÎÄAXC 12 3";
		String[] strings=a.split("[a-z]");
		for(String s:strings)
			System.out.println(s);
	}
}
