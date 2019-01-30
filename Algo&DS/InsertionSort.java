
public class InsertionSort {

	public int[] sort(int[] a)
	{
		for(int i=1; i<a.length-1; i++)
		{
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			
		}
		return a;
	}
}
