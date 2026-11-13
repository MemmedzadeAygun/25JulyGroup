package arrays;

public class Lesson21 {
	public static void main(String[] args) {
		int[] arr1 = { 12, 13, 23, 4, 6 };
		
		for (int i = 0; i < arr1.length; i++) {
			int b = 0;
			
			for (int j = 2; j < arr1[i]; j++) {
				if (arr1[i] % j == 0) {
					b++;
				}
			}
			
			if (b == 0 && arr1[i] > 1) {
				System.out.println(arr1[i] + " Sade ededdir.");
			}
		}
		
		
		
//		System.out.println(arr1[0]);

//		int[] arr2 = new int[] {3, 4, 7};

//		int[] arr3 = new int[3];
//		arr3[0] = 8;
//		
//		System.out.println(arr3[0]);

//		int[][] a1 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		
//		int[] a2[] = new int[][] {{ 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }};
//		
//		int[][] a3 = new int[2][3];
//		a3[0][0] = 20;
//		a3[0][3] = 4;
//		
//		
//		System.out.println(a3[0][0]);
//		System.out.println(a3[0][3]);
		
//		int[][] a1 = { { 10, 20}, { 40, 50, 60 }, { 70, 80, 90 } };
//		
//		int sum = 0;
//		for (int[] is : a1) {
//			for (int is2 : is) {
//				sum = sum + is2;
//			}
//		}
//		
//		System.out.println(sum);
		
//		System.out.println(a1.length);
//		System.out.println(a1[0].length);
		
//		System.out.println(a1[3][0]);
		
//		for (int i = 0; i < a1.length; i++) {
//			for (int j = 0; j < a1[i].length; j++) {
//				System.out.print(a1[i][j] + " ");
//			}
//		}
		
		
//		int[] arr = {12, 4, 6, 23, 56};
//		int max = arr[0];
//		
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < max) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println(max);
		
		
		
		
		
	}
}
