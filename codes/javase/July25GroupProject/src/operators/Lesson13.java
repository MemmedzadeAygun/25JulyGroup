package operators;

import java.util.Scanner;

public class Lesson13 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Eded daxil edin: ");
//		int score = sc.nextInt();
////		System.out.println(score);
//		
//		if(score > 90 && score <= 100) {
//			System.out.println("Ela");
//		}
//		else if(score > 80 && score <= 90) {
//			System.out.println("Yaxsi");
//		}
//		else if(score > 70 && score <= 80) {
//			System.out.println("Orta");
//		}
//		else {
//			System.out.println("Yaxsi deyil");
//		}

//		int key = 4;
//		
//		switch(key) {
//		case value1:
//			break;
//		case value2:
//			break;
//		default:
//			break;
//		}

//		int day = 1;
//		switch(day) {
//		case 1:
//			System.out.println("Bazar ertesi");
//			break;
//		case 2:
//			System.out.println("Carsenbe axsami");
//			break;
//		case 3:
//			System.out.println("Carsenbe");
//			break;
//		case 4:
//			System.out.println("Cume axsami");
//			break;
//		case 5:
//			System.out.println("Cume");
//			break;
//		case 6:
//			System.out.println("Senbe");
//			break;
//		case 7:
//			System.out.println("Bazar gunu");
//			break;
//		default: 
//			System.out.println("Sehv daxil etmisiz");
//			break;
//		}

//		int month = 2;
//
//		switch (month) {
//		case 1, 2, 3:
//			System.out.println("Winter");
//			break;
//		case 4, 5, 6:
//			System.out.println("Spring");
//			break;
//		case 7, 8, 9:
//			System.out.println("Summer");
//		break;
//		default:
//			System.out.println("Sehv daxil etme");
//			break;
//		case 10, 11, 12:
//			System.out.println("Fall");
//		break;
//		}

		// byte, Byte, short, Short, int, Integer, var, enum constant - switch
		// literal values, compile time constant or final variables, enum constant -
		// case

		int month = 4;

		String result = switch (month) {
		case 1, 2, 3 -> {System.out.println("Qis fesli"); yield "Winter";}
		case 4, 5, 6 -> {
			System.out.println("Yaz fesli");
			yield "Spring"; //eger blok daxilinde deyer qaytarilacaqsa switch-exp onda yiled acar sozu yazilmalidir
		}
		case 7, 8, 9 -> "Summer";
		case 10, 11, 12 -> "Fall";
		default -> "Sehv daxil etme";
		};

		System.out.println(result);
	}
}
