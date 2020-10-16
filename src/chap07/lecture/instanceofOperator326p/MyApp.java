package chap07.lecture.instanceofOperator326p;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		
		// intanceof : 좌변이 참조변수, 우변이 타입
		// 결과 : boolean
		System.out.println(o1 instanceof SuperClass);
		System.out.println(o1 instanceof SubClass);
		System.out.println(o1 instanceof SubClass2);
		
		if(o1 instanceof SubClass) {
			SubClass o2 = (SubClass) o1;
		}
		if(o1 instanceof SubClass2) {
			SubClass2 o3 = (SubClass2) o1;
		}
			
		
	}
}
