package chap15.textbook.s150403;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
//		Map<String, String> map;
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"uft-8");	//한글 내용을 읽기위한 코드
		
		// 파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장
		properties.load(new FileReader(path));
		
		System.out.println(properties.size());
//		Object urlValue =  properties.get("url");  //get는 Object로 파라미터를 갖는다.
		String urlValue = properties.getProperty("url");	//String 타입으로 받아노느 메소드
		String driver = properties.getProperty("driver");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.out.println(urlValue);
		System.out.println(driver);
		System.out.println(username);
		System.out.println(password);
		
	}
}
