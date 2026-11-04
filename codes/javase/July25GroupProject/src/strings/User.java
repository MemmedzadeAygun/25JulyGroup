package strings;

public class User {
	String name;
	String surname;
	int age;

	public static void main(String[] args) {
		// tip reference = object
//		User user = new User();
//		user.name = "Veli";
//		user.surname = "Mememdov";
//		user.age = 35;
//		
//		System.out.println(user.name);
//		
//		User user2 = new User();
//		user2.name = "Ehmed";
//		System.out.println(user2.name);
//		
//		System.out.println(user.name);
//		System.out.println(user.surname);
//		System.out.println(user.age);
//		
//		System.out.println(user);

//		String name = "Eli";
//		String fullName = "Eli" + " Qedimov";
//		System.out.println(name);
//		System.out.println(fullName);
//		System.out.println(fullName.length());

//		String s = 12 + 23 + " ";
//		String s = 12 + "" + 14;
//		int var  =12;
//		String s = var + "" + 14;
//		String s = null + " " + 14;
//		String s = null + 14 + " " ;

//		String s = false + " " + true;
//		String s = false + " ";
//		System.out.println(s);

//		String name = "Eli";
//		String strObj = new String("Eli");
//		String strObj2 = strObj;
//		
//		System.out.println(strObj);
//		System.out.println(name);

//		System.out.println(name == strObj); 
//		System.out.println(name.equals(strObj));
//		System.out.println(strObj2 == strObj); 

//		String username = "user";
//		String concat = username.concat("user2"); //useruser2
//		
//		System.out.println(username);
//		
//		System.out.println(concat);

//		System.out.println(username.charAt(2));
//		System.out.println(username.indexOf('s'));

//		String name = "Xedice";
//		String name2 = "xedice";

//		System.out.println(name.equals(name2));
//		System.out.println(name.equalsIgnoreCase(name2));

//		String s1 = "Apple";
//		String s1 = "	 Biz proqramlasdirma oyrenirik	";
//		String s1 = "Biz proqramlasdirma oyrenirik.";
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.replace("p", "*"));
//		System.out.println(s1);
//		System.out.println(s1.trim());
//		System.out.println(s1.startsWith("Biz"));
//		System.out.println(s1.endsWith("."));

//		String str = " ";
//		System.out.println(str.isBlank());
//		System.out.println(str.isEmpty());
		
//		String s1 = "Biz, proqramlasdirma, oyrenirik.";
//		String[] split = s1.split("i");
//
//		for (String string : split) {
//			System.out.println(string);
//		}
		
//		String s1 = "Biz, proqramlasdirma, oyrenirik.";
//		System.out.println(s1.substring(5, 21));
//		System.out.println(s1.substring(5));
//		System.out.println(s1.contains("proqram2"));
		
//		String a = "apple";
//		String b = "banana";
//		String c = "apple";
//		
//		System.out.println(a.compareTo(b)); //eger 1-ci string 2-ciden kicikdirse netice -1 olur
//		System.out.println(b.compareTo(a));//eger 1-ci string 2-ciden boyukdursa netice 1 olur
//		System.out.println(a.compareTo(c)); //eynidirse netice 0 olur
		
		
//		String str = "1234567809";
//		String str = "1234567809ahfAGH,";
		
//		System.out.println(str.matches("[0-9]"));
//		System.out.println(str.matches("[0-9]{5}"));
//		System.out.println(str.matches("[0-9]+"));
//		System.out.println(str.matches("[0-9a-z]+"));
//		System.out.println(str.matches("[0-9a-zA-Z,]+"));
		
		
//		String s1 = "Java";
//		String s2 = "Java";
//		String s3 = new String("Java");
//		String s4 = s3.intern();
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
//		System.out.println(s1 == s4);
		
//		String sentence = "Mən Java Öyrənirəm Və Java İlə Layihələr Hazırlayıram. Java Öyərnmək Mənim Xoşuma Gəlir";
//        String searchWord = "Java";
//        
//        int count = 0;
//        int index = sentence.indexOf(searchWord);
//       
//        while (index != -1) {
//            count++;
//            index = sentence.indexOf(searchWord, index + 1);
//        }
//        
//        System.out.println("In This sentence '" + searchWord + "' count: " + count);
		
//		int count = 0;
//        
//        for (int i = 0; i < sentence.length(); i++) {
////			System.out.println(sentence.indexOf("Java", i) == i);
//        	if (sentence.indexOf("Java", i) == i) {
//        		count++;
//			}
//		}
//        
//        System.out.println(count);
		
	
		String str = "Ali Qedimov124";
//		str.split("1"); [Ali Qedimov, 24]
	}
}
