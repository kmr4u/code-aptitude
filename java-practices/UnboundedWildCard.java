package com.etc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UnboundedWildCard {

	public static void main(String args[])
	{
		List<String> strList = new ArrayList<>();
		
		strList.add("A");
		
		//List<String>[] arr1 = new ArrayList<String>[10]; #Compile error - Cannot create a array of generic type
		
		//UnboundedWildCardType Array
		List<?>[] arr = new ArrayList<?>[10];
		arr[1] = strList;
		
		System.out.println(arr[1]);
				
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(Integer.MAX_VALUE);
		
		new UnboundedWildCard().add(strList, intList);
		
		
		Set<String> set1 = new HashSet<String>(Arrays.asList("A", "B", "C"));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		
		//Set<E> union1 = new UnboundedWildCard().union1(set1, set2); #doesn't compile
		
		Set<?> union = new UnboundedWildCard().union2(set1, set2);
	}
	
	private List<?> add(List<?> list1, List<?> list2)
	{
		//List<?> wildList = new ArrayList<>();
		//wildList.addAll(list1); #Compile error
		
		List<Object> wildList = new ArrayList<>();
		
		wildList.addAll(list1);
		wildList.addAll(list2);
		
		System.out.println(wildList);
		Iterator<?> myIterator = list1.iterator();
		
		System.out.println(myIterator.next());
		
		return wildList;
	}
	
	private <E> Set<E> union1(Set<E> s1, Set<E> s2)
	{
		Set<E> union = new HashSet<>(s1);
		union.addAll(s2);
		return union;
	}
	
	private Set<?> union2(Set<?> s1, Set<?> s2)
	{
		Set<Object> union = new HashSet<>(s1);
		union.addAll(s2);
		return union;
	}
}
