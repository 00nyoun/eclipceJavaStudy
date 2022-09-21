package java_study.co.kr.joongbu;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class L13MethodReference {
	public static void main(String[] args) {
		//메소드 참조(람다식을 한번 더 줄여서 작성)
		//"13"->13
		Function<String, Integer> parseInt=(s)->{return Integer.parseInt(s);};
		Function<String, Integer> parseInt2=s->Integer.parseInt(s);
		Function<String, Integer> parseInt3=Integer::parseInt;//컴파일러가 해석할 수 있는 정도의 생략만 가능.
		
		System.out.println(parseInt3.apply("99")*3);
		
		//문자열 두객체를 equals 로 같은지 검사하는 함수 작성
		BiPredicate<String, String> strEquals=(s1,s2)->s1.equals(s2);
		BiPredicate<String, String> strEquals2=String::equals;//메서드 참조는 매개변수를 생략
		String str="안녕하!";
		String str2=new String("안녕하!");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		System.out.println(strEquals.test(str, str2));
		System.out.println(strEquals2.test(str, str2));
		
		char[] charArr= {'안','녕','히'};
		
		String msg = new String(charArr);
		System.out.println(msg);

		Function<char[], String> parseStr=cArr->new String(cArr);
		Function<char[], String> parseStr2=String::new;
		
		System.out.println(parseStr.apply(new char[] {'고','민','시'}));
		System.out.println(parseStr2.apply(new char[] {'고','민','시'}));
	}

}
