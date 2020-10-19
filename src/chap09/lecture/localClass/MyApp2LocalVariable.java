package chap09.lecture.localClass;

public class MyApp2LocalVariable {
	public static void main(String[] args) {
		int i = 1;	//묵시적으로 final
		
		class LocalClass {
			void method() {
				System.out.println(i);	//final 변수만 사용가능
//				i +=1; 로컬클래스에서 메소드에 있는 지역클래스에 접근할때 값을 변경할수없다.
				
			}
		}
		
	}
}
