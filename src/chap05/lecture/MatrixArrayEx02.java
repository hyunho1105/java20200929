package chap05.lecture;

public class MatrixArrayEx02 {
	public static void main(String[] args) {
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[2][];
		//열의 갯수를 지정하지 않을 경우 null (참조타입기본값)값을 가짐
		mat2[0] = new int [2]; //새로운 인스턴스 발생->2개의 저장 공간을 가진 배열이 생김
		mat2[1] = new int [3]; 
		
		int [] arr1 = null;
		arr1 = new int[4];
	}
}
