import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HHH {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		Stream.iterate(1, n -> n + 2).limit(4).forEach(l -> {
			System.out.println("Enter number");
			num.add(s.nextInt());
			System.out.println(l);
		});
		s.close();
		int total = num.get(0) + num.get(1) * (num.get(2) + num.get(3));
		System.out.println("Total number is " + total);
	}
}
