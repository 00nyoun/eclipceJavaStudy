package java_study.co.kr.joongbu;

import java.time.LocalTime;
import java.util.Scanner;

class Clock implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
				
		}
	}

}

public class L09MultiTread {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		Clock clock = new Clock();
		Thread clockThread = new Thread(clock);//스레드를 run에 기반한 코드로 생성하는 객체.
		clockThread.start();//start():스레드 생성하는 함수
		
		System.out.println("멀티 스레드 환경이면 실행되는 코드.4");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			System.out.println("you said: "+line);
		}
		
	}

}
