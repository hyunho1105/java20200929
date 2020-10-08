package chap05.exercise;

public class exercise07T {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[] array	 = {-1, -5, -3, -8, -2};
		
//		max = (max > array[0])? max : array[0];
//		max = (max > array[1])? max : array[1];
//		max = (max > array[2])? max : array[2];
//		max = (max > array[3])? max : array[3];
//		max = (max > array[4])? max : array[4];
		
		for (int i = 0; i < array.length; i++) {
			max = (max >array[i])? max : array[i];
		}
		System.out.println("max:" + max);
	}
}
