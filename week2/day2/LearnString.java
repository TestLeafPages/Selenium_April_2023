package week2.day2;

public class LearnString {
public static void main(String[] args) {
	String name = "testleaf";
	int length = name.length();
	System.out.println("Length: "+length);
	// String is immutable
	String upperCase = name.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = upperCase.toLowerCase();
	System.out.println(lowerCase);
	
	// String concatination
	String text1 = "Good";
	String text2 = "Morning";
	String text3 = text1.concat(text2).concat("People");
	System.out.println(text3);
	String text4 = text1+" "+text2;
	System.out.println(text4);
	
	// String comparison
	String w1 = "testleaf";
	String w2 = "Testleaf";
	String w3 = "leaf";
	boolean equals = w1.equals(w2);
	System.out.println(equals);
	boolean equalsIgnoreCase = w1.equalsIgnoreCase(w2);
	System.out.println(equalsIgnoreCase);
	boolean contains = w1.contains(w3);
	System.out.println(contains);
	
	// String separation
	String t1 = "Testleaf";
	for (int i = 0; i < t1.length(); i++) {
		char charAt = t1.charAt(i);
		System.out.println(charAt);
	}
	
	// "testleaf' -> {'t','e','s','t','l','e','a','f'}
	char[] charArray = t1.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	
	String t2 = "Powerful people comes from powerful places";
	String[] split = t2.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	String substring = t1.substring(4);
	System.out.println(substring);
	String substring2 = t1.substring(0, 4);
	System.out.println(substring2);
	
	
	
	
	
	
	
}
}
