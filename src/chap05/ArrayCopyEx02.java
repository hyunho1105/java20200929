package chap05;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = { { 3, 4 }, { 88, 99 }, { 2, 1 } };
		int[][] arr2 = new int[arr1.length][]; // 복사 하려는것과 크기가 같거나 커야한다.

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[1];

		arr1[0][0] = 100;
			//배열을 복사한게 아니라 참조값을 복사한다.
		for (int[] arr : arr2) {
				for (int n : arr) {
					System.out.println(n);
			}
		}
	 }
  }
}
