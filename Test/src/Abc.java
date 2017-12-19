import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Abc {

	public int id;
	public String name;
	public int price;
			
	public Abc() {
		super();
	}

	public Abc(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		
		Abc akramul=new Abc();
		List<Abc> list= new ArrayList<Abc>(); 
		
		list.add(new Abc(1,"singgara",20));
		list.add(new Abc(2,"apple",200));
		list.add(new Abc(3,"orange",5000));
		list.add(new Abc(4,"banana",8000));
		
		List<Integer> l=list.stream().filter(aList-> aList.name=="apple").map(a-> a.price).collect(Collectors.toList());
		
		//System.out.println(l);
		Stream.iterate(2,e-> e+1).filter(e->e%2!=0).limit(10).forEach(System.out::println);
		
	}
}
