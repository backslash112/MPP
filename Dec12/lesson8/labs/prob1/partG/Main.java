package lesson8.labs.prob1.partG;

import java.util.stream.DoubleStream;

public class Main {

	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		DoubleStream.of(3.14, 3.15)
			.forEach(mc::accept);
	}

}
