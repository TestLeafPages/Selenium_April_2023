package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Harini");
	list.add("Shilpa");
	list.add("Prasanna");
	list.add("Srikanth");
	list.add("Aarthi");
	list.add("Bharathy");
	list.add("Srikanth");
	list.add(1, "Praveen");
	list.set(0, "Uday");
	System.out.println(list);
	int size = list.size();
	System.out.println(size);
	list.remove("Prasanna");
	System.out.println(list);
	list.remove("Srikanth");
	System.out.println(list);
	// To sort the list
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	
	boolean contains = list.contains("Bharathy");
	System.out.println(contains);
	
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	int indexOf = list.indexOf("Srikanth");
	System.out.println(indexOf);
	
	list.equals(list);
	
	list.clear();
	boolean empty = list.isEmpty();
	
	
	
	
}
}
