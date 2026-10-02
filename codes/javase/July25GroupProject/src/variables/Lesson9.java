package variables;

public class Lesson9 {
	
	public static void main(String[] args) {
		//=
//		int num = 10;
//		int a = num;
//		System.out.println(a);
//		System.out.println(num);
		
		//+=, -=, *=, /=, %= teyinetme operatorlari
//		int b = 5;
//		int d = 6;
//		
//		int result2 = (b + d) * 3;
//		System.out.println(result2);
		
//		int result = b / 0;
//		System.out.println(result);
		
//		b = b + 2;
//		b += 2;
//		System.out.println(b);
		
//		b = (int) (b - (long)2);
//		b -= (long)2;
//		System.out.println(b);
		
//		b = b * 3;
//		b *= 3;
		
//		b = b / 4;
//		b /= 4;
		
//		b  = b % 2;
//		b %= 2;
		
//		int c = 3; 
//		++c; //4
//		System.out.println(c); //4
		
		//!
//		boolean isActive = !false;
//		System.out.println(isActive);
		
//		int a = 5;
//		int b = --a * a + a++ + a; //25
//		System.out.println(b); //15, 30, 31, 32
//		
//		
//		char ch = 's';
		
		int a = 10;
		int b = 4;

		int c = a++ - --b; //10 - 3 = 7
		a += ++b; // a = a + ++b = 11 + 4 = 15 a = 15 b= 4
		b = a % b; //b = 15 % 4 = 3 qaliq
		c *= a--; // c = c * a-- = 7 * 15 = 105

		System.out.println(a); // 14
		System.out.println(b); // 3
		System.out.println(c); // 105
	}

}
