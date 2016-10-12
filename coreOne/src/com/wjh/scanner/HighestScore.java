package com.wjh.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。
 * 当然，老师有时候需要更新某位同学的成绩. 
 * @author WJH
 *
 */
public class HighestScore {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			List<Integer> list=new ArrayList<Integer>();
			//第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
			String s=scanner.nextLine();
			int n=Integer.parseInt(s.split("\\s+")[0]);
			int m=Integer.parseInt(s.split("\\s+")[1]);
			int[] origin=new int[n];
			String input=scanner.nextLine();
			String[] iString=input.split("\\s+");
			for(int i=0;i<n;i++){
				origin[i]=Integer.parseInt(iString[i]); 
			}
			for(int i=0;i<m;i++){
				String string=scanner.nextLine();
				String[] str=string.split("\\s+");
				int start=Integer.parseInt(str[1]);
				int value=Integer.parseInt(str[2]);
				if ("U".equals(str[0])) {
					origin[start-1]=value;
				}
				if ("Q".equals(str[0])) {
					int min=(start<value)?start:value;
					int end=(start>value)?start:value;
					int max=origin[min-1];
					for(int j=min;j<=end-1;j++){
						if(max<origin[j]){
							max=origin[j];
						}
					}
					list.add(max);
				}
			}
			for(Integer i:list){
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
