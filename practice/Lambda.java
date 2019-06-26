package practice.org;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


interface Executable{
	int execute(int a, int b);
}

class Run{
	
	public void run(Executable e, int c)
	{
		System.out.println("calling execute()..");
		int val = e.execute(12 , c);
		System.out.println("output from execute: "+val);
	}
}
public class Lambda {

	public static void main(String args[])
	{
		Map<String, Integer> family = new HashMap<String, Integer>();
		
		family.put("Father", 45);
		family.put("Mother", 43);
		family.put("Brother", 25);
		family.put("Sister", 23);
		family.put("GrandMa", 75);
		family.put("GrandPa", 77);
		
		Set<Entry<String, Integer>> entrySet = family.entrySet();
		List<Entry<String, Integer>> ages = new ArrayList<>(entrySet);
		
		ages.forEach(age -> System.out.print(age));
		System.out.println();
		ages.stream().forEach(System.out::print);
		
		Collections.sort(ages, (Map.Entry<String, Integer> o1,
                Map.Entry<String, Integer> o2) -> {
                    return o1.getValue().compareTo(o2.getValue());
                });
		
		System.out.println(ages);
		
		int c = 15;
		Run runner= new Run();
		runner.run((a,b) -> {
			System.out.println("inside execute()");
			return a + b + c;
		}, 17);
		
		// c = 25; mustn't do this
	}
	
	
}
