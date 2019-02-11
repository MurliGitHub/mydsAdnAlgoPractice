package m2j.mustdo.dp;

import m2j.commons.CommonUtil;

/**
 * 
 *
 *
 *         problem: Constraints: 1<=T<=200 1<=size(str1),size(str2)<=100
 * 
 *         Example: Input: 2 6 6 ABCDGH AEDFHR 3 2 ABC AC
 * 
 *         Output: 3 2
 */
public class _2LongestCommonSubsequence {
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		// Test case2:- L(“ABCDGH”, “AEDFHR”)
		int lcs = findLongestCommonSubsequence(s1, s2);
		System.out.println("Length of lcs is: "+ lcs);
	}

	private static int findLongestCommonSubsequence(String s1, String s2) {
		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length;
		int n = Y.length;
		
		int[][] lcs = new int[m+1][n+1];
		
		for (int i = 0; i <= m; i++) {	
			for (int j = 0; j <= n; j++) {
				
				if(i == 0 || j == 0){
					lcs[i][j] = 0;
				}else if(X[i-1] == Y[j-1]){
					lcs[i][j] = lcs[i-1][j-1]+1;
				}else{
					lcs[i][j] = CommonUtil.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}
		//
		
		
		/*
		   * Print LCS
		   */
		int index = lcs[m][n]; 
        int temp = index; 
        
     // Create a character array to store the lcs string 
        char[] lc = new char[index+1]; 
        lc[index] = ' '; // Set the terminating character 
        
        int i = m, j = n; 
        while (i > 0 && j > 0) 
        { 
            // If current character in X[] and Y are same, then 
            // current character is part of LCS 
            if (s1.charAt(i-1) == s2.charAt(j-1)) 
            { 
                // Put current character in result 
                lc[index-1] = s1.charAt(i-1);  
                  
                // reduce values of i, j and index 
                i--;  
                j--;  
                index--;      
            } 
   
            // If not same, then find the larger of two and 
            // go in the direction of larger value 
            else if (lcs[i-1][j] > lcs[i][j-1]) 
                i--; 
            else
                j--; 
        } 
   
        // Print the lcs 
        System.out.print("LCS of "+s1+" and "+s2+" is "); 
        for(int k=0;k<=temp;k++) 
            System.out.print(lc[k]); 
        
        System.out.println();
		
		//
		return lcs[m][n];

	}

}
