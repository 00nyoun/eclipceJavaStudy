package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class GenericTest<T>{
	T name;
	public GenericTest(T name) {
		this.name=name;
	}
}
interface Carable{}
class qqq implements Carable{
	public String toString() {
		return "dfjlsjfljsfkjfgjk";
	}
}
class qqq2 implements Carable{}

//Carable이 부모인 타입만 제네릭으로 지정 가능.
class CarInfo<T extends Carable>{
	T car;
	public void print() {
		System.out.println(car.getClass()+":"+car.toString());
	}
}

public class L07Generic {
	public static void main(String[] args) {
		qqq q= new qqq();
		qqq2 q2 = new qqq2();
		CarInfo carInfo = new CarInfo();
		carInfo.car = q;
		//carInfo.car="dd";
		carInfo.print();
		
		
		
		GenericTest a = new GenericTest("우우우");
		System.out.println(a.name);
		GenericTest<Integer> a2 = new GenericTest<Integer>(200);//해당하는 타입만 들어갈수있음..
		System.out.println(a2.name);
		GenericTest<Integer> a3 = new GenericTest<Integer>(null);
		System.out.println(a3.name);//기본형의 참조형이므로 null사용가능.
		
		List<Integer> list = new ArrayList<Integer>();//기본형은 제네릭으로 사용할 수 없다.
		//list.add("1");// 불가.
		//Integer는 int의 랩퍼클래스
		//기본형 랩퍼 클래스가 하는일. (Byte, Short,Integer, Long, Float, Double, Character<<cf.아스키코드 참조 1byte, 유니코드 참조 2byte))
		//1. 형변환 Integer.parseInt("13");
		//2. 기본데이터 타입의 정보를 포함. Integer.MAX_VALUE
		//3. 제네릭으로 사용된다.
		list.add(1);
		list.add(20);
		list.add(300);
		System.out.println(list);
		
//		Object [] birthArr = {1999,"2000",2001.0,2002F, 2003l};//태어난 날만  ,,Object로 받아서 오류남.
//		int now = 2022;
//		Object [] ageArr=new Object[5];
//		for(int i=0;i<birthArr.length;i++) {
//			int age = (now-(int)birthArr[i]);
//			System.out.println(age);
//			ageArr[i]= age;
//		}
//		List birthList = new ArrayList();
//		birthList.add(1999);
//		birthList.add("2000");
//		birthList.add(2001.0);
//		birthList.add(2002F);
//		birthList.add(2003l);
//		for(int i=0;i<birthList.size();i++) {
//			int age=now-(int)birthList.get(i);
//		}
//		List<Integer> birthList2=new ArrayList<Integer>();
//		birthList2.add(1999);
//		birthList2.add("2000");
//		birthList2.add(2001.0);
//		birthList2.add(2002F);
//		birthList2.add(2003l);
		//제네릭을 사용하면 정수만 필드로 참조할수있다.
		//List와 Array의 Key : index (순서가 있는)
		
		//Map의 Key : 중복되지않는 어떤것이든가능. Set
		//Value 자유.
		Map<Integer, String>person=new HashMap<Integer, String>();
		person.put(1234,"최예나");
		person.put(1999,"최예나2");
		person.put(5678,"최예나3");
		person.put(1999,"최예나4");//위에서 입력된값이 마지막으로 바뀜.
		System.out.println(person);//key는 중복 안됨.
		//Map의 자료구조는 순서가없음. 
		System.out.println(person.get(1999));
		
		Set<Integer> set = new HashSet<Integer>();// 집합임. 중복 허용안됨. 순서없음.
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(17);
		set.add(12);
		set.add(11);
		System.out.println(set);
	}

}
