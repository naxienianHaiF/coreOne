package com.wjh.http;

import java.io.BufferedReader;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.net.URL;  
import java.net.URLConnection;  
  
public class HttpPostTest1 {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
         
        String url = "http://120.55.174.144:7106/";  
        HttpPostTest1 tmi = new HttpPostTest1();  
        tmi.testPost(url);
    }  
      
    /** 
     * 用传统的URI类进行请求 
     * @param urlStr 
     */  
    public void testPost(String urlStr) {  
        try {  
            URL url = new URL(urlStr);  
            URLConnection con = url.openConnection();  
            con.setDoOutput(true);  
            con.setRequestProperty("Pragma:", "no-cache");  
            con.setRequestProperty("Cache-Control", "no-cache");  
            con.setRequestProperty("Content-Type", "text/xml");  
            con.setRequestProperty("charset", "utf-8");
            
            
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());      
            String xmlInfo = getXmlInfo();  
            System.out.println("urlStr=" + urlStr); 
            out.write(xmlInfo);
            out.flush();  
            out.close();  
            BufferedReader br = new BufferedReader(new InputStreamReader(con  
                    .getInputStream(),"utf-8"));  
            String line = "";  
            for (line = br.readLine(); line != null; line = br.readLine()) {  
                System.out.println(line);  
//                if(line.contains("modelCode")){
//                	String[] str=line.split("[<>]");
//                	System.out.println(str[2]);
//                }
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    private String getXmlInfo() {  
        StringBuilder sb = new StringBuilder();  
        sb.append("<?xml version='1.0' encoding='UTF-8'?>");  
        sb.append("<request>");  
        sb.append("<requestHead>");  
        sb.append("<consumerSeqNo>ZHKJ151282201507210000000001</consumerSeqNo>");  
        sb.append("<consumerID>zhihuikeji</consumerID>");  
        sb.append("<requestType>CarModelInfoInquiry</requestType>");  
        sb.append("<passWord></passWord>");  
        sb.append("<channelType>01</channelType>");  
        sb.append("<product>01</product>");  
        sb.append("<regionCode>310000</regionCode>");  
        sb.append("<version></version>");  
        sb.append("</requestHead>");  
        sb.append("<requestBody>");  
        sb.append("<licenseNo>京C34567</licenseNo>"); 
        
        sb.append("<engineNo></engineNo>");
        sb.append("<frameNo>F01020304</frameNo>");
        sb.append("<vinNo>F01020304</vinNo>");
        sb.append("<vehicleBrand>大众</vehicleBrand>");
        sb.append("<vehicleModel>大众桑塔纳</vehicleModel>");
        sb.append("<enrollDate>2012-10-11</enrollDate>");
        sb.append("<carkindcode></carkindcode>"); 
        sb.append("<startdate>2015-10-01</startdate>"); 
        sb.append("<industryModelCode></industryModelCode>");
        sb.append("<carType2></carType2>");
        sb.append("<carType3></carType3>");
        sb.append("<replacement></replacement>");
        sb.append("<carBookingTime></carBookingTime>");
        
        sb.append("</requestBody>");
        sb.append("</request>");
        
        
        return sb.toString();  
    }  
}  