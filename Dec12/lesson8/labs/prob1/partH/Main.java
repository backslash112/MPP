package lesson8.labs.prob1.partH;

import java.util.stream.DoubleStream;

public class Main {

	public static void main(String[] args) {
		DoubleStream.of(3.14, 3.15)
		.forEach(item -> System.out.print(item));
	}

}
