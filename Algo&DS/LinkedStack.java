
public class LinkedStack<Item> {

	private Node top = null;
	
	private class Node
	{
		Item item;
		Node next;
	}
	
	public void push(Item item)
	{
		Node oldTop = top;
		top = new Node();
		top.item = item;
		top.next = oldTop;
	}
	public Item pop()
	{
		if(!isEmpty())
		{
			Item out = top.item;
			top = top.next;
			return out;
		}
		
		return null;
	}
	public boolean isEmpty()
	{
		return top == null;
	}
}
