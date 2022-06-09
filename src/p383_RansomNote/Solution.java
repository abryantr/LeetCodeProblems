package p383_RansomNote;

import java.util.HashMap;

/*
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 */

public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < magazine.length(); i++) {
        	char c = magazine.charAt(i);
        	if(map.containsKey(c)) {
        		map.replace(c, map.get(c)+1);
        	} else {
        		map.put(c, 1);
        	}
        }
        
        for(int i = 0; i < ransomNote.length(); i++) {
        	char c = ransomNote.charAt(i);
        	if(!map.containsKey(c)) return false;
        	if(map.get(c) < 1) return false;
        	map.replace(c, map.get(c)-1);
        }
		return true;
    }
}
