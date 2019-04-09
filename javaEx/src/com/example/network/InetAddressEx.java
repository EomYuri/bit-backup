package com.example.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

   public static void main(String[] args) {
      printServerIp("www.naver.com");
      printServerIp("www.google.com");
      
   }

   private static void printServerIp(String hostName) {
      // 내 IP 주소 확인
      try {
         InetAddress localhost = InetAddress.getLocalHost();
         System.out.println("local IP: " + localhost.getHostAddress());
         
         // 서버 IP를 확인
         InetAddress[] adrs = InetAddress.getAllByName(hostName);
         for(InetAddress remote : adrs) {
            System.out.printf("host : %s -> %s%n", hostName , remote.getHostAddress());
         }
      }catch(UnknownHostException e) {
         System.out.println("그런 호스트 없음 : " +e.getMessage());
      }
      
   }
}