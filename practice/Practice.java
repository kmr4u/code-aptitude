package practice.org;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static void main(String[] args)
	{
	
		/*String str = null;
		Integer test = new Integer("0");
		
		int val = test.intValue();
		
		System.out.println(test++);
		
		System.out.println(null ==null);
		
		String trim = "*		".trim()+"MADHU*  ";
		System.out.println(trim.trim());
		
		String name = "MADHU KOMMULA";
		
		System.out.println( name.replaceAll("\\s",""));*/
		
		//System.out.println(0.1f*3 == 0.3f);
		/*int a = 01;
		double x= 0.1*7;
		double y = 0.3;
		System.out.println(x);
		
		long z = 0;
		int i = 0;
		
		long start= System.currentTimeMillis();
		for(int k = 0; k<Integer.MAX_VALUE; k++)
		{
			z++;
		}
		System.out.println("Time taken for Long: "+(System.currentTimeMillis() - start));
		long begin= System.currentTimeMillis();
		
		for(int k = 0; k<Integer.MAX_VALUE; k++)
		{
			i++;
		}
		System.out.println("Time Taken for Integer: "+(System.currentTimeMillis() - begin));
		*/
		//BigInteger big = BigInteger.valueOf(Long.MAX_VALUE+1);
		/*BigInteger big = new BigInteger("922337203685477582012312321");
		//System.out.println(big.longValue());
		System.out.println(big);
		
		BigInteger big2 = new BigInteger("922337203685477582012312321");
		
		System.out.println(big == big2);
		
		System.out.println(big.equals("922337203685477582012312321"));
		
		System.out.println(big == big2);
		
		System.out.println(big.compareTo(big2));
		
		System.out.println(big.equals(big2));*/
	
		Set<Integer> set = new HashSet<>();
		set.add((int)3.0);
		set.add(3);
		set.add(new Integer(3));
		set.add(Integer.parseInt("2"));
		
		System.out.println(set);
		
		int[] arr1 = { 1, 3, 2, 4, 5};
		int[] arr2 = {1, 2, 3, 4, 5};
		//System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(equals(arr1, arr2));
		
		List<Integer> list1 = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
			}
		};
		List<Integer> list2 = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
			}
		};
		
		System.out.println(list1.equals(list2));
	}

	private static boolean equals(int[] arr1, int[] arr2) {
		if( arr1.length != arr2.length)
			return false;
		
		int xor = 0;
		for(int i=0; i<arr1.length; i++)
		{
			xor = arr1[i] ^ arr2[i];
			if(xor == 1)
				return false;
		}
		
		return true;
	}
	
	private static void addToObject(List<Object> list) {
		list.add("String");
	}
	
	private static void addToSuperStringList(List<? super String> list)
	{
		list.add("hi");
	}
	
	private static <T> void addToGenericList(List<T> list)
	{
		//list.add("hi");
	}
	private static void addToRawList(List list)
	{
		list.add("hi");
	}
	
	private static void addToExtendStringList(List<? extends String> list)
	{
		//list.add("hi");
		list.remove("hi");
		
	}
}
