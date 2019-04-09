package com.example.javaex.var;

import java.util.Scanner;

public class BooleanEx {
 public static void main(String[] args) {
  Scanner rd = new Scanner(System.in);

  System.out.println("두점으로 구성된 직사각형이 있습니다.");
  System.out.println("한점을 구성하는(x,y)가 직사각형 안에 있는지를 판별합니다.");
  
  System.out.print("직사각형을 구성하는 x1값을 입력하세요.:");
  int x = rd.nextInt();
  System.out.print("직사각형을 구성하는 y1값을 입력하세요.:");
  int y = rd.nextInt();

  System.out.print("직사각형을 구성하는 x2값을 입력하세요.:");
  int x2 = rd.nextInt();
  System.out.print("직사각형을 구성하는 y2값을 입력하세요.:");
  int y2 = rd.nextInt();
  
  System.out.println("("+x+","+y+")"+"("+x2+","+y2+")로 구성된 직사각형이 만들어졌습니다.");
  
  System.out.print("한점을 구성하는 x값을 입력하세요.:");
  int a = rd.nextInt();
  
  System.out.print("한점을 구성하는 y값을 입력하세요.:");
  int b = rd.nextInt();
  
  if((x2<=a)&&(a<=x) || ((x<=a)&&(a<=x2)) && ((y2<=b)&&(b<=y)) || ((y<=b)&&(b<=y2))){
   System.out.println(a+","+b+"는 직사각형 안에 포함됩니다.");
  }
  else{
   System.out.println(a+","+b+"는 직사각형 안에 포함되지 않습니다.");
  }
  
 }

}
