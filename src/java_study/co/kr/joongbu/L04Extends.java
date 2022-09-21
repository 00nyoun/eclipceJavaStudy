package java_study.co.kr.joongbu;
//프로그래밍과 객체와 타입 재사용과 유지 보수

//객체지향 문법을 사용하지 않고 자동차 구현.
//계획 : 기능구현(앞으로, 뒤로 움직여/ 멈춰 / 시동 끄고 켜 / 어쩌구~~ : 동작->메소드 //// 바퀴/타이어/와이퍼/패달/핸들 .... 재원->필드) 
//필드(field), 프로퍼티(property), 속성(attribute)
//재원이 있고 동작하는 것을 객체라 함. 이런 객체의 설계도를 타입이라 함.

//난 (리)코더다.....
class 소리{
	
}
class 엔진{
	int 휘발류;
	int bpm;
	소리 부르릉 = new 소리(); 
	class 소리{
		String s="꽥꽥";
	}
}

class BmwS3 extends 엔진{
	public String name="bmw 3시리즈";
	public 엔진 en = new 엔진();
	class 바퀴{}
	class 타이어{}
	class 브레이크패달{
		int press; //필드는 기본값이 0임. 기본형은 0, 참조형은 null
	}
	class 핸들{
		int turn; //-왼쪽 // +오른쪽
	}
	class 악셀{
		int press;
	}
	class 엔진{
		int 휘발류;
		int bpm;
		소리 부르릉 = new 소리(); 
		class 소리{
			String s="꽤꽥";
		}
		
	}
	
	public void move() {}
	public void turn() {}
	public void stop() {}
}
class BmwS5{
	public String name="bmw 3시리즈";
	
	class 바퀴{}
	class 타이어{}
	class 브레이크패달{
		int press; //필드는 기본값이 0임. 기본형은 0, 참조형은 null
	}
	class 핸들{
		int turn; //-왼쪽 // +오른쪽
	}
	class 악셀{
		int press;
	}
	class 엔진{
		int 휘발류;
		int bpm;
		int a;
		소리 부르릉 = new 소리(); 
		class 소리{}
	}
	
	public void move() {}
	public void turn() {}
	public void stop() {}
}
class BmwS7{
	public String name="bmw 3시리즈";
	
	class 바퀴{
		int 반지름=20;
	}
	class 타이어{}
	class 브레이크패달{
		int press; //필드는 기본값이 0임. 기본형은 0, 참조형은 null
	}
	class 핸들{
		int turn; //-왼쪽 // +오른쪽
	}
	class 악셀{
		int press;
	}
	class 엔진{
		int 휘발류;
		int bpm;
		int a;
		int b;
		소리 부르릉 = new 소리(); 
		class 소리{}
	}
	
	public void move() {}
	public void turn() {}
	public void stop() {}
}

public class L04Extends {
	public static void main(String[] args) {

	}

}
