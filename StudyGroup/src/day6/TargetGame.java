package day6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TargetGame extends JFrame{
	public TargetGame() {
		setTitle("TargetGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		setContentPane(c);
//		c.setLayout(new FlowLayout());
		c.setLayout(null);
		
		// target 이미지
		ImageIcon targetsource = new ImageIcon("C:\\ad\\엄유리\\자바\\그룹스터디\\day6\\target.jpg");
	    Image targetbefore = targetsource.getImage();
	    Image targetafter = targetbefore.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
	    ImageIcon targetIcon= new ImageIcon(targetafter);
	    JLabel targetLabel = new JLabel(targetIcon, SwingConstants.LEFT);
	    targetLabel.setLocation(0, 0);
	    targetLabel.setSize(80,80);
	    // 총알 이미지
	    ImageIcon bulletsource = new ImageIcon("C:\\ad\\엄유리\\자바\\그룹스터디\\day6\\bullet.png");
	    Image bulletbefore = bulletsource.getImage();
	    Image bulletafter = bulletbefore.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	    ImageIcon bulletIcon= new ImageIcon(bulletafter);
	    JLabel bulletLabel = new JLabel(bulletIcon, SwingConstants.LEFT);
	    bulletLabel.setLocation(200, 200);
	    bulletLabel.setSize(20,20);
	    // 발사대 이미지
	    ImageIcon launchersource = new ImageIcon("C:\\ad\\엄유리\\자바\\그룹스터디\\day6\\launcher.jpg");
	    Image launcherbefore = launchersource.getImage();
	    Image launcherafter = launcherbefore.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	    ImageIcon launcherIcon= new ImageIcon(launcherafter);
	    JLabel launcherLabel = new JLabel(launcherIcon, SwingConstants.LEFT);
	    launcherLabel.setLocation(300, 300);
	    launcherLabel.setSize(50,50);
	    
	    
	    
	    
	    c.add(targetLabel);
	    c.add(bulletLabel);
	    c.add(launcherLabel);
	    setSize(500, 500);
	    setVisible(true);
	}

	public static void main(String[] args) {
		new TargetGame();

	}

}
