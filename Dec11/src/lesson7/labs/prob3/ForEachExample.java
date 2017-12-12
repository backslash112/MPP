package lesson7.labs.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(new ForEachExample().consumer);
	}

	//implement a Consumer
	Consumer<String> consumer = new Consumer<>() {
		@Override
		public void accept(String str) {
			System.out.println(str.toUpperCase());
		}
	};
	
	
	
}