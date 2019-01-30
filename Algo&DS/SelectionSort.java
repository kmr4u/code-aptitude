
public class SelectionSort {
	
	public int[] sort(int[] a)
	{
		
		for(int i=0; i<a.length; i++)
		{
			int min = i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[min])
				{
					min = j; //Index of the smallest element in the remaining array
				}
			}
			
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}
		
		return a;
	}
	
}
