package strings;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Istifadcei adinizi daxil edin: ");
		String username = sc.nextLine();
		
		System.out.println("sevdiyi proqramlaşdırma dilini daxil edin: ");
		String prlang = sc.nextLine();
		
		System.out.println("User " + username + " deyir: \n Menim sevdiyim dil " + prlang);
		System.out.println("Bu dili öyrənmək üçün yazıram: " + " C:\\Users\\Ali\\Documents\\" + prlang +  "\\code.java");
		
		
//		System.out.println("Salam \nDunya!");
//		System.out.println("Salam \tDunya!");	  
//		System.out.println("Salam\\Dunya!");
//		System.out.println("Salam\'Dunya!");
		
		
//		String name =  "Aysel";
//		int age =  15;
//		String schoolName =  "Xəzər Liseyi";
//		double mark =  95.5;
//		
//	     System.out.println("Salam, mən " + name + ". Mən " + age + " yaşındayam və " + schoolName + "-ndə oxuyuram.");
//		System.out.printf("Salam, men %s. Men %d yasindayam ve %s-de oxuyuram.", name, age, schoolName);
		
//		print, println, printf
		
//		String name = "Mehemmed";
//		String surname = "Necefov";
//		int age = 11;
//		double height = 1.50;
		
//		String format = String.format("Name = %s", name);
//		System.out.println(format);
		
//		System.out.println("Ad = " + name + ", " + "Soyad = " + surname);
//		System.out.printf("Ad = %s, Soyad = %s, Age = %d, %nHeight = %.2f", name, surname, age, height);
//		System.out.printf("Ad = %s Soyad = %s", name, surname);
//		System.out.println("Ad = " + name); //Ad = Mehemmed
		
//		System.out.println("Hello World");
//		System.out.printf("Hello %nWorld");
//		System.out.printf("%10s", "Java");
//		System.out.printf("|%-10s|", "Java");
//		System.out.printf("%05d", 1); //00001
//		System.out.printf("%05d", 12); //00012
//		System.out.printf("%05d", 123); //00123
//		System.out.printf("%05d", 1234); //01234
//		System.out.printf("%05d", 12345); //12345
	}
}
