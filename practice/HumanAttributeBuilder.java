package practice.org;

import java.util.Date;

public class HumanAttributeBuilder {
	
	private final String fN;
	private final String lN;
	private final String gender;
	private final int age;
	private final Date dob;
	private final double height;
	private final double weight;
	
	public static class Builder{
		
		private final String fN;
		private final String lN;
		
		private String gender;
		private int age;
		private Date dob;
		private double height;
		private double weight;
		
		public Builder(String fN, String lN)
		{
			this.fN = fN;
			this.lN =lN;
		}
		
		public Builder gender(String value)
		{
			gender = value;
			return this;
		}
		
		public Builder age(int value)
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
		age = builder.age;
		dob = builder.dob;
		gender = builder.gender;
		height = builder.height;
		weight = builder.weight;
	}
	
	@Override
	public String toString()
	{
		return ""+fN+" "+lN+", gender:"+gender+", age:"+age+", dob:"+dob+", height:"+height+", weight:"+weight;
	}

}
