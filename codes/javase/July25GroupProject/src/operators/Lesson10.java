package operators;

public class Lesson10 {
	public static void main(String[] args) {
		//Muqayise operatorlari
		int num1 = 20;
		int num2 = 30;
		int a = 1;
		
//		!true = false
		
		//Mentiqi opertairlar
		//&& = and, ||, !
//		System.out.println(num1 > 10 && num2 < 50); //true && true = true
//		System.out.println(num1 > 10 && num2 > 50); //true && false = false
//		System.out.println(num1 < 10 && num2 < 50); //false && true = false
//		System.out.println(num1 < 10 && a++ == 1); //short circuit qaydasi
		
//		System.out.println(a);
		
//		System.out.println(num1 < 10 && num2 > 50); //false && false = false
		
		
//		System.out.println(num1 > 10 || num2 < 50); //true || true = true
//		System.out.println(num1 > 10 || num2 > 50); //true || false = true
//		System.out.println(num1 < 10 || num2 < 50); //false || true = true
		System.out.println(num1 < 10 || num2 > 50); //false || false = false
		System.out.println(num1 < 10 || !(num2 > 50)); //false || true = true
		
//		System.out.println(num1 > num2);
//		System.out.println(num1 < num2);
//		System.out.println(num1 == num2);
//		System.out.println(num1 <= num2);
//		System.out.println(num1 >= num2);
//		System.out.println(num1 != num2);
		
//		String s1 = "Java";
//		String s2 = "Java";
		
//		String s1 = new String("alma"); //10145
//		String s2 = new String("alma"); //20145
//		
////		System.out.println(s1 == s2); //false
//		System.out.println(s1.equals(s2)); //true
	}
}
