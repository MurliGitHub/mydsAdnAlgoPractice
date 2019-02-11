package m2j.mustdo.dp;

public class _3_01Knapsack {
	public static void main(String[] args) {
		int valArray[] = new int[] { 60, 100, 120 };
		int wtArray[] = new int[] { 10, 20, 30 };
		int maxWt = 50;
		int n = valArray.length;
		System.out.println(knapSack(maxWt, wtArray, valArray, n));
	}

	/**
	 * @param maxWt:- max wt it can have in a knapsack
	 * @param wtArray:- array of weight
	 * @param valArray
	 * @param n
	 * @return
	 */
	private static int knapSack(int maxWt, int[] wtArray, int[] valArray, int n) {
 
		int[][] temp= new  int[n+1][maxWt+1];
		
		
		return -1;
	}

}
