package chap11.textbook;

public class StringReplaceExamlpe {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풀부한 API를 지원합니다.";
		String newStr =  oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
				
	}
}
