import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Loping {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).map(i ->  i).forEach(i-> System.out.println("even number = "+i));
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 1).map(i ->  i).forEach(System.out::println);
		IntStream.rangeClosed(2, 30).filter(n -> n % 2 == 1 ).map(i ->  i).forEach(i-> System.out.println("prime number = "+i));
		//convert intStream to Integer use boxed
		Stream<Integer> stream = IntStream.range(1, 5).boxed();  
		System.out.println(stream);
	}
}
