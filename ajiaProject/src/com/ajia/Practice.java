package com.ajia;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("请输入你的身高");
          double height =scan.nextDouble();
          System.out.println("请输入你的体重");
          double weight =scan.nextDouble();
          double BMI=weight/(height*height);
          if(BMI<18.5){
        	  System.out.println("体重过轻");
          }else if(BMI<24){
        	  System.out.println("体重正常");
          }else if(BMI<27){
        	  System.out.println("体重过重");
          }else if(BMI<30){
        	  System.out.println("有点胖");
          }else if(BMI<35){
        	  System.out.println("中度肥胖");
          }else if(BMI>35){
        	  System.out.println("死胖子");
          }
          
          
	}
}
