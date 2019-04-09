package day5;

//import java.util.Scanner;
//
//import javax.swing.JFrame;
//
////public class MyApp {
////
////	public static void main(String[] args) {
////		JFrame f = new JFrame();
////		f.setTitle("첫번째 프레임");
////		f.setSize(300,300);
////		f.setVisible(true);
////
////	}
////
////}
//public class MyApp extends JFrame{
//	MyApp(){
////		Scanner sc = new Scanner(System.in);
////		System.out.print("FrameTitle>>");
////		String title = sc.nextLine();
////		sc.nextLine();
////		setTitle(title);
////		System.out.print("x size>>");
////		int x = sc.nextInt();
////		System.out.print("y size>>");
////		int y = sc.nextInt();
////		setSize(x, y);
//		setTitle("첫번째 프레임");
//		setSize(300, 300);
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		MyApp ma = new MyApp();
//		
//	}
//}


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorApp extends JFrame implements ActionListener{
	public static void main(String[] args) {
		new CalculatorApp();

	}

	// 숫자창
	JTextField T1;
//	int a = 0;
	double bfNum, temp;
	double result;
	// oper: 사칙연산기호, tempInput:
	String oper, tempInput="";
	boolean finish = true;
	JButton Button[] = new JButton[16];

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		// 입력 판단, 실행
		if(input.equals("*")){
			bfNum = temp;
			oper = "*";
			tempInput = "";
		}else if(input.equals("/")) {
			bfNum = temp;
			oper = "/";
			tempInput = "";
		}else if(input.equals("+")) {
			bfNum = temp;
			oper = "+";
			tempInput = "";
		}else if(input.equals("-")) {
			bfNum = temp;
			oper = "-";
			tempInput = "";
		}else if(input.equals("c")) {
			tempInput = "";
			temp = 0;
			bfNum = 0;
			T1.setText("");
		}else if(input.equals("=")) {
			if(oper.equals("*")) {
				result = bfNum * temp;
				T1.setText(String.valueOf(result));
				finish = false;
			}else if(oper.equals("/")) {
				result = Math.round((bfNum / temp)*1000d)/1000d;
				T1.setText(String.valueOf(result));
				finish = false;
			}else if(oper.equals("+")) {
				result = bfNum + temp;
				T1.setText(String.valueOf(result));
				finish = false;
			}else if(oper.equals("-")) {
				result = bfNum - temp;
				T1.setText(String.valueOf(result));
				finish = false;
			}
		}else {
			if(finish) {
				T1.setText("0");
				finish = false;
				temp = 0;
				bfNum = 0;
				tempInput = "";
			}
			tempInput += e.getActionCommand();
			System.out.println(tempInput);
			T1.setText(tempInput);
			temp = Integer.parseInt(tempInput);
		}


	}


	public CalculatorApp() {
		super("계산기");

		super.setResizable(true);
		setLayout(new BorderLayout());
		// 타이틀
		setTitle("Calculator");
		// 프레임 크기
		setSize(250,300);
		// 프레임 종료버튼 누르면 프로그램 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 길이 매개변수 앞에 String형 데이터를 매개변수로 넣어주면 텍스트필드에 해당 텍스트가 미리 출력
		T1 = new JTextField("0", 15);
		// 사용제한
		//		T2.setEnabled(false);
		JPanel P1 = new JPanel(); 
		JPanel P2 = new JPanel();
		P1.add(T1);
		// 버튼만들기
		P2.setLayout(new GridLayout(4,4,10,10));
		String buttonNum[] = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "c", "0", "=", "-"};
		for(int i = 0; i < 16; i++){
			Button[i] = new JButton(buttonNum[i]);
			P2.add(Button[i]);
			Button[i].addActionListener(this);
//			Button[i].setBackground(Color.lightGray);
//			Button[i].setFont(new Font("굴림",Font.BOLD,18));
		}
		add(P1, BorderLayout.NORTH);
		add(P2, BorderLayout.CENTER);
		// setVisible 맨 아래에 두면 실행하자마자 화면이 보임
		setVisible(true);

	}



}
