package p1658_MinimumOperationsToReduceXToZero;

//TODO

/*
 * You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.
 * 
 * Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
 */

//idea: find largest subarray where the numbers left outside
//pick a number, try preferring left, then preferring right
class Solution {
    public int minOperations(int[] nums, int x) {
        //instead of remaking the array each time we change a number, we will instead keep track of the bounds of what the new array would be
    	int leftIndex = 0;
        int rightIndex = nums.length-1;
        
        int numOfOperations = 0;
        
    	return -1;
    }
    
    
    //helper function which sums the numbers outside of two indexes of an array
    int addNumsOutside(int left, int right, int[] nums) {
    	return 0;
    }
}