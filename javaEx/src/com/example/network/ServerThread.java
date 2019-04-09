package com.example.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {
	// 필드
	private Socket socket;
	
	// 생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
		
	}
	
	public void run() {
		 try {
	         // 클라이언트 정보 확인
	         InetSocketAddress client = (InetSocketAddress)socket.getRemoteSocketAddress();
	         System.out.println("[SERVER] 클라이언트가 접속");
	         System.out.printf("[SERVER] 클라이언트 IP : %s, 포트 : %d%n", client.getAddress(), client.getPort());
	         
	         // 통신소켓 이용 데이터 송수신
	         // 클라이언트 메세지 수신
	         InputStream is = socket.getInputStream();
	         Reader isr = new InputStreamReader(is, "UTF-8");
	         BufferedReader br = new BufferedReader(isr);
	         
	         OutputStream os = socket.getOutputStream();
	         Writer osw = new OutputStreamWriter(os, "UTF-8");
	         BufferedWriter bw = new BufferedWriter(osw);
	         
	         String message;
	         
	         while(true) {
	            message = br.readLine();
	            
	            if(message == null) {
	               System.out.println("[클라이언트 접속 종료]");
	               break;
	            }
	            System.out.println("[수신 메세지] : "+ message);

	            // 클라이언트로 응답을 보내줍니다.

	            bw.write("Echo Back -> " + message);
	            bw.newLine();
	            bw.flush();
	         }
	         bw.close();
	         
	         System.out.println("<서버 종료>");
	      }catch(IOException e) {
	         System.out.println("IOException :" +e.getMessage());
	      }finally {
	      }
	
	}

}
