package prcatice_for;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx(){
		// 창 이름
		setTitle("계산기");
		// 엑스 창 누르면 시스템 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// LEFT로 정렬되는 수평 간격 10, 수직 간격 10 픽셀인 FlowLayout 사용
		setLayout(new GridLayout(4,4,5,5));
//		setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));
		
	
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("/"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("*"));
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("-"));
		add(new JButton("C"));
		add(new JButton("0"));
		add(new JButton("="));
		add(new JButton("+"));
		MyMouseListener listner = new MyMouseListener();
		
		setSize(250,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}

class MyMouseListener implements MouseListener{
	public void mouseEntered(MouseEvent e) {
		JButton b= (JButton)e.getSource();
		b.setBackground(Color.darkGray);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
