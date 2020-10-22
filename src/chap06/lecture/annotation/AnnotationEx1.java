package chap06.lecture.annotation;

public class AnnotationEx1 {
	@MyAnnotation
	private int i; 
	
	//주석들........
	
	// annotation
	@MyAnnotation("abc")
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@MyAnnotation(value="abc", number =5, names = {"c", "d"})//여러값을 넣을때는 생략 불가능
	public static void mymethod() {
		
	}
}
