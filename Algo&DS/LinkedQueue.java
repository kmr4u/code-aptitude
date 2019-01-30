
public class LinkedQueue {

	private String[] Q;
	private Node first = null;
	private Node last = null;
	
	private class Node
	{
		String item;
		Node next;
	}
	
	public String dequeue()
	{
		String item = first.item;
		first = first.next;
		
		if(isEmpty())
			last = null;
		
		return item;
	}
	public void enqueue(String item)
	{
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		if(isEmpty())
			first = last;
		else
			oldLast.next = last;
		
	}
	public boolean isEmpty()
	{
		return first == null;
		
	}
}
