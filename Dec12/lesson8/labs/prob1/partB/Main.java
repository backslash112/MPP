package lesson8.labs.prob1.partB;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		List<Integer> result = list.stream().filter(i -> i > 4).collect(Collectors.toList());
		System.out.println(result);
		
	}

}

