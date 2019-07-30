package practice.org;

import java.util.Collection;
import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

	private Node<Item> first;
	private int n;
	private static class Node<Item>{
		private Item data;
		private Node<Item> nxt;
	}
	public Bag()
	{
		first = null;
		n=0;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public void add(Item item) //LIFO
	{
		Node<Item> oldFirst = first;
		first = new Node<Item>();
		first.data = item;
		first.nxt = oldFirst;
		n++;
	}
	
	public boolean addAll(Collection<? extends Item> items)
	{
		items.forEach(item -> add(item));
		return true;
	}
	
	public int size()
	{
		return n;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new BagIterator(first);
	}
	
	//Doesn't allow remove
	private class BagIterator implements Iterator<Item>
	{
		private Node<Item> current;
	
		public BagIterator(Node<Item> first)
		{
			current = first;
		}
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			if(!hasNext()) throw new UnsupportedOperationException();
			Item item = current.data;
			current = current.nxt;
			return item;
		}
		
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
	}

}
