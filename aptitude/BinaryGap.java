package com.etc.aptitude;

/*
 * 

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

    int solution(int N);

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].


 */
public class BinaryGap {

	public static void main(String args[])
	{
		//int N = Integer.MAX_VALUE-(128+256)-(512+32+16+8+4);
		int[] IN = {8, 8+2, 32+4+1, 16+4, 64+8+1, 128+16+2, 256+32, 512+64+4, 1024+32+1};
		for(int N:IN){
			System.out.println(N+"--->"+solution(N));
		}
		
	}
	public static int solution(int N) {
        String binary = getBinary(N);
        System.out.println(binary);
        int gap=0;
        int j=0;
        for(int i=0; i<binary.length(); i++)
        {
        	//char c = binary.charAt(i);
        	while(i<binary.length() && binary.charAt(i) == '0')
        	{
        		i++;
        		j++;
        	}
        	//System.out.println("current gap:"+j);
        	/*gap = i>=binary.length() ? 0:(j>gap?j:gap);
        	j=0;*/
        	
        	if(i>=binary.length()) //When the binary number ends in all trailing zeroes. Ex: 8->1000
        		return gap;
        	else
        		gap = j>gap?j:gap;
        	
        	j=0;
        }
        
        return gap;
    }
	
	public static String getBinary(int N)
	{
		if(N == 0)
			return ""+0;
		else if (N == 1)
			return ""+1;
		
		else 
			return ""+ getBinary(N/2) + N%2;
		
		//return "";
	}
	
	    
}
