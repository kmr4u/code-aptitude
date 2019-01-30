
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1, 2, 3, 4, 5};
		int K = 3;
		
		new RotateArray().solution(A, K);
		

	}
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        if(A.length == K)
            return A;
        else
        {
            for(int i=0; i<K; i++)
            {
            	 rotateOnce(A);
            	 System.out.println("Array after "+i+"th rotation: ");
            	 for(int j=0; j<A.length; j++)
            	 {
            		 System.out.print(A[j]+" ");
            	 }
            	 System.out.println();
            }   
        }
        return A;
    }
    public void rotateOnce(int[] arr)
    {
        int[] rotate = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            rotate[i] = arr[i];
        }
        for(int i=0; i<arr.length; i++)
        {
            if(i+1 >= arr.length)
                arr[0] = rotate[i];
            else{
                arr[i+1] = rotate[i];
            }
        }
    }

}
