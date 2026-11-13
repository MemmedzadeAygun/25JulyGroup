package arrays;

public class Example {
	public static void main(String[] args) {
//		int g = 0;
//		
//		System.out.println(g);
//		int a = 12;
//		int b = 4;
//		int c = 56;
//		int d = 5;
//		
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
//		int[] array1 = {12, 3, 6, 8, 13};	//1
////		int[] array1 = {};	//1
//		array1[1] = 5;
		
//		System.out.println(array1[1]);
		
//		System.out.println(array1[array1.length - 1]);
		
//		int[] array2 = new int[3];
//		int[] array2 = new int[3];	//2
		
//		int array3[] = new int[] {1, 2, 4, 3};	//3
		
//		String[] strArr = {"hello", "salam"};
		
//		double[] dbArray = new double[4]; //0 1 2 3 = 4 - 1
//		dbArray[0] = 12;
//		dbArray[1] = 2;
//		dbArray[2] = 5;
//		dbArray[3] = 34.7;
//		dbArray[4] = 67.8;
//		
//		System.out.println(dbArray[0]);
//		System.out.println(dbArray[1]);
//		System.out.println(dbArray[2]);
//		System.out.println(dbArray[3]);
		
		
//		int[] numbers = {12, 4, 5, 8, 3};
//		
//		int count = 0;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			count++;
//		}
//		
//		System.out.println(count);
		
//		for (int i : numbers) {
//			System.out.println(i);
//		}
		
		int[] numbers = {12, 4, 5, 45, 8, 3};
		
		int max = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		System.out.println(max);
		
//		int sum = 0;
//		
//		for(int i = 0; i < numbers.length; i++) {
////			System.out.println(numbers[i]);
//			sum = sum + numbers[i];
//		}
//		
//		double avrg = sum / numbers.length;
//		
//		System.out.println(avrg);
////		
////		
//		System.out.println(sum);
		
//		int[] a = {1, 2, 3};
//		int[] b = a;
//		b[1] = 67;
////		System.out.println(b == a);
//		System.out.println(a[1]);
//		System.out.println(b[1]);
		
//		String[] str = null;
//		
//		System.out.println(str[0]);
		
	}
}
