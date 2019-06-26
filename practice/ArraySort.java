package practice.org;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args)
	{
		int[][] A = new int[4][4];
		
		Scanner scan = new Scanner(System.in);
		int k = 1;
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				A[i][j] = k++;
			}
		}
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(A[i][j]+" ");
			}
		}
		
		int[] temp = new int[3];
		for(int i=1; i<=3; i++)
		{
			temp = A[i];
		
			//Arrays.sort(temp, c);
		}
		
	}
}
