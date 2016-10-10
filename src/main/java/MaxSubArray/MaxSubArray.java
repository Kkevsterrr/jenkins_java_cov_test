package MaxSubArray;

public class MaxSubArray {

	public int getMaxSum(int[] a) {
		return recurseGetMaxSum(a, 0, a.length - 1);
	}
	
	private int recurseGetMaxSum(int[] a, int startIdx, int endIdx) {
		int maxSingleNeg = Integer.MIN_VALUE;
		while(startIdx <= endIdx && a[startIdx] <= 0) {
			maxSingleNeg = a[startIdx] > maxSingleNeg ? a[startIdx] : maxSingleNeg;
			startIdx++;
		}
		if(startIdx > endIdx) {
			return maxSingleNeg;
		}
		int maxSum = 0;
		int sum = 0;
		for(; startIdx <= endIdx; startIdx++) {
			sum += a[startIdx];
			if(sum < 0) {
				int maxSumInLeftArray = recurseGetMaxSum(a, startIdx + 1, endIdx);
				return maxSumInLeftArray > maxSum ? maxSumInLeftArray : maxSum;
			}
			if(sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}
}
