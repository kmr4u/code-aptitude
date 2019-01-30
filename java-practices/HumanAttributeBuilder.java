package com.etc.practice;

import java.util.Date;

public class HumanAttributeBuilder {
	
	private final String fN;
	private final String lN;
	private final String gender;
	private final String age;
	private final Date dob;
	private final double height;
	private final double weight;
	
	
	public static class Builder{
		private final String fN;
		private final String lN;
		
		private String gender="";
		private String age = "";
		private Date dob = new Date(1993, 03, 23);
		private double height = 5.5;
		private double weight = 55;
	
		public Builder(String fN, String lN)
		{
			this.fN=fN;
			this.lN=lN;
		}
		
		public Builder gender(String value)
		{
			gender = value;
			return this;
		}
		
		public Builder age(String value)
		{
			age = value;
			return this;
		}
		
		public Builder dob(Date value)
		{
			dob = value;
			return this;
		}
		
		public Builder height(double value)
		{
			height = value;
			return this;
		}
		
		public Builder weight(double value)
		{
			weight = value;
			return this;
		}
		
		public HumanAttributeBuilder build()
		{
			return new HumanAttributeBuilder(this);
		}
		
	}
	
	private HumanAttributeBuilder(Builder builder)
	{
		fN = builder.fN;
		lN = builder.lN;
		dob = builder.dob;
		age = builder.age;
		gender = builder.gender;
		height = builder.height;
		weight = builder.weight;
		
	}

	@Override
	public String toString()
	{
		return fN+" "+lN+", "+"DOB: "+dob+", gender:"+gender+", age: "+age+", height:"+height+", weight:"+weight+"";
	}
	
	@Override
	public int hashCode()
	{
		return this.fN.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		//return this.fN.compareTo(obj.);
		return false;
	}
}
