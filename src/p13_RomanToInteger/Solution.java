package p13_RomanToInteger;

import java.util.HashMap;

/*
 * I | 1
 * V | 5
 * X | 10
 * L | 50
 * C | 100
 * D | 500
 * M | 1000
 * 
 * convert a string from roman numerals to an int
 */

public class Solution {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(7);
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int prev = 0;
		int total = 0;
		for(int i = s.length()-1; i >= 0; i--) {
			int curr = map.get(s.charAt(i));
			if(prev > curr) total -= curr;
			else total += curr;
			prev = curr;
		}
		
		return total;
	}
}
