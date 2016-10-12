package com.wjh.scanner;

import java.util.Scanner;

public class NextInt {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int a=sc.nextInt();
			System.out.print(a+" ");
		}
		
		sc.close();
	}
}
