package java_study.co.kr.joongbu;

import java.util.Scanner;

public class L06Exception {
	public static void main(String[] args) {
		//컴파일 시 발견되지 않은 오류를 예외처리 하는 방법 = try-catch
		
		String [] arr = {"a","b","c"};
		Scanner sc =new Scanner(System.in);// 모든 통신은 문자여리 기본다.
		System.out.println("{\"a\",\"b\",\"c\"} 잡고싶은 배열의 인덱스 입력>>");
		
		while(true) {
			String str = sc.nextLine();
			try {
				System.out.println("arr["+str+"] :"+arr[Integer.parseInt(str)]);
			}catch(NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0부터 "+(arr.length-1)+"까지 정수만 입력하세요.");
			}catch(Exception e) {//모든예외.
				System.out.println("알수없는 오류발생.");
			}finally {//예외가 발생하든 안하든 항상 실행.(통신하고 종료시 많이 사용)
				System.out.println("again");
			}
			
//			System.out.println("당신이 입력한 문자열: "+str);
		}
		
		
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		System.out.println(arr[3]);
	}

}
