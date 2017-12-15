package lesson9.labs.prob4;

import java.util.stream.IntStream;

public class PrimeStream {
	public void printFirstNPrimes(long n) {
		IntStream.iterate(2, i -> PrimesOrdinary.nextPrime(i))
		.limit(n)
		.forEach(System.out::println);
	}
}
