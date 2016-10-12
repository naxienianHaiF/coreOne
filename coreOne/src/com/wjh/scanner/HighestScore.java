package com.wjh.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ��ʦ��֪����ĳĳͬѧ���У�������ߵ��Ƕ��٣�����������ģ����ʦ��ѯ�ʡ�
 * ��Ȼ����ʦ��ʱ����Ҫ����ĳλͬѧ�ĳɼ�. 
 * @author WJH
 *
 */
public class HighestScore {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			List<Integer> list=new ArrayList<Integer>();
			//�ڶ��а���N��������������N��ѧ���ĳ�ʼ�ɼ������е�i��������IDΪi��ѧ���ĳɼ�
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
