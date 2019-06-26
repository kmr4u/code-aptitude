package practice.org;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args)
	{
		//Integer[] A = new Integer[] {10, 99, 56, 2, 86, 12, 4, 49};
		String[] A = new String[] {"Jon", "Dany", "Tyrion", "Arya",  "Sansa", "Jamie",  "Cersei", "Sansa"};
		quickSort(A, 0, A.length-1);
		Arrays.stream(A).forEach(System.out::println);;
	}
	
	public static void quickSort(Comparable[] A, int lo, int hi)
	{
	
		if(hi <= lo) return;
		
		int partitionIndex = partition(A, lo, hi);
		quickSort(A, lo, partitionIndex-1);
		quickSort(A, partitionIndex+1, hi);	
		
	}
	
	public static int partition(Comparable[] A, int lo, int hi)
	{
		int i=lo, j=hi+1;
		//int pivot = A[lo];
		while(true)
		{
			while(less(A[++i], A[lo]))
			{
				if(i==hi) break;
			}
			while(!less(A[--j], A[lo]))
			{
				if(j==lo) break;
			}
			
			if(i>=j) break;
			
			swap(A, i, j);
		}
		swap(A, lo, j);
		
		return j;
	}
	
	private static void swap(Comparable[] A, int a, int b)
	{
		Comparable temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	public static boolean  less(Comparable a, Comparable b)
	{
		if(a.compareTo(b) < 0)
			return true;
		else if(a.compareTo(b)> 0)
			return false;
		return false;
	}
}
