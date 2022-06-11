package p1337_TheKWeakestRowsInAMatrix;

/*
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 * 
 * A row i is weaker than a row j if one of the following is true:
 * 		The number of soldiers in row i is less than the number of soldiers in row j
 * 		Both rows have the same number of soldiers and i < j.
 * 
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 */

public class Solution {
	public int[] kWeakestRows(int[][] mat, int k) {
		
		int[] weakestRows = new int[k];
		boolean[] rowAdded = new boolean[mat.length];
		int currWeakest = 0;
		
		for(int x = 0; x < mat[0].length; x++) {
			for(int y = 0; y < mat.length; y++) {
				if(mat[y][x]==0 && !rowAdded[y]) {
					weakestRows[currWeakest] = y;
					currWeakest++;
					rowAdded[y]=true;
					if(currWeakest == k) return weakestRows;
				}
			}
		}
		
		if(currWeakest < k) {
			for(int y = 0; y < mat.length; y++) {
				if(!rowAdded[y]) {
					weakestRows[currWeakest] = y;
					currWeakest++;
					if(currWeakest == k) return weakestRows;
				}
			}
		}
		
        return weakestRows;
    }
}
