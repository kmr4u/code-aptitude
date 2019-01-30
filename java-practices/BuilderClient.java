package com.etc.practice;

import java.util.Date;

public class BuilderClient {

	public static void main(String[] args)
	{
		HumanAttributeBuilder builder = new HumanAttributeBuilder.Builder("Madhu", "Reddy").gender("M").age("25").height(5.9).weight(65).dob(new Date(1993, 03, 23)).build();
		
		System.out.println(builder);
	}
}
