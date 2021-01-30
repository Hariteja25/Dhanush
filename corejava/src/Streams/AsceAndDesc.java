package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AsceAndDesc {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);

		System.out.println("***************** List ************************");
		System.out.println(numbers);

		System.out.println("\n***************** create new list with asc order ************************");
		List<Integer> numsAsc = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(numsAsc);

		System.out.println("\n***************** create new list with desc order ************************");
		List<Integer> numsDesc = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(numsDesc);
	}
}