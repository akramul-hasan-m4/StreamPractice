import java.util.ArrayList;
import java.util.List;
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
		
		List<Abc> list= new ArrayList<Abc>(); 
		
		list.add(new Abc(1,"singgara",20));
		list.add(new Abc(2,"apple",200));
		list.add(new Abc(3,"orange",5000));
		list.add(new Abc(4,"banana",8000));
		
		List<Abc> l=list.stream().filter(aList-> aList.id==2).map(a-> a).collect(Collectors.toList());
		
		System.out.println(l.get(0).name.toUpperCase()+", length = "+l.size());
		//print 5 number
		Stream.iterate(2,e-> e+1).filter(e->e%2!=0).limit(5).forEach(System.out::println);
		
	}
}
