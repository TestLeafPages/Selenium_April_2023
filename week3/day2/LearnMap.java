package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
public static void main(String[] args) {
	Map<Integer, String> map = new LinkedHashMap<>();
	map.put(1004, "Venky");
	map.put(1005, "Prasanna");
	map.put(1001, "Arun");
	map.put(1006, "Srikanth");
	map.put(1002, "Bala");
	map.put(1003, "Aravindh");
	map.put(1002, "Annamalai");
	System.out.println(map);
	String string = map.get(1002);
	// Map is a collection of <key,value> pair of data
	// <key,value> -> Entry = Map -> Collection<Set> of Entry
	Set <Entry <Integer, String> > set = map.entrySet();
	
	for (Entry<Integer, String> eachEntry : set) {
		System.out.println(eachEntry.getKey());
		System.out.println(eachEntry.getValue());
	}
	System.out.println("---------------------------------------------------");
	Set<Integer> keys = map.keySet();
	for (Integer eachKey : keys) {
		System.out.println(eachKey);
		System.out.println(map.get(eachKey));
	}
	map.containsKey(1001);
	map.containsValue("Arun");
	
	
	
	
	
	
}
}
