package arrays;

import java.util.Arrays;

public class Lesson22 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{12, 5, 3},
				{-1, 7, 3},
				{2, -4, -9}
		};
		
		int[] newArray = new int[9];
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				newArray[index] = arr[i][j];
				index++;
			}
		}
		
		
		for (int i = 0; i < newArray.length - 1; i++) {
			for (int j = 0; j < newArray.length - 1 - i; j++) {
				if (newArray[j] < newArray[j + 1]) {
					int temp = newArray[j];
					newArray[j] = newArray[j + 1];
					newArray[j + 1] = temp;
				}
			}
		}
		
		int index2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = newArray[index2];
				index2++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
//		System.out.println(Arrays.toString(newArray));
		
//		int[][] arr = {
//				{12, -5, -3},
//				{-1, 7, 3},
//				{2, -4, -9},
//				{6, -5, -3}
//		};
		
//		int count = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (arr[i][j] < 0) {
//					System.out.print(arr[i][j] + " ");
//					count++;
//				}
//			}
//		}
//		
//		System.out.println(count);
		
		
		int[] numbers = {3, 5, 7, 6, 9};
		
//		System.out.println(numbers);
//		System.out.println(Arrays.toString(numbers));
		
//		Arrays.sort(numbers);
		
//		System.out.println(Arrays.toString(numbers));
//		
//		int binarySearch = Arrays.binarySearch(numbers, 4);
//		
//		System.out.println(binarySearch);
		
//		int[] num1 = new int[5];
		
//		Arrays.fill(num1, 7);
//		Arrays.fill(num1, 1, 5, 7);
		
//		System.out.println(Arrays.toString(num1));
		
//		int[] a = {1, 2, 3};
//		int[] b = {1, 2, 3};
		
//		System.out.println(a == b);
//		System.out.println(a.equals(b)); //massivin equals metodu unvana gore muqayise edir
//		System.out.println(Arrays.equals(a, b)); //Arrays sinifin equals metodu deyere gore muqayise edir
		
		
//		int[] a = {1, 2, 3};
//		
//		int[] copyOf = Arrays.copyOf(a, 5);
//		
//		System.out.println(Arrays.toString(copyOf));
		
		
//		doIt(3);
//		doIt(1, 4);
//		doIt(1, 4, 6);
	}
	
//	public static void doIt(double d, int... arr) {
//		System.out.println(Arrays.toString(arr));
//	}
	
//	public static void doIt(int a) {
//		System.out.println(a);
//	}
//	
//	public static void doIt(int a, int b) {
//		System.out.println(a + " " + b);
//	}
//	
//	public static void doIt(int a, int b, int c) {
//		System.out.println(a + " " + b + " " + c);
//	}
}
