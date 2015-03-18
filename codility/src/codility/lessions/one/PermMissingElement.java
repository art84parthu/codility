package codility.lessions.one;

public class PermMissingElement {

	public static int solution(int[] A){
		int len = A.length;
		int missingElem = len+1;
		
		for (int i=0; i<len; i++){
			missingElem = missingElem ^ A[i] ^ (i+1);
		}
		
		return missingElem;
	}

	
	public static void main(String[] args){
		System.out.println(solution(new int[]{1, 2, 3}));
		
		System.out.println(solution(new int[]{1, 2, 4}));
		
		System.out.println(solution(new int[]{5, 3, 4, 1}));
	}
	
}