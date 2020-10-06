package chap03.textbook.exercises;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (int)(pencils / students);
		System.out.println(pencilsPerStudent);
		
		//남운 연필 수
		int pencilsLeft = (int)(pencils % students);
		System.out.println(pencilsLeft);
	}
}
