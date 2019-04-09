package com.example.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionEx {

   public static void main(String[] args) {
//       arithException();
//      nullPointerException();
//      arrayException();
      throwsException();
   }

   // throws로 전달된 Exception 처리하기
   private static void throwsException() {
      ThrowsException except = new ThrowsException();
      try {
         except.executeException();
      }catch(IOException e) {
         System.out.println("예외발생" + e.getMessage());
      }
      try {
         except.executeRuntimeException();
      }catch(RuntimeException e) {
         System.out.println("런타임 예외발생:" + e.getMessage());
      }
      
      try {
         except.executeCustomException(100, 2);
         except.executeCustomException(100, 0);
      }catch (CustomArithmeticException e) {
         System.out.println("사용자 정의 오류발생");
         System.out.println("첫번째 나눈 숫자 :"+e.getNum1());
         System.out.println("두번째 나눈 숫자 :"+e.getNum2());
         
      }
      
   }
   
   //ArrayIndexOutOfBoundsException 예제
   private static void arrayException() {
      int[]array = new int [] {3,6,9};
      try {
         System.out.println(array[4]);
      }catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("배열의 인덱스를 벗어났어요.");
         System.out.println("인덱스 : " + e.getMessage());
      }
   }

   // NullPointerException 예제
   private static void nullPointerException() {
      String str = new String("HEllo Java");

      str =null;
      try {
         System.out.println(str.toUpperCase());
      }catch(NullPointerException e) {
         System.out.println("객체가 할당되지 않았습니다.");
      } catch (Exception e) {
         // 혹시 처리 되지 않은 Exception 처리용
         e.printStackTrace();
      }
   }

   // ArithmeticException 예제
   private static void arithException() {
      // Scanner로 부터 정수를 입력
      // 100 을 입력받은 정수로 나누기
      double result = 0 ;
      int num;

      Scanner sc = new Scanner(System.in);
      try{
         num = sc.nextInt();
         result = 100/ num;
      } catch(ArithmeticException e)
      {
         System.out.println("0으로는 나눌 수 없어요.");
         System.out.println("Error Message : " + e.getMessage());
      } catch(Exception e)
      {
         e.printStackTrace();
      } finally {      //오류 여부 상관 없이 최종 1회 실행
         System.out.println("예외처리 완료!");
      }

      System.out.println(result);
      sc.close();
   }
}
