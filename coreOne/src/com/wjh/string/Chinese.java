package com.wjh.string;

import org.junit.Test;

public class Chinese {

	@Test
	public void chinese(){
		String vehicleBrand="";
		String regex="[\\u4e00-\\u9fa5]+";
		String modelName="Âí×Ô´ïCAF7202";
		for(int i=0;i<modelName.length();i++){
			String s=new String(modelName.substring(0, i+1));
			if(s.matches(regex)){
				vehicleBrand=s;
			}
		}
		//测试github的pull功能
		//pull 是在网页修改程序代码后更新到电脑本地的文件上
		System.out.println(vehicleBrand);
		System.out.println(modelName.substring(vehicleBrand.length()));
	}
}
