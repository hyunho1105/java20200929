package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx2.java";
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[10];
		
		int readCnt = 0;
		int loopCnt = 0;
		while((readCnt = is.read(datas)) != -1) {
			loopCnt++;
		}
		System.out.println(loopCnt);
		
		is.close();
	}
}
