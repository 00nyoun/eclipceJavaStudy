package java_study.co.kr.joongbu;
import java.lang.*;
//import java.util.~~~  util 개발에 유용한 클래스 집합.(컬렉션 프레임워크=유용한 자료구조)

public class InnerClass {
	//Class 생성 : java -> class로 컴파일 
	//패키지 생성 이유 -> 클래스에 고유 이름을 제공
	//public class : 배포되는 방. 자바 문서와 동일한 이름의 class, 다른 패키지에서 Import해서 사용가능한 class.
	//main method (앱) : jre를 호출해서 작성한 순서대로 코드를 실행. => 순차적 언어.
	public static void main(String[] args) {
		System.out.println("우우우");
		java.lang.String s ="dd";
		java.lang.Integer i = 113; //Integer int의 랩퍼클래스
		
		int i2 = 44;
		int i3 = 44;
		int i4 = 44;
		char[] arrC= {'a','b','c','d','e'};
		char[] arrC2 = new char[5];
		Character [] arrC3 = new Character[5];
 		String s3="abcde";//마치 기본형인것 처럼 선언됨.
		
		//44는 한번만 생성되고 나머지는 참조.
		//기본형(원시형)데이터 타입의 특징 (Primitive type)원시적-->기계(메모리)와 가까울수록 원시적
		//1. 원시형데이터  데이터가 원시적임. 내가 참조하는 데이터가 값자체임. 이거말고 없음. 리터럴하게 선언가능.
		//2. 리터럴하게 선언. : 문자그대로 //대부분 수와 관련되있으므로.
		//3. 스택메모리에 생성됨.: 자주 사용하므로 가비지컬렉션없음.
		
		//참조형 데이터 타입
		Object o = new Object(); 
		//1. key=value    //데이터를 수없이 많이 참조할수있어서 참조형 데이터다.
		//new 연산자로 생성자를 호출하면 참조형 데이터(객체) 생성.
		//생성자 = 클래스와 동일한 이름을 갖는 존재 
		//객체가 생성되는 메모리?? -> 힙 메모리에 생성. (가비지 컬렉션에 의해 정리==>포인터가 필요없다.)=>인스턴스 객체(쉽게 정의/삭제 가능.)
	}
}
