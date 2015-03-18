package codility.lessions.one;

public class FrogJump {
	public static int solution(int X, int Y, int D) {
	       if(Y < X || D <= 0) return -1;
	       
	       int stepsQ = (Y-X)/D;
	       int stepsR = (Y-X) % D;
	       if(stepsR >0){
	           return stepsQ+1;
	       }else if(stepsR == 0){
	            return stepsQ;
	       }
	       
	       return -1;
	    }
	
	public static void main(String[] args){
		System.out.println(solution(45, 51, 2 ));
		System.out.println(solution(55, 51, 2 ));
		System.out.println(solution(35, 51, 0 ));
		System.out.println(solution(35, 51, 5 ));
	}
}
