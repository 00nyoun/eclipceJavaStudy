package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L14StreamAPI {
	static int foreachSum;
	public static void main(String[] args) {
		//IOStream : 통신 할 때 흐름.(입력방향, 출력방향)
		//StreamAPI : 모든 자료구조를 동일한 방식으로 다루기(반복문) 위해 존재 (흐름이 있는 자료 구조)
		
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(500);
		numList.add(55);
		numList.add(5);
		numList.add(555);
		numList.add(1);
		numList.add(3);
		numList.add(-300);
		//numList의 모든 값을 더하기.
		int sum=0;
		for(int i=0; i<numList.size();i++) {
			int num=numList.get(i);
			sum+=sum;
		}
		System.out.println("for 반복문 결과: "+sum);
		sum=0;
		for(int num : numList) {//java의 배열과 관련된 자료구조는 Iterator 정렬을 하기 때문에 향상된 for 사용가능.
			sum +=num;
		}
		System.out.println("향상된 for 반복문 결과: "+sum);
		//내부 반복문 => Js List를 흉내낸.
		sum=0;
		numList.forEach((num)->{foreachSum+=num;}); // Consumer 람다식 매개변수만 존재.
		System.out.println("내부 반복문 foreach 결과: "+foreachSum);
		foreachSum=0;
		numList.stream().forEach((num)->{foreachSum+=num;});
		System.out.println("내부 반복문 Stream foreach 결과: "+foreachSum);
		
		int [] numArr = {333,222,111,2,-33,5};
		Arrays.stream(numArr).forEach((num)->{foreachSum+=num;});  //배열을 지원하는 객체(랩퍼클래스랑유사)
		System.out.println("내부 반복문 Stream foreach 결과(Array): "+foreachSum);
		
		int intStreamSum=Arrays.stream(numArr).sum();
		//컬렉션프레임워크에서 제공하는 자료구조는 기본형으로 자료 지정 불가 => stream은 기본형 자료구조를 제공함.
		System.out.println("내부반복문 Intstream sum 결과(Array): "+foreachSum);
		
	}

}
