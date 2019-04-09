package socket;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientEx extends JFrame{

	   Container con = null;
	   JTextField tf = new JTextField();
	   JTextArea ta = new JTextArea();
	   JButton bt = new JButton();
	   JScrollPane sp = null;
	   Socket socket;


	   public static void main(String[] args) {
	      new ClientEx();
	   }

	   public ClientEx() {

	      setTitle("클라이언트 채팅창");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      con = getContentPane();
	      setSize(300,440);
	      con.setSize(300,440);

	      con.setBackground(Color.white);
	      setVisible(true);

	      setLayout(null);

	      sp = new JScrollPane(ta);
	      sp.setSize(265,300);
	      sp.setLocation(10,10);

	      tf.setSize(200,70);
	      tf.setLocation(10,320);

	      bt = new JButton("전송");
	      bt.setSize(60,40);
	      bt.setLocation(215,335);

	      con.add(tf);
	      con.add(bt);
	      con.add(sp);


	      try {
	         // 클라이언트 소켓 생성
	         socket = new Socket("localhost", 9999);
	         ta.append(" -------------------------연결됨-------------------------"+"\n");

	         Thread recThread = new Thread(new ReceiveThread(socket, con, tf, ta ,bt, sp));
	         //         Thread sendThread = new Thread(new SendThread(socket, con, tf, ta ,bt, sp));

	         recThread.start();
	         //         sendThread.start();

	      }catch(IOException e) {
	         System.err.println("Error: " + e.getMessage());
	      }


	      bt.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            if(e.getSource()==bt){//전송버튼 눌렀을 경우
	               //메세지 입력없이 전송버튼만 눌렀을 경우
	               if(tf.getText().equals("")){
	                  return;
	               }

	               String message = tf.getText();
	               ta.append(message+
	                     "\n");

	               Thread sendThread = new Thread(new SendThread(socket, con, tf, ta ,bt, sp, message));
	               sendThread.start();

	               System.out.println("텍스트 초기화");
	               tf.setText("");

	            }

	         }

	      });

	      tf.addKeyListener(new KeyListener() {

	         @Override
	         public void keyTyped(KeyEvent e) {


	         }

	         @Override
	         public void keyReleased(KeyEvent ke) {
	            if(ke.getKeyChar()==KeyEvent.VK_ENTER) {
	               if(tf.getText().equals("")){
	                  return;
	               }else {

	                  String message = tf.getText();
	                  ta.append(message+
	                        "\n");
	                  Thread sendThread = new Thread(new SendThread(socket, con, tf, ta ,bt, sp, message));
	                  sendThread.start();
	               }

	               System.out.println("텍스트 초기화");
	               tf.setText("");
	            }

	         }

	         @Override
	         public void keyPressed(KeyEvent e) {
	            // TODO Auto-generated method stub

	         }
	      });
	   }
	}