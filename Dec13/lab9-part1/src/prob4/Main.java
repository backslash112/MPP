package lesson9.labs.prob4;

import java.util.stream.Stream;

public class Main {
		
	public static void main(String[] args) {
		
		// Solution for part A:
		final Stream<Integer> primes = Stream
				.iterate(2, num -> PrimesOrdinary.nextPrime(num))
				.limit(10);
		primes.forEach(System.out::println);

		// Solution for part B:
		System.out.println("===");
		PrimeStream ps = new PrimeStream();
		ps.printFirstNPrimes(10);
		System.out.println("===");
//		ps.printFirstNPrimes(5);
	}
}
