package com.etc.aptitude;

import java.util.HashSet;
import java.util.Set;

/*
 * 

A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2

is a permutation, but array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3

is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2

the function should return 1.

Given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3

the function should return 0.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [1..1,000,000,000].


 */
public class PermCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SolutionPerm {
    private final int PERMUTATION = 1;
    private final int NOT_PERMUTATION = 0;
    public int solution(int[] A) {
        
		Set<Integer> set = new HashSet<>();
		int N = A.length;
		
		if(N == 0)
			return PERMUTATION;
		
		for(int i=0; i<N; i++)
		{
			if(A[i] > N)
				return NOT_PERMUTATION;
		}
		
		for(int i=0; i<N; i++)
		{
			if(!set.add(A[i]))
				return NOT_PERMUTATION;
		}
		
		return PERMUTATION;
	
    }
}