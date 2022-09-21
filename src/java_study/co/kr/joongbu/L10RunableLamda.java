package java_study.co.kr.joongbu;

import java.time.LocalTime;

public class L10RunableLamda {
	public static void main(String[] args) {
		//인터페이스 객체 생성 방법. ==> 인터페이스 생성과 동시에 추상메서드 구현.
		Thread clockThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.println(LocalTime.now());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		clockThread.start();//
		System.out.println("main thread");
	}

}
