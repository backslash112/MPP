package lesson8.labs.prob1.partG;

import java.util.function.DoubleConsumer;

public class MyClass {
	public void accept(double v) {
		DoubleConsumer dc = value -> {
			System.out.println(value);
		};
		dc.accept(v);
	}
}
