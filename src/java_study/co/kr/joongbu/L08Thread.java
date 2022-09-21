package java_study.co.kr.joongbu;

import java.time.LocalTime;
import java.util.Scanner;

public class L08Thread {
	public static void main(String[] args) {
		//스레드(Thread) : main메소드가 1개 가지고있음.(순차적언어//main에 작성한 코드가 순서대로 1개씩 실행됨.)
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		boolean start = true;
		
		while(start) {
			System.out.println(LocalTime.now());//스레드 1초 동안 대기
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
//		Scanner sc=new Scanner(System.in);
//		String linr=sc.nextLine();//콘솔창에 엔터 입력 대기.(스레드 독점)
		System.out.println("4");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			System.out.println("you said: "+line);
		}
		//동시에 여러가지 일을 하려면 thread가 여러개있어야함.
	}

}
