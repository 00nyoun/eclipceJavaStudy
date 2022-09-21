package java_study.co.kr.joongbu;

enum E{//열거형(type) E
	
}
@FunctionalInterface//추상메서드가 1개.
interface C{//type C
	void print();//추상메서드만 정의
}

abstract class B{//type B
	abstract public void print();//추상메서드를 정의할수있다.
}

class A{//Type A
	
}



public class L03Type {
	//static 필드: jvm이 코드를 실행할때 static으로 정의된 변수를 메소드 영역에서 생성.(보통 상수를 선언.)
	final int I=13; // 상수) 메소드 영역에 저장되는 static 필드 (변하지않은 정보)
	class InClass extends B{
		@Override
		public void print() {};
	}
	public static void main(String[] args) {
		final int I=13; // 상수) 지역에서 사용되는 바뀌지 않는 상수
		System.out.println(Integer.MAX_VALUE);
		A a =new A();
		//B b = new B();
		//C c = new C();
		//인터페이스와 추상클래스는 추상메서드가 있기 떄문에 객체로 생성할 수 없다.
		B b = new B() {//생성과 동시에 추상메서드를 구현하면 객체로 생성할 수 있다.
			//이때 이너 클래스가 생성되는데 숫자로 정의된 익명 클래스가 만들어짐.
			@Override
			public void print() {
				
			}
			
		};
		C c = new C() {//생성과 동시에 추상메서드를 구현하면 객체로 생성할 수 있다.
			
			@Override
			public void print() {
				
			}
		};
		B b2 = new L03Type().new InClass();//static 없을 시 
		B b2 = new InClass();//static 있을시.
		
		//람다식: 함수형 언어를 표방한 화살표함수로 작성된 객체.
		//자바에서 람다식을 작성하기 위해서는 인터페이스에 추상메서드가 1개 있을 경우 가능.
		//자바에서 함수를 매개변수로 사용할 수 없기 때문에 함수를 매개변수로 사용하려면 꼭 타입을 정의 해야함. 이것을 간편하게 하기 위해 람다식 사용.
		
		//함수를 객체로 사용하는거 아님 걍 그렇게 보이는거 뿐ㅇㅇ
		C c2 = ()->{}; //인터페이스에 추상메서드가 1개 있을 경우 람다식으로 객체를 생성할수있다.(함수형 언어 방식을 따름.)
		
		
	}

}
