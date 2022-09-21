package java_study.co.kr.joongbu;

import java.util.Objects;

class PersonTest{
	String name;
	int age;
	public PersonTest(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//타입이 같은지
			return false;//메소드가 리턴되면 종료됨. 다음코드 실행 안됨.
		PersonTest other = (PersonTest) obj;//부모의 타입을 참조하는 변수를 자식의 타입으로 형변환.
		return age == other.age && Objects.equals(name, other.name);
	}
}
public class L02Equals {
	public static void main(String[] args) {
		PersonTest aa = new PersonTest("aa", 12);
		PersonTest aa2 = new PersonTest("aa", 12);
		//Object aa2 = new PersonTest("aa", 12); 도 가능. 
		System.out.println(aa==aa2);
		System.out.println(aa.equals(aa2));
	}


}
