package socket;

import java.awt.Container;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ReceiveThread extends JFrame implements Runnable{
   BufferedReader in = null;
   BufferedReader stin = null;
   BufferedWriter out = null;

   Socket socket;

   Container con = null;
   JTextField tf = null;
   JTextArea ta  = null;
   JButton bt  = null;
   JScrollPane sp = null;
   


   public ReceiveThread(Socket socket) throws HeadlessException {
      super();
      this.socket = socket;
   }


   public ReceiveThread(Socket socket, Container con, JTextField tf, JTextArea ta, JButton bt, JScrollPane sp)
         throws HeadlessException {
      super();
      this.socket = socket;
      this.con = con;
      this.tf = tf;
      this.ta = ta;
      this.bt = bt;
      this.sp = sp;
   }




   @Override
   public void run() {
      try {
         //클라이언트로부터의 입력 스트림
         System.out.println("리시버 시작");
         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         String inputMessage;
         while(true) {
            // 클라이언트에서 한행의 문자열 읽음
            inputMessage = in.readLine();
            if(inputMessage !=null) {
               ta.append(inputMessage + "\n");
            }else{
               break;
            }
            if(inputMessage.equalsIgnoreCase("bye"))
               break;

            sp.getVerticalScrollBar().setValue(sp.getVerticalScrollBar().getMaximum());
         }
      }catch(IOException e) {
         System.err.println("Error:" + e.getMessage());
      }

   }

}
