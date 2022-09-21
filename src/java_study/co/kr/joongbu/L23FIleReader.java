package java_study.co.kr.joongbu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.AutoCloseable;

public class L23FIleReader {
	public static void main(String[] args) {
		//AutoCloseable
		try(
				FileReader fr = new FileReader("src");
				BufferedReader br = new BufferedReader(fr);
			){
			
			String line=null;
			while((line=br.readLine())!= null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
