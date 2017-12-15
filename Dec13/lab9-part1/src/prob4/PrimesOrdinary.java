package lesson9.labs.prob4;

public class PrimesOrdinary {
	public static int nextPrime(int num) {
		if(num < 2) return 2;
		int next = num + 1;
		while(!isPrime(next)) {
			next = next + 1;
		}
		return next;
	}
	
	public static boolean isPrime(int n) {
		for(int k = 2; k * k <= n; ++k) {
			if(n % k == 0) return false;
		}
		return true;
		
	}
	
	
	
	
	
}
