package day6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ShootingGame extends JFrame {
	int cnt;
//	Thread th;

	Container con = null;

	ImageIcon starget = null;
	Image btarget = null;
	Image atarget = null;
	ImageIcon targetcon = null;
	JLabel target = null;

	ImageIcon sbullet = null;
	Image bbullet = null;
	Image abullet = null;
	ImageIcon bulletcon = null;
	JLabel bullet = null;

	ImageIcon slauncher = null;
	Image blauncher = null;
	Image alauncher = null;
	ImageIcon launchercon = null;
	JLabel launcher = null;

	ImageIcon scrash = null;
	Image bcrash = null;
	Image acrash = null;
	ImageIcon crashcon = null;
	JLabel crash = null;

	public static void main(String[] args) {
		new ShootingGame();
	}

	public ShootingGame() {

		con = getContentPane();
		setTitle("ShootingGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		con.setSize(500, 500);
		
		con.setBackground(Color.white);
		setVisible(true);

		
		con.setLayout(null);

		starget = new ImageIcon("C:\\ad\\엄유리\\자바\\그룹스터디\\day6\\target.jpg");
		btarget = starget.getImage();
		atarget = btarget.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		targetcon = new ImageIcon(atarget);
		target = new JLabel(targetcon, SwingConstants.LEFT);
		target.setSize(100, 100);
		target.setLocation(0, 0);

		sbullet = new ImageIcon("C:\\ad\\엄유리\\자바\\그룹스터디\\day6\\bullet.png");
		bbullet = sbullet.getImage();
		abullet = bbullet.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		bulletcon = new ImageIcon(abullet);
		bullet = new JLabel(bulletcon, SwingConstants.LEFT);
		bullet.setSize(40, 40);
		bullet.setLocation(220, 500);
		bullet.setVisible(false);

		slauncher = new ImageIcon("C:\\ad\\엄유리\\자바\\그룹스터디\\day6\\launcher.jpg");
		blauncher = slauncher.getImage();
		alauncher = blauncher.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		launchercon = new ImageIcon(alauncher);
		launcher = new JLabel(launchercon, SwingConstants.LEFT);
		launcher.setSize(100, 100);
		launcher.setLocation(200, 350);
		
		scrash = new ImageIcon("C:\\ad\\엄유리\\자바\\그룹스터디\\day6\\crash.png");
		bcrash = scrash.getImage();
		acrash = bcrash.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		crashcon = new ImageIcon(acrash);
		crash = new JLabel(crashcon, SwingConstants.LEFT);
		crash.setSize(100, 100);
//		crash.setLocation(200, 400);

		con.add(target);
		con.add(bullet);
		con.add(launcher);
		//        con.add(crash);

		Thread targetThread = new Thread(new TargetThread());
		targetThread.start();

		
		launcher.requestFocus();
		launcher.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent ke) {
				if(ke.getKeyChar()==KeyEvent.VK_ENTER) {
					Thread bulletThread = new Thread(new BulletThread());
					bullet.setVisible(true);
					bullet.setLocation(220, 500);
					bulletThread.start();
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});


	}


	class TargetThread implements Runnable {
		public void run() {
			//        	if((target.getX()<= bullet.getX())&& (bullet.getX()<=target.getX()+100)
			//            		&&(target.getY()<= bullet.getY())&& (bullet.getY()<=target.getY()+100)) {
			//        		boolean hit = true;
			boolean finish = true;
			launcher.setLocation(launcher.getX(), launcher.getY()+1);

			while (true) {
				try {
					
//					target.setLocation(target.getX() + 5, target.getY());
//					Thread.sleep(20);
					
					if(finish == true) {
						//                    if(target.getX()>500) {
						target.setLocation(target.getX() + 5, target.getY());
						Thread.sleep(20);
						if(target.getX()>=400) {
							finish = false;
						}
					}
					else if(finish ==false) { 
						target.setLocation(target.getX() - 5, target.getY());
						Thread.sleep(20);
						if(target.getX()<=0) {
							finish = true;
						}
					}
					if((target.getX()<= bullet.getX())&& (bullet.getX()<=target.getX()+100)
							&&(target.getY()<= bullet.getY())&& (bullet.getY()<=target.getY()+100)) {
						target.setVisible(false);
						con.add(crash);
						crash.setLocation(target.getX(), target.getY());
						crash.setVisible(true);
						Thread.sleep(3000);
						crash.setVisible(false);
						target.setVisible(true);
						target.setLocation(0, 0);
						
					}

				} catch (InterruptedException e) {
					System.err.println("Error:" + e.getMessage());
				}
			}
		}

	}
	class BulletThread implements Runnable {
		public void run() {
			while (true) {
				try {
					bullet.setLocation(bullet.getX(), bullet.getY() - 10);
					Thread.sleep(20);
//					if (bullet.getY() == -5) {
//						bullet.setVisible(false);
//					}
					if((target.getX()<= bullet.getX())&& (bullet.getX()<=target.getX()+100)
							&&(target.getY()<= bullet.getY())&& (bullet.getY()<=target.getY()+100)) {
						bullet.setVisible(false);
						Thread.sleep(300);
					}
				} catch (InterruptedException e) {
					System.err.println("Error:" + e.getMessage());
				}
			}
		}


	}
}
