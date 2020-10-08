package chap05;

public class ReferenceType4 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3); // 인스턴스 비교
		
		System.out.println(str1.equals(str3)); // 가지고 있는 값을 비교
	}
}
