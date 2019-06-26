package practice.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomIterator{
	
	public static void main(String[] args)
	{
		CustomCollection myCollection = new CustomCollection();
		/*for(String item : myCollection)
		{
			System.out.println(item);
		}*/
		for(Iterator itr = myCollection.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		
	}
}

class CustomCollection implements Iterable<String>{

	public List<String> items = new ArrayList<>();
	
	public CustomCollection() {
		items.add("Jon");
		items.add("Dany");
		items.add("Tyrion");
		items.add("Jamie");
		items.add("Cersei");
		items.add("Arya");
	}
	
	private class MyIterator implements Iterator<String>{
		
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < items.size();
		}

		@Override
		public String next() {		
			return  items.get(index++);
		}	
	}
	
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator();
	}

}
