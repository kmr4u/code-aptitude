
public class Stack<Item> {

	private Item[] st;
	private int top=0;
	
	public Stack(int N)
	{
		st = (Item[])new Object[N];
	}
	
	public void push(Item str)
	{
		if(top == st.length)
			resize(2*st.length);
			
		if( top < st.length)
			st[top++] = str;
		else
			System.out.println("Stack Overflow!");
	}
	public Item pop()
	{
		if(!isEmpty())
		{
			Item item = st[--top];
			st[top] = null;
			
			if(top == st.length/4)
				resize(st.length*2);
			
			return item;
		}
			
		else
			return null;
	}
	
	public boolean isEmpty()
	{
		return top == 0;
	}
	public void resize(int capacity)
	{
		Item[] copy = (Item[])new Object[capacity];
		for(int i=0; i<top; i++)
		{
			copy[i] = st[i];
		}
		st = copy;
	}
}
