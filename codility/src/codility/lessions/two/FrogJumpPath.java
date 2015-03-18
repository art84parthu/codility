package codility.lessions.two;

public class FrogJumpPath {
	public static int solution(int X, int[] A) {
        boolean[] mem = new boolean[X];
        int covered = X;
        
        for(int i=0; i< A.length; i++){
            if(A[i] > X || A[i] <= 0){
                continue;
            }
            
            if(!mem[(A[i]-1)]){
                mem[(A[i]-1)] = true;
                covered -= 1;   
            }
            if(covered == 0){
                return i;
            }
        }
        
        return -1;
    }
}
