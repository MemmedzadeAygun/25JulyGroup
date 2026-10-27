package operators;

public class Lesson16 {
	public static void main(String[] args) {

		// foreach - array ve Collection - Set, List, Queue
		// 0 //1 //2 //3
		String[] names = { "Nermin", "Miran", "Xedice", "Nergiz" }; // length = 4

		for (String name : names) {
			System.out.println(name);
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].toUpperCase());
		}

//		for(type variable : collection) {
//			
//		}

//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);

//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i].toUpperCase());
//		}

//		for(varType instance : Collection) {
//			
//		}

//		for(String name : names) {
//			System.out.println(name);
//		}

//		String birds = "Sparrow";
//		
//		for(String bird : birds) {
//			
//		}

//		String[] cars = {"Audi", "Toyota", "Porshe"};
//		
//		for(int car : cars) {
//			
//		}

//		int[] prices = {10, 25, 30, 15};

//		LOOP: for(int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				break LOOP;
//			}
//			System.out.println(i);
//		}

//		LOOP: for(int i = 1; i <= 10; i++) {
//			if (i % 2 != 0) {
//				continue LOOP;
//			}
//			System.out.println(i);
//		}

		System.out.println(new String("hello"));

//		OUTERLOOP: for (int i = 1; i <= 3; i++) {
//			INNERLOOP: for (int j = 1; j <= 2; j++) {
//				if (j == 2) {
//					break OUTERLOOP;
//				}
//				System.out.println(i + " " + j);
//			}
//		}

	}
}
