package codility.lessions.one;

public class EquArraySplit {
	/*
	 * Split array into two such that
	 * difference in the sum of part 1 and part 2 should be least 
	 */
	
	public static int solution(int[] A){
		int len = A.length;
		
		if(len <= 1) return -1;
		
		if(len == 2) return 1;
		
		int sum1 = A[0];
		int sum2 = 0;
		
		for(int i=1; i<len; i++){
			sum2 += A[i];
		}
		
		int minDiff = Math.abs(sum1-sum2);
		int index = 1;
		for(int i=1; i<len; i++){
			sum1 += A[i];
			sum2 -= A[i];
			
			int diff = Math.abs(sum1-sum2);
			if(diff < minDiff){
				minDiff = diff;
				index = i+1;
			}
		}
		
		return index;
	}
	
	public static void main(String[] args){
		System.out.println(solution(new int[]{1, 2, 3}));
		System.out.println(solution(new int[]{5, 0, 7}));
		System.out.println(solution(new int[]{4, 1, 0, 6, 8}));
	}
}
