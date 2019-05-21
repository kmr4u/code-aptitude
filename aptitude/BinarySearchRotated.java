package practice.org;

import java.util.Arrays;
import java.util.Scanner;

/*
 * [0, 1, 2, 3, 4, 5, 6]
 * [6, 0, 1, 2, 3, 4, 5]
 * [5, 6, 0, 1, 2, 3, 4]
 * [4, 5, 6, 0, 1, 2, 3]
 * [3, 4, 5, 6, 0, 1, 2]
 * 
 * */
public class BinarySearchRotated {
	
	public static void main(String[] args)
	{
		int[] a = {6,7,8,9,0,1,2,3,4};
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.print("enter the pivot: ");
			int k = scan.nextInt();
			
			System.out.print("enter the number u want to search for: ");
			
			int key = scan.nextInt();
			
			System.out.println("Array Before Rotating: ");
			Arrays.stream(a).forEach(System.out::print);
			System.out.println();
			
			RotateArray rotate = new RotateArray();
			int[] arr = rotate.solution(a, k);
			System.out.println("Index of the element: "+binarySearch(arr, 0, a.length-1, key));
		}
	}
	
	public static int binarySearch(int[] a, int low, int high, int key)
	{
		if( high < low )
		{
			return -1;
		}
		int mid = (low+high)/2;
		
		if(a[mid] == key)
			return mid;
		
		if(a[low] <= a[mid]) //First Subarray is sorted
		{
			if(key >= a[low] && key < a[mid])
				return binarySearch(a, low, mid-1, key);
			
			return binarySearch(a, mid+1, high, key); //Key is in right sub array
		}
		
		if(key > a[mid] && key <= a[high]) // Right sub array must be sorted. key is in right sub array
		{
			return binarySearch(a, mid+1, high, key);
		}
		
		return binarySearch(a, low, mid-1, key);
	}
}

class RotateArray {

	public int[] solution(int[] A, int k)
	{
		if(k == 0)
			return A;
		
		else if (k == A.length)
			return A;
		
		else if(k > A.length)
		{
			for(int i=0; i<k-A.length; i++)
				rotateArrayRight(A);
		} 
		else
		{
			if((A.length - k) < A.length/2)
			{
				for(int i=0; i<(A.length - k); i++)
					rotateArrayLeft(A);
			}
			else {
				for(int i = 0; i<k; i++)
				{
					rotateArrayRight(A);
				}
			}
			
		}
		System.out.println("Array after rotating "+k+" times:");
		Arrays.stream(A).forEach(System.out::print);
		System.out.println();
		return A;
	}
	
	private int[] rotateArrayRight(int A[])
	{
		int last = A[A.length-1];
		for(int i=A.length-2; i>=0; i--)
		{
			A[i+1] = A[i];
		}
		A[0] = last;
		
		return A;
	}
	private int[] rotateArrayLeft(int A[])
	{
		int first = A[0];
		for(int i=0; i<A.length-1; i++)
		{
			A[i] = A[i+1];
		}
		A[A.length-1] = first;
		return A;
	}

}