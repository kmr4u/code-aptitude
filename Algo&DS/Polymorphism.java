
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base b = new Base();
		Sub s = new Sub();
		
		//Sub a = new Base(); Not Allowed!!
		Base x = new Sub();
		
		x.printSomething(); //Hi from Sub class - method overriding
		b.printSomething();
		//x.greeting(); // Not allowed!!
		
		s.baseMethod(); //Greetings from Base Class
	}
}

class Base{
	
	public void printSomething()
	{
		System.out.println("Hi from Base Clsss");
	}
	public void baseMethod()
	{
		System.out.println("Greetings from Base Class");
	}
}

class Sub extends Base
{
	public void greeting()
	{
		System.out.println("Greetings from Sub class");
	}
	
	//public static void printSomething(); // Not allowed!!
	//protected void printSomething(); // Not allowed!!
	public void printSomething()
	{
		System.out.println("Hi from Sub Class");
	}
}