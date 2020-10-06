package chap11.string;

public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("===charAt===");
		String str1 = "java";
		char c1 = str1.charAt(2);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(1));
		System.out.println("===equals===");
		// equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2 == str6);
		System.out.println(str2.equals(str6));
		System.out.println("===indexOF===");
		// indexOf
		String str7 = "자바 프로그래밍";
		int a = str7.indexOf("프로");
		System.out.println(a);
		// 중복일경우 처음 나오는곳, 없을경우 결과값은 -1
		System.out.println("===length===");
		// length
		String str8 = "이것이 자바다.";
		int l = str8.length();
		System.out.println(l);
		System.out.println(str8.charAt(l-1));
		System.out.println("===replace===");
		// replace
		String str9 = "abcdefabcdefg";
		String str10 =str9.replace("abc", "123");
		System.out.println(str10);
		System.out.println(str9);
		System.out.println("===substring===");
		// substring
		String str11 = "0123456789";
		String sub = str11.substring(2, 3);
		System.out.println(sub);
		sub = str11.substring(5,str11.length()-1);
		System.out.println(sub);
		sub = str11.substring(5,str11.length());
		System.out.println(sub);
		
		sub = str11.substring(6);
		System.out.println(sub);
		System.out.println("===trim===");
		// trim 앞뒤 공백 제거, 중간 공백은 제거 불가
		String str12 = " java ";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
	}
}
