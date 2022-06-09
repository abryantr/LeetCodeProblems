package p412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer n, return a string array answer (1-indexed) where:
 * 		answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * 		answer[i] == "Fizz" if i is divisible by 3.
 * 		answer[i] == "Buzz" if i is divisible by 5.
 * 		answer[i] == i (as a string) if none of the above conditions are true.
 */
public class Solution {
	public List<String> fizzBuzz(int n){
		List<String> output = new ArrayList<String>(n);
		int counterThree = 0;
		int counterFive = 0;
		
		for(int i = 1; i <= n; i++) {
			String outStr = "";
			counterThree++;
			counterFive++;
			if(counterThree != 3 && counterFive != 5) {
				outStr = String.valueOf(i);
			} else {
				if(counterThree == 3) {
					outStr += "Fizz";
					counterThree = 0;
				}
				if(counterFive == 5) {
					outStr += "Buzz";
					counterFive = 0;
				}
			}
			output.add(outStr);
		}
		
		return output;
	}
}
