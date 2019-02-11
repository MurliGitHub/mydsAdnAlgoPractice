package m2j.mustdo.dp;

import m2j.commons.CommonUtil;

public class _3_01Knapsack {
	public static void main(String[] args) {
	/*	int valArray[] = new int[] { 6, 10, 12 };
		int wtArray[] = new int[] { 1, 2, 3 };
		int maxWt = 5;*/
		
		int valArray[] = new int[] { 1,4,5,7 };
		int wtArray[] = new int[] { 1, 3, 4, 5 };
		int maxWt = 7;
		System.out.println(knapSack(maxWt, wtArray, valArray));
	}

	/**
	 * @param maxWt:-
	 *            max wt it can have in a knapsack
	 * @param wtArray:-
	 *            array of weight
	 * @param valArray
	 * @param n
	 * @return
	 */
	private static int knapSack(int maxWt, int[] wtArray, int[] valArray) {

		// i is row, w is column

		int[][] temp = new int[valArray.length + 1][maxWt + 1];

		for (int i = 0; i <= valArray.length; i++) {
			for (int w = 0; w <= maxWt; w++) {

				if (w == 0 || i == 0) {
					temp[i][w] = 0;
					continue;
				}
				
				if (w < wtArray[i-1]) {
					temp[i][w] = temp[i - 1][w];
				} else {
					temp[i][w] = CommonUtil.max(valArray[i - 1] + temp[i - 1][w - wtArray[i - 1]], temp[i - 1][w]);
				}
			}
		}

		return temp[valArray.length][maxWt];
	}

}
