import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PrimeNumber {

	public static void main(String[] args) {
		IntStream.rangeClosed(2, 100)
				.filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i)).allMatch(j -> i % j != 0)).forEach(n -> {
					System.out.println("prime number = " + n);
				});
		System.out.println("factorial number is " + factorial(5));
		System.out.println(PrimeNumber.generate(10)); // fibonacci 
		System.out.println(2+3*(5+4));

	}

	private static int factorial(int number) {
		return IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
	}

	public static List<Integer> generate(int series) {
		return Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] }).limit(series).map(n -> n[0])
				.collect(toList());
	}

}
