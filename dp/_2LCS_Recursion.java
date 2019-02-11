package m2j.mustdo.dp;

import m2j.commons.CommonUtil;

public class _2LCS_Recursion {
	public static void main(String[] args) {

		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		// Test case2:- L(“ABCDGH”, “AEDFHR”)
		int lcs = lcs(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
		System.out.println("Length of lcs is: " + lcs);

	}

	private static int lcs(char[] s1, char[] s2, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		else if (s1[m - 1] == s2[n - 1])
			return 1 + lcs(s1, s2, m - 1, n - 1);
		else
			return CommonUtil.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
	}
}
