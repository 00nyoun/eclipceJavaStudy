package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.List;

public class L15StreamAPIEx {
	static int sum2;
	public static void main(String[] args) {
		
//		Integer n = new Integer(500);
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(500);
		numList.add(55);
		numList.add(5);
		numList.add(null);
		numList.add(555);
		numList.add(1);
		numList.add(3);
		numList.add(-300);
		
		//외부반복문은 내부반복문 보다 조건을 파악하기 어렵다.
		int sum=0;
		for(Integer num : numList) {//int num=numList.get(i).intValue(); => int num=null.intValue;
			if(num != null) {
				sum+=num;
			}	
		}
		// null의 필드가 없는데 참조해서 오류.
		System.out.println(sum);
		
		numList.stream()
			.filter(i->i!=null)//filter=중간연산
			.forEach((i)->{sum2+=i;});//forEach=최종연산
		System.out.println(sum2);
	}

}
