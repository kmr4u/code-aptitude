
public class ArrayQueue<Item> {

	private Item[] Q;
	
	private int front=-1;
	private int rear=-1;
	
	public ArrayQueue(int N)
	{
		Q = (Item[])new Object[N];
		
	}
	
	public Item dequeue()
	{
		if(front == -1)
			System.out.println("Q is Empty");
		
		Item item = Q[front];
		
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else if(front == Q.length-1)
		{
			front = 0;
		}
		else
			front++;
		
		
		return item;
	}
	
	public void enqueue(Item item)
	{
		if((rear == Q.length-1 && front == 0) || rear +1 == front)
		{
			System.out.println("Q is Full");
		}
		
		if(rear == Q.length-1)
			rear = 0;
		else
			rear++;
		
		Q[rear] = item;
		
		if(front == -1)
		{
			front = 0;
		}
		
		
	}
	public boolean isEmpty()
	{
		return front == rear;
	}
}
