package week1.day2;

import java.util.Arrays;

public class LearnArrays {
public static void main(String[] args) {
	String name = "Dhinesh";
	String[] names = {"Dhinesh","Sandhya","Bala Murugan","Anupama","Naveen"};
	System.out.println(names.length);
	for(int i = 0; i < names.length;i++) {
		System.out.println(names[i]);
	}
//	System.out.println(names[5]);
	
	int[] empIDs = new int[5];
	empIDs[0] = 9876;
	empIDs[1] = 7854;
	empIDs[2] = 7890;
	empIDs[3] = 3456;
	Arrays.sort(empIDs);
	for (int i = 0; i < empIDs.length; i++) {
		System.out.println(empIDs[i]);
	}
	
}
}
