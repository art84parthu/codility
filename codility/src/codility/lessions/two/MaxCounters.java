package codility.lessions.two;

public class MaxCounters {
	public int[] solution(int N, int[] A) {
	       int[] counters = new int[N];
	       int curMax = 0;
	       int prevMax = 0;
	       
	       for(int i=0; i<A.length; i++){
	           int index = A[i]-1;
	           if(A[i] >= 1 && A[i] <= N){
	               if(counters[index] < prevMax){
	                   counters[index]=prevMax;
	               }
	               counters[index] += 1;
	               if(curMax < counters[index]){
	                    curMax = counters[index];
	               }
	           }else if (A[i] > N){
	              prevMax=curMax;
	           }
	       }
	       
	       for(int i=0; i<N; i++){
	           if(counters[i] <prevMax){
	                counters[i] = prevMax;
	           }
	       }
	       
	       return counters;
	    }
}
