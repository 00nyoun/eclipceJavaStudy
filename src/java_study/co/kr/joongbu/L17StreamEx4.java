package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L17StreamEx4 {
	public static void main(String[] args) {

		int [] scoreArrCKM= {88,50,70,100,30,90};
		int [] scoreArrHKD= {90,100,99,100,85,92};
		
		long c = Arrays.stream(scoreArrCKM)
			.filter((s)->s>=80)
			.count();
		System.out.println("80점 이하인 과목수:"+c);
		
		boolean test=Arrays.stream(scoreArrCKM)
				.allMatch(s->s>=80);
		System.out.println("모두 80점 이상인가?:"+test);
		
		test=Arrays.stream(scoreArrHKD)
				.anyMatch(s->s<60);
		System.out.println("HKD의 성적이 60점 미만인게 1개라도 있나? :"+test);
		
		test=Arrays.stream(scoreArrCKM)
				.anyMatch(s->s<60);
		System.out.println("CKM의 성적이 60점 미만인게 1개라도 있나? :"+test);
		
		
		Stream stream = Stream.of("a",1,"b",33.9,"c","d");
		Stream<String> stream2 = Stream.of("11","1","55","33","-40");
		ArrayList<Integer> strList=
				stream2
				.map(Integer::parseInt)
				.collect(Collectors.toCollection(ArrayList<Integer>::new));
		System.out.println(strList);
		
		Stream<String> stream3 = Stream.of("11","1","55","33","-40");
//		int sum = stream3.collect(Collectors.summingInt((str)->Integer.parseInt(str)));
		int sum = stream3.mapToInt(Integer::parseInt).sum();
		System.out.println(sum);
	}

}
