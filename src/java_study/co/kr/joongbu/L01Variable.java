package java_study.co.kr.joongbu;

import java.util.ArrayList;

//class 이름규칙 : 파스칼 표기법(이름표기할때사용), 숫자로 시작하면 안된다.
public class L01Variable extends Object{//extends Object 디폴트값.
	//메소드 이름규칙 : 카멜표기법 사용. 숫자로 시작 금지.
	//main 메소드 규칙 : public(어디서든 접근 가능), static(스택에서 참조.) void 반환되는게 없음.(실행되는것 자체가 반환),
	//args = main이 실행될때 지정되는 기본값.
	public static void main(String[] args) {//파라미터(매개변수)
		
		for(String a:args) {//for-each or 향상된 for
			System.out.println(a);
		}
		String []arr = {"a","b","c","d"};
		System.out.println(arr.length);
		System.out.println(arr.toString());//Object.toString(): 객체의 주소(객체에 대한 정보를 재정의 하기를 기대하는 함수)
		//java.lang.Object : 모든 객체의 부모. 모든 타입이 객체가 될 수 있는 정보를 포함. class의 생성자를 new연사자로 호출해 객체 생성하게 함.
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.toString());
		System.out.println(list.size());
		System.out.println(list.contains("c"));//Object.toString() > list.toString().(재정의) 객체의 설명
		
		L01Variable loL01Variable = new L01Variable();
		System.out.println(loL01Variable);
		System.out.println(loL01Variable.toString());
		//@Override: 부모의 필드를 재정의. (다형성: 한개의 이름이 역할을 많이 갖는것.)(다형성)
		//자식은 부모의 모든 필드를 물려 받지만 재정의 된 필드가 우선순위를 갖는다.
		//오버로드: 메소드 이름은 같지만 매개변수는 다름.(다형성)
		//타입의 다형성: 한개의 객체가 여러 타입에 참조가능.(다형성)
		String aa ="안녕";
		Object o = "aa"; // o는 Object타입의 객체만 참조가능.,부모가 Object인 객체를 참조가능.
		
		//정수보다 큰수 
		//실수보다 큰수 : infinity
		
		//자바스크립트의 Number는 java double과 같다.
		
		boolean bool=true;//true=1, false=0  1bit지만 자바에서는(메모리를 1byte로 구성하므로) 8bit사용. 
		
		//상수
		final int I =20;
		//최초 선언된값 외의 data참조 불가.
		
		Integer objI = new Integer(20); //기본형을 참조형으로 선언하는것 권장하지않음.
		System.out.println(I==objI);//true
		
		
		
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj==obj2); //false
		
		//동등비교
		//1.객체가같은지
		//2.값이 같은지 비교
		
		System.out.println("20==20.0"+(20==20.0));//기본형 : 값을 비교 true
		System.out.println("new String(\"안녕\")==new String(\"안녕\"):"+new String("안녕")==new String("안녕")); //false
		System.out.println(("\"안녕\"==\"안녕\":")+("안녕"=="안녕"));//true
		//참조형 중 String만 예외. 문자열을 리터럴하게 선언시 기본형 처럼 새로운 data를 만들지 않고 기존의 객체를 찾아서 참조.
		//참조형 비교연산 하는 방법 : Object.equals(obj) 필드가 같은경우 두 객체가 같음. //주관적으로 필드 범위 지정 가능.==>재정의
		
		//String은 equals를 재정의함.
		//리터럴하게 선언된 문자열도 참조형 데이터이다.
		//문자열의 동등비교를 권장하지 않는다.(참조형은 동등비교할수없음. )
		System.out.println(new String("안녕").equals(obj2));
	}
	public void print() {}
	public void print(int i) {}
	public void print(String s) {}
	//오버로드: 메소드 이름은 같지만 매개변수는 다름.(다형성)
	
	@Override//Object에 대한 toString 
	public String toString() {
		return "변수.";
	}

}
