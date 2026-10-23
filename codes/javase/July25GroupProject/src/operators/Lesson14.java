package operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lesson14 {
	public static void main(String[] args) {
		// on sertli ve son sertli dov
		// on sertli dovler = for, while
		// son sertli dovler = do-while

//		while(sert) {
//			//dovrun govdesi
//		}

//		int a = 0;
//		
//		while(a < 10) {
////			System.out.println("Ali");
//			a++; //0
//			System.out.println(a); //1
//		}

//		int a = 10;

//		while(a > 0) {
//			System.out.println(a);
//			a--;
//		}

//		
//		int i = 1;
//		
//		while(i < 20) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			
//			i++;
//		}

//		for(baslangic; sert; deyisme) {
//			//dovrun govdesi
//		}

//		for(int i = 0; i <= 5; i++) {
//			System.out.println(i);
//		}

//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}

//		int i;
//		int j;
//		for(i = 10, j = 5; i > 0; i--, j--) {
//			System.out.println(i);
//		}

//		for(;;) {
//			System.out.println("Hello");
//		}

//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 10; j++) {
//				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//			}
//			
//			System.out.println();
//		}

//		String name = "Veli";
//		int i = 0;
//		
//		do {
//			
//			System.out.println(name);
//			i++;
//		}
//		while(i < 5);
		
//		Scanner sc = new Scanner(System.in);
//		String password;
//		
//		do {
//			System.out.println("Sifrenizi daxil edin: ");
//			password = sc.nextLine();
//		}
//		while(!password.equals("java"));
//		
//		System.out.println("Girisiniz ugurludur");
//		
//		sc.close();
		
//		int a = 0;
//		
//		do {
//			System.out.println(a);
//			a++;
//		}
//		while(a < 10);
		
//		int i = 10;
//		
//		do {
//			System.out.println(i);
//			i--;
//		}
//		while(i > 0);
//		
//		int a = 4;
//		int count = 0;
//		
//		do {
//			a++;
//			count++;
//			System.out.println(a);
//		}
//		while(a < 123);
//		
//		System.out.printf("Iterasiyanin sayi = %d", count);
		
		
		int a = 1;
		int sum = 0;
		
		do {
			a += 2;
			sum = sum + a;
			System.out.println(a);
		}
		while(a < 123);
		
//		do {
//			a++;
//			if (a % 2 == 0) {
//				sum += a; 
//			}
//			System.out.println(a);
//		}
//		while(a < 123);
		
		System.out.println("Cem = " + sum);
		
//		do {
//			a++;
////			sum = sum + a;
//			sum += a;
//			System.out.println(a);
//		}
//		while(a < 123);
//		
//		System.out.println("Cem = " + sum);
		

	}
}
