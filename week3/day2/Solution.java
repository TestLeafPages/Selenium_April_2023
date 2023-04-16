package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
public static void main(String[] args) {
	String name = "anusha kumar";
	Map<Character,Integer> map = new HashMap<>();
	for(int i=0;i < name.length();i++) {
		char character = name.charAt(i);
		if(map.containsKey(character)) {
			map.put(character, map.get(character)+1);
		}else {
			map.put(character, 1);
		}
	}
	System.out.println(map);
}
}
