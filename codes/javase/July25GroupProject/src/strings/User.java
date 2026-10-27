package strings;

public class User {
	String name;
	String surname;
	int age;
	
	public static void main(String[] args) {
	//  tip reference = object
		User user = new User();
		user.name = "Veli";
		user.surname = "Mememdov";
		user.age = 35;
		
		System.out.println(user.name);
		
		User user2 = new User();
		user2.name = "Ehmed";
		System.out.println(user2.name);
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
//		System.out.println(concat);
		
//		System.out.println(username.charAt(2));
//		System.out.println(username.indexOf('s'));
		
		String name = "Xedice";
		String name2 = "xedice";
		
//		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		
	}
}
