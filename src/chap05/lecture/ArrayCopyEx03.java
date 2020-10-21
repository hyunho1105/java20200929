package chap05.lecture;

public class ArrayCopyEx03 {
	public static void main(String[] args) {
		int[][] arr1 = {{3, 4}, {88, 99}, {2, 1}};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0; i < arr1.length; i++) {
			int[] newArr = new int[arr1[i].length];
			
			for (int j = 0; j < arr1[i].length; j++) {
				newArr[j] = arr1[i][j];
			}
			arr2[i] = newArr;
		}
		
		arr1[0][0] = 100; //새로운 배열을 형성했기 때문에 영향을 안미친다.
		
		for (int[] arr : arr2) {
			for(int n : arr) {
				System.out.println(n);
			}
		}
	}
}
