package practice.org;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WildCard {

	public static <T> void main(String args[])
	{
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("A");
		l1.add("B");
		l1.add("C");
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(new Integer(1));
		l2.add(new Integer(2));
		l2.add(new Integer(3));
		
		List<?> l3 = new WildCard().union(l1, l2);
		
		System.out.println(l3.toString());
		//float[] a = {1.0f, 2.0f, 3.0f}; 
		
		List<Float> l4 = new ArrayList<>();
		l4.add(1.0f);
		l4.add(2.0f);
		l4.add(3.0f);
		l4.add(4.0f);
		
		List<Number> l5= new WildCard().unionNumber(l2, l4); 
		System.out.println(l5);
		
	}
	
	public <T> List<? super T> union(List<? extends T> l1, List<? extends T>l2)
	{
		List<T> entries = new ArrayList<T>();
		
		for(T str: l1)
		{
			entries.add(str);
			
		}
		for(T num: l2)
		{
			entries.add(num);
		}
			
		return entries;
	}
	
	public List<Number> unionNumber(List<? extends Number> l1, List<? extends Number> l2)
	{
		List<Number> numList = new ArrayList<Number>();
		l1.remove(1);
		numList.addAll(l1);
		numList.addAll(l2);
		
		return numList;
		
	}
}
