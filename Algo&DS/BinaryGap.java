import java.util.Scanner;


public class BinaryGap {
	public static void main(String args[])
	{
		System.out.println("Enter a Number");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		new BinaryGap().binaryGap(N);
		
	}
	public int binaryGap(int N) {
        // write your code in Java SE 8
        
        String binary = "";
        int binaryGap = 0;
        int j=0;
        binary = getBinary(N);
        
        System.out.println("Binary representation of "+N+" is: "+binary);
        
        for(int i=0; i<binary.length(); i++)
        {
            if(binary.charAt(i) == '0')
                j++;
            else{
                if(j>binaryGap)
                    binaryGap = j;
                	j=0;
            }
        }
        System.out.println("Binary Gap of "+N+" is: "+binaryGap);
        return binaryGap;
    }
    
    public String getBinary(int N)
    {
        String binary="";
        
        while(N>0)
        {
            binary =  N%2 + binary;
            N = N/2;
        }
        return binary;
    }
}
