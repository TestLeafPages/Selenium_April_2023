package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<>();
	set.add("Arun");
	set.add("Bala");
	boolean first = set.add("Chandru");
	set.add("Shakthi");
	set.add("Eshwar");
	set.add("George");
	set.add("Farook");
	boolean second = set.add("Chandru");
	System.out.println(first +"->"+second);
	System.out.println(set);
	for(String eachValue:set) {
		System.out.println(eachValue);
	}
	List<String> list = new ArrayList<>(set);
//	list.addAll(set);
	
	
	
	
	
	
	
	
}
}
