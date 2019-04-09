package prcatice_for;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("+"));
		contentPane.add(new JButton("-"));
		contentPane.add(new JButton("*"));
		contentPane.add(new JButton("/"));
//		contentPane.add(new JButton("Cancel"));
//		contentPane.add(new JButton("Enter"));
		
		setSize(350, 150);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
