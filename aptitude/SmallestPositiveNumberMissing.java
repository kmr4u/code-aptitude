package com.etc.aptitude;

/*
 * Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].


 */
public class SmallestPositiveNumberMissing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SmallestPositiveNumberMissingSol
{
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        int N = A.length;
	        int[] counter = new int[N];
	        
	        for(int k: A)
	        {
	            if(k>0 && k<=N)
	            {
	                counter[k-1]++;
	            }
	        }
	        
	        
	        for(int i=0; i<N; i++)
	        {
	            if(counter[i] == 0)
	                return i+1;
	        }
	        
	        return N+1;
	    }
}