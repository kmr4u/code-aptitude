package com.etc.aptitude;
/*
 * 

An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

    class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given
    A = [3, 8, 9, 7, 6]
    K = 3

the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]

For another example, given
    A = [0, 0, 0]
    K = 1

the function should return [0, 0, 0]

Given
    A = [1, 2, 3, 4]
    K = 4

the function should return [1, 2, 3, 4]

Assume that:

        N and K are integers within the range [0..100];
        each element of array A is an integer within the range [−1,000..1,000].

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

 */
public class RotateArray {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,5,6};
		RotateArray obj = new RotateArray();
		//System.out.println(obj.solution(A, 3));
		A = obj.solution(A, 4);
		for(int n: A)
			System.out.print(n+" ");
	}
	
	private int[] solution(int[] A, int k)
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
			/*for(int i = 0; i<k; i++)
			{
				rotateArrayRight(A);
			}*/
		}
		
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
