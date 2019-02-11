package m2j.mustdo.dp;

import m2j.commons.CommonUtil;

public class _1LogestIncresingSubsequence {
	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is "
                           + lisByNaive(arr, n));
	}

	private static int lisByNaive(int[] arr, int n) {
		
		int[] list =  new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			list[i]=1;
		}
		
//		CommonUtil.print(list);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i]>arr[j] && list[i]<list[j]+1) {
					list[i]=list[j]+1;
				}
			}
		}
		
		int max=0;
		/* Pick maximum of all LIS values */
        for ( int i = 0; i < n; i++ )
           if ( max < list[i] )
              max = list[i];

        
        CommonUtil.print(list);
        
         return max;
	}
}
