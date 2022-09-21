package java_study.co.kr.joongbu;

class ObjectA{
	String a="ObjectA.a 입니다.";
}
class ObjectB extends ObjectA{
	String b="ObjectB.b 입니다.";
}
class ObjectC extends ObjectB{
	String c="ObjectC.c 입니다.";
}
//상속받은 타입을 자식 이라하고 상속을 한 타입을 부모라 한다.
//자식은 부모의 필드를 물려 받는다.
public class L05ExtendsAndType {
	public static void main(String[] args) {
		//상속은 타입의 다형성을 만든다.
		ObjectC c=new ObjectC();
		System.out.printf(c.a,c.b,c.c);
		
		ObjectA a = c;
		System.out.printf(a.a,a.b,a.c);
		
		ObjectB b = c; // ObjectB가 참조할수 있는 필드만 접근가능.
		System.out.printf(b.a,b.b,b.c);
		
		//c가 참조하는 객체가 줄어드는 것은 아니다. 객체는 그대로고 해당하는 부모의 타입만큼만 참조한다.
		
		Object o = c;
//		System.out.printf(o.a,o.b,o.c); //없음.
		
		Object o_c=(ObjectC)o;//캐스팅 형변환.
		//실행시 발견되는 오류
		
		String s_o = (String)o; //다른 타입으로 캐스팅시 실행시 오류뜸.(심각한 오류)==> 실행중에 오류가 발생하면 어플이 멈춤.
		//다음코드들이 실행안됨.
		//=>예외처리를 해줘야함.
		if(o instanceof String) {
			String s_o = (String)o;
		}
		
		try {
			String s_o = (String)o;//실행시 발생한 오류=>예외처리를 해줘야함.
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//컴파일시 발견되는 오류
		int i = (int)"문자열";//오류가있어서 컴파일 불가. => 미리 오류를 파악해 클래스 파일로 배포되지 않음.
		//컴파일 되는 언어의 "장점": 오류가 있는 코드를 배포하지않음.
		
		
		
	}

}
