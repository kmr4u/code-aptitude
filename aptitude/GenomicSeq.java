package com.etc.aptitude;

public class GenomicSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "A";
		int[] P = {0};
		int[] Q = {0}; 
		GenomicSeqSolution sol = new GenomicSeqSolution();
		int[] ans = sol.solution(S, P, Q);
		
		System.out.println(S.charAt(0));
		for(int a:ans)
		{
			System.out.println(a+", ");
		}
	}

}
class GenomicSeqSolution {
    private final int A = 1;
    private final int C = 2;
    private final int G = 3;
    private final int T = 4;
    public int[] solution(String S, int[] P, int[] Q) {
    // write your code in Java SE 8
   
    int M = P.length;
    int[] ans = new int[M];
    char c;
    for(int i=0; i<M; i++)
    {
    	if(P[i] == Q[i])
    	{
    		 c = S.charAt(P[i]);
    		 ans[i] = 'A' == c?A:('C' == c ? C:('G' == c? G : T));
    	}	
    	
    	else{
    		String temp = S.substring(P[i],Q[i]);
            
            if(temp.contains("A"))
                ans[i] = A;
            else if(temp.contains("C"))
                ans[i] = C;
            else if(temp.contains("G"))
                ans[i] = G;
            else
                ans[i] = T;
    	}
        
    }
    
    return ans;
}
}