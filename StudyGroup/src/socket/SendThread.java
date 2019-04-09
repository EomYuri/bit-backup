package socket;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class SendThread extends JFrame implements Runnable{
	   BufferedReader in = null;
	   BufferedReader stin = null;
	   BufferedWriter out = null;
	   Socket socket;

	   Container con = null;
	   JTextField tf = null;
	   JTextArea ta  = null;
	   JButton bt  = null;
	   JScrollPane sp = null;

	   String message = null;

	   public SendThread(Socket socket) throws HeadlessException {
	      super();
	      this.socket = socket;
	   }


	   public SendThread(Socket socket, Container con, JTextField tf, JTextArea ta, JButton bt, JScrollPane sp, String message)
	         throws HeadlessException {
	      super();
	      this.socket = socket;
	      this.con = con;
	      this.tf = tf;
	      this.ta = ta;
	      this.bt = bt;
	      this.sp = sp;
	      this.message = message;
	   }

	   @Override
	   public void run() {
	      try {
	         System.out.println("샌더쓰레드 시작");
	         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

//	         String message = tf.getText();
//	         ta.append(message+
//	               "\n");
	         out.write(">" + message + "\n");
	         out.flush();
	         sp.getVerticalScrollBar().setValue(sp.getVerticalScrollBar().getMaximum());
	         System.out.println("샌더쓰레드 종료");

	      }catch(IOException e) {
	         System.err.println("Error:" + e.getMessage());
	      }


	      

	   }

	}