package practice.org;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args)
	{
		//Integer[] A = new Integer[] {10, 99, 56, 2, 86, 12, 4, 49};
		String[] A = new String[] {"Jon", "Dany", "Tyrion", "Arya",  "Sansa", "Jamie",  "Cersei", "Sansa"};
		sort(A);
		Arrays.stream(A).forEach(System.out::println);
	}
	
	public static void sort(Comparable[] a)
	{
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
		
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
	{
		if(hi <= lo) return;
		
		int mid = lo+(hi-lo)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
	{
		//copy over to aux from a
		for(int k=lo; k<=hi; k++) {
			aux[k] = a[k];
		}
		
		int i=lo, j=mid+1;
		
		for(int k=lo; k<=hi; k++)
		{	
			if		(i > mid) a[k] = aux[j++];
			else if (j > hi) a[k] = aux[i++];
			else if (less(aux[j] , aux[i])) a[k] = aux[j++];
			else 	a[k] = aux[i++];
		}
	}
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
}
