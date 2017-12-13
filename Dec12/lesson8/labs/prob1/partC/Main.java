package lesson8.labs.prob1.partC;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		// Functor
		int result = compute(new Addtion(), 1, 2);
		System.out.println(result);
		
		// Closure
		AtomicInteger i = new AtomicInteger(0);
		Supplier<String> essen = () -> {
			return i.getAndIncrement() + "Kunchen";
		};
		System.out.println(essen.get());
		System.out.println(essen.get());
	}
	
	static int compute(MathOperation mo, int a, int b) {
		return mo.compute(a, b);
	}

}
