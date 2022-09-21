package java_study.co.kr.joongbu;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Func<T,R>{
	R apply(T t);
}

public class L12Lamda {
	public static void main(String[] args) {
		//js 람다식 : function(){} 함수 => 프로토 타입(타입) , ()=>{}람다식 타입이 존재하지 않는 함수...
		//function Calc(a,b){this.a=a;this.b=b;this.sum=function(){}} let calc = new Calc();
		//java 람다식
		Function<Integer, Long> square=(i)->{return (long)i*i;};//Function은 매개변수가 하나 있고 반환하는 것이 있는 함수.
		Function<Integer, Long> square2=new Function<Integer, Long>() {

			@Override
			public Long apply(Integer t) {
				long result=t*t;
				return result;
			}
		};
		BiFunction<Integer, Integer, Long> sum=(i,i2)->{return (long)(i+i2);};
		System.out.println(sum.apply(40, 100));
		Consumer<Integer> squarPrint=(i)->{};//매개변수 1개만 존재한는 함수
		squarPrint.accept(133);
		//Predicate(검사식) : 매개변수와 반환하는 값이 있는데 반환하는 값의 타입은 무조건 boolean
		Predicate<String> nullCheck=s->s!=null;
		//Supplier : 반환하는 것만 있는 함수 정의
		Supplier<Integer> randomNum=()->{return (int)(Math.random()*10)+1;};//1~10까지 랜덤한 수를 반환하는 함수
		System.out.println(randomNum.get());
		//BinaryOperator(연산하는 함수): 매개변수가 2개고 반환하는 것이 있으며 매개변수와 반환 값의 타입이 같은것.
		BinaryOperator<Integer> sum2=(i,i2)->i+12;
		System.out.println(sum2.apply(45, 99));
		
		//람다식 쓰는 이유: 코드 줄어듦->유지보수 유리. 
	}

}
