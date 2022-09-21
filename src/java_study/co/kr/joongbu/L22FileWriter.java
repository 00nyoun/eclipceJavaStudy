package java_study.co.kr.joongbu;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class L22FileWriter {
	public static void main(String[] args) {

		FileWriter fw = null;//문자열을 하일로 출력하는 객체
		BufferedWriter bw = null;//보조스트림
		
		try {
			fw = new FileWriter("newFile.txt");
			bw= new BufferedWriter(fw);
			bw.write("fafafaf");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
