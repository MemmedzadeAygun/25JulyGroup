package lesson1;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Salam Dunya");
//		System.out.print(false);
//		System.out.println("Hello World");
//		Bu kod konsola cap etmek ucundur
		System.out.printf("Menim adim %s, yasim %d, boyumunun uzunlugu %.2f%n", "Xedice", 23, 1.70);
//		System.out.println();
		System.out.println("Menim adim Xedicedir");
		
		byte number = 127;
		short number2 = 1234;
		int number3 = 3456;
		long number4 = 10000000000L;
		
		double height = 123.56;
		float price = 45.7f;
	
		String setir = "Salam menim adim";
		char symbol = 's';
		
		boolean yalnis = false;
		boolean dogru = true;
		
		System.out.println(height);
		System.out.println(yalnis);
		System.out.println(symbol);
		System.out.println(number);
	}
}
