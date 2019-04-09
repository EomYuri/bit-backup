package socket;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerEx extends JFrame {

    Container con = null;
    JTextField tf = new JTextField();
    JTextArea ta = new JTextArea();
    JButton bt = new JButton();
    JScrollPane sp = null;
    ArrayList<Socket> list = new ArrayList<>();
    InetAddress address;

    public static void main(String[] args) {
        new ServerEx();
    }

    ServerSocket listener = null;
    Socket socket = null;


    public ServerEx() {

        setTitle("서버 채팅창");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = getContentPane();
        setSize(300, 440);
        con.setSize(300, 440);

        con.setBackground(Color.white);
        setVisible(true);

        setLayout(null);

        sp = new JScrollPane(ta);
        sp.setSize(265, 300);
        sp.setLocation(10, 10);

        tf.setSize(200, 70);
        tf.setLocation(10, 320);

        bt = new JButton("전송");
        bt.setSize(60, 40);
        bt.setLocation(215, 335);

        con.add(tf);
        con.add(bt);
        con.add(sp);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bt) {//전송버튼 눌렀을 경우
                    //메세지 입력없이 전송버튼만 눌렀을 경우
                    if (tf.getText().equals("")) {
                        return;
                    }

                    String message = tf.getText();
                    ta.append(message +
                            "\n");
                    for (int i = 0; i < list.size(); i++) {
                        Thread sendThread = new Thread(new SendThread(list.get(i), con, tf, ta, bt, sp, message));
                        sendThread.start();
//               tf.requestFocus();
                    }
                    System.out.println("텍스트 초기화");
                    tf.setText("");

                }


            }
        });

        tf.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyChar() == KeyEvent.VK_ENTER) {
                    if (tf.getText().equals("")) {
                        return;
                    }
                    String message = tf.getText();
                    ta.append(message +
                            "\n");
                    for (int i = 0; i < list.size(); i++) {
                        Thread sendThread = new Thread(new SendThread(list.get(i), con, tf, ta, bt, sp, message));
                        sendThread.start();
//               tf.requestFocus();
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

        try {
            // 서버 소켓 생성
            listener = new ServerSocket(9999);
            while (true) {
                // 클라이언트로부터 연결 요청 대기
                ta.append("<<연결을 기다립니다>>" + "\n");
                //         System.out.println("<<연결을 기다립니다>>");

                socket = listener.accept();
                list.add(socket);
                ta.append(" -------------------------연결됨-------------------------" + "\n");
                address = socket.getInetAddress();
                ta.append(address + "의 주소가 연결 되었습니다.\n");

                // 접속 클라이언트 arraylist에 추가
//         Socket socket = new Socket(this);

                Thread recThread = new Thread(new ServerReceive(socket, con, tf, ta, bt, sp, list));

                //         Thread sendThread = new Thread(new SendThread(socket));


                recThread.start();
                //         sendThread.start();
            }
        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
        }


//      tf.addFocusListener(new FocusAdapter() {
//         public void focusGained(FocusEvent e) {
//         tf.setText("");
//         }
//         
//         
//      });
    }
}


//         // 클라이언트로부터의 입력 스트림
//         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//         // 키보드로부터의 입력 스트림
//         stin = new BufferedReader(new InputStreamReader(System.in));
//         // 클라이언트로의 출력 스트림
//         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//         String inputMessage;
//         while(true) {
//            // 클라이언트에서 한행의 문자열 읽음
//            inputMessage = in.readLine();
//            // 클라이언트가 "bye"를 보내면 연결 종료
//            if(inputMessage.equalsIgnoreCase("bye"))
//               break;
//            // 클라이언트가 보낸 메세지 화면에 출력
//            System.out.println("클라이언트>" + inputMessage + "\n");
//            // 키보드에서 한 행의 문자열 읽음
//            String outputMessage = stin.readLine();
//            // 키보드에서 읽은 문자열 전송
//            out.write("서버>" + outputMessage + "\n");
//            out.flush();
//         }
//      }catch(IOException e) {
//         System.err.println("Error:" + e.getMessage());
//      }finally {
//         try {
//            // 클라이언트와 통신용 소켓 닫기
//            socket.close();
//            // 서버 소켓 닫기
//            listener.close();
//         }catch(IOException e) {
//            System.err.println("Error: " + e.getMessage());
//         }
//      }
//
//   }
//
//}