package com.ajia;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("������������");
          double height =scan.nextDouble();
          System.out.println("�������������");
          double weight =scan.nextDouble();
          double BMI=weight/(height*height);
          if(BMI<18.5){
        	  System.out.println("���ع���");
          }else if(BMI<24){
        	  System.out.println("��������");
          }else if(BMI<27){
        	  System.out.println("���ع���");
          }else if(BMI<30){
        	  System.out.println("�е���");
          }else if(BMI<35){
        	  System.out.println("�жȷ���");
          }else if(BMI>35){
        	  System.out.println("������");
          }
          
          
	}
}
