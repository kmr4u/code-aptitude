package practice.org;

public class Heap {

	private static int[] heap;
	private static int size;
	
	Heap(int capacity)
	{
		heap = new int[capacity];
	}
	
	public static void main(String[] args)
	{
		Heap myHeap = new Heap(10);
		myHeap.insert(50);
		myHeap.insert(40);
		myHeap.insert(52);
		myHeap.insert(45);
		myHeap.insert(60);
		myHeap.insert(35);
		myHeap.insert(30);
		myHeap.insert(69);
		myHeap.insert(43);
		myHeap.insert(65);
		
		System.out.println("Heap After construction");
		for(int i: heap)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Popping elements out in priority");
		for(int i=0 ; i<heap.length; i++)
		{
			System.out.print(myHeap.delete(0)+" ");
		}
		
	}
	public void insert(int value) {
		if(!isFull())
		{
			heap[size] = value;
			if(value > heap[getParentIndex(size)])
				fixHeapAbove(size);
		}	
		
		size++;
	}
	
	public int delete(int index)
	{
		if(isEmpty())
			throw new ArrayIndexOutOfBoundsException("Heap is Empty!");
		
		int parentIndex = getParentIndex(index);
		int deletedValue = heap[index];
		heap[index] = heap[size-1];
		
		if(index == 0 || heap[index] < heap[parentIndex] ) //Either deleting a root or the replaced value needs heapifying
		{
			fixHeapBelow(index, size-1);
		}
		else fixHeapAbove(index);
		
		//heap[size] = null; Null out the last heap index
		size--;
		return deletedValue;
	}
	
	private boolean isFull()
	{
		return size == heap.length;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	private void fixHeapAbove(int i)
	{
		int value = heap[i];
		while(value > heap[getParentIndex(i)] && i != 0)
		{
			heap[i] = heap[getParentIndex(i)];
			i = getParentIndex(i);
		}
		heap[i] = value;
	}
	
	private void fixHeapBelow(int i, int lastHeapIndex)
	{
		
		int childToSwap;
		while(i <= lastHeapIndex)
		{
			int leftChildIndex = getChildIndex(i,true);
			int rightChildIndex = getChildIndex(i, false);
			
			if(leftChildIndex <= lastHeapIndex)
			{
				if(rightChildIndex > lastHeapIndex) //doesn't have a right child
					childToSwap = leftChildIndex;
				else
					childToSwap = heap[leftChildIndex] > heap[rightChildIndex] ? leftChildIndex : rightChildIndex; //swap with the greater of the children
				
				if(heap[i] < heap[childToSwap]) //swap parent with the greater children
				{
					int temp = heap[i];
					heap[i] = heap[childToSwap];
					heap[childToSwap] = temp;
				}
				else break;
				
				i = childToSwap;
			}
			else
				break;
		}
		
	}
	private int getParentIndex(int i)
	{
		return (i-1)/2;
	}
	
	private int getChildIndex(int i, boolean left)
	{
		return 2*i + (left ? 1 : 2);
	}
	
	
}
