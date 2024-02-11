package ejemplos1;

public class Estatica{
	
	public static int factorial(int i) {
		
		if(i==0) {
			return 1;
		}else if(i<0) {
			return -1;
		}else {
			return i * factorial(i-1);

		}
	}
	
}