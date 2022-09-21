package java_study.co.kr.joongbu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class L11Swing {
	static boolean start=true;
	public static void main(String[] args) {
		//JFrame Swing GUI를 제공하는 객체
		//java : 플랫폼에 독립적.
		JFrame frame = new JFrame("swing frame");
		JButton btn = new JButton("시간 출력");
		JButton btn2 = new JButton("멈춤");
		JLabel label = new JLabel("현재시간 출력");
		label.setFont(new Font("Serif",Font.BOLD,20));
		//boolean start = true;
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!start)start=true;
				new Thread(()->{while(start) {
					
					System.out.println("버튼이 눌림");
					String now=LocalTime.now().toString();
					label.setText(now);
					try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				}}).start();
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		//frame은 기본 레이아웃이 지정되어 있음.
		//
		frame.setLayout(null);
		btn.setBounds(0,0,100,80);
		btn2.setBounds(150,0,100,80);
		label.setBounds(0,100,300,100);
		
		frame.add(btn);
		frame.add(btn2);
		frame.add(label);
		frame.setBounds(0,100,300,200);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
