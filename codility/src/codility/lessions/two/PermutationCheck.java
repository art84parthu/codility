package codility.lessions.two;

public class PermutationCheck {
	 public int solution(int[] A) {
	        int len = A.length;
	        boolean[] visited = new boolean[len];
	        
	        for(int i=0; i<len; i++){
	            if(A[i] > len || A[i] <= 0){
	                return 0;
	            }
	            int index = A[i] - 1;
	            if(visited[index]){
	               return 0; 
	            }else{
	                visited[index] = true;
	            }
	        }
	        
	        return 1;
	    }
}
