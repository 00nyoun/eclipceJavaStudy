package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L17StreamEx3 {
	public static void main(String[] args) {
		/*
		 * stream 의 중간연산
		 * sort() : stream 자료를 정렬
		 */
		//Array 배열의 기본이 되는 타입 : 필드가 Index 뿐인 자료형.
		int []NumAr = {};
		//List 배열을 제어하기 위한 자료형 : 필드가 Index와 제어에 유용한 함수를 포함, 
		List<Integer> nummList = new ArrayList<>();
		nummList.add(99);
		nummList.add(-5);
		nummList.add(72);
		nummList.add(40);
		nummList.add(-35);
		nummList.add(1);
		System.out.println(nummList);
		
		int []numArr = {99,-5,72,40,-35,1}; //Stream 자료형의 목표는 모든 자료형의 반복문을 통일.
		
		Arrays.stream(numArr)
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		String [] strArr = {"Bbb","zzz","zzz","zzz","dfs","dfs","dfd","fth"};
		
		Arrays.stream(strArr)
			.distinct()
			.sorted(String.CASE_INSENSITIVE_ORDER)
			.forEach(System.out::println);
		System.out.println();
		
		int [] intArr3 = {0,1,2,3,4,5,6,7,8,9};
		Arrays.stream(intArr3)
			.skip(3)//건너뛰는 중간연산.
			.limit(3)//길이만큼 잘라냄.
			.forEach(System.out::println);
		
	}

}
