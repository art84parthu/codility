package codility.lessions.two;

public class MissingPositiveInteger {
	 public int solution(int[] A) {
	        int N = A.length;
	        boolean[] present = new boolean[N];
	        
	        for(int i=0; i<A.length; i++){
	            if(A[i] <= 0 || A[i] > N){
	                continue;
	            }
	            
	            if(!present[A[i]-1]){
	                present[A[i]-1]=true;
	            }
	        }
	        
	        int smallest = N+1;
	        for(int j=0; j<N; j++){
	            if(!present[j]){
	                return j+1;
	            }
	        }
	        
	        return smallest;
	    }
}
