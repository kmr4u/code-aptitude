package practice.org;

import java.util.Date;

public class BuilderClient {

	public static void main(String[] args)
	{
		HumanAttributeBuilder human = new HumanAttributeBuilder.Builder("Madhu", "Reddy").age(24).dob(new Date(1993, 03, 23)).gender("Male").height(5.8).weight(65).build();
		
		System.out.println(human);
	}
}
