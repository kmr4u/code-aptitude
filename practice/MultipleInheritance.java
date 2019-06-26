package practice.org;

public class MultipleInheritance {


	public static void main(String[] args)
	{
		Do doo = new Do();
		doo.saySomething();
	}
}
interface First{
	default void method1() {
		System.out.println("This is First's method1");
	}
	void implementIt();
}
interface Second{
	default void method1() {
		System.out.println("This is Second's method1");
	}
	
	void implementIt();
}

class Test1 implements First, Second{
	
	public void method1() {
			System.out.println("This is First's method1");
			Second.super.method1();
		}
	@Override
	public void implementIt() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class FirstOne{
	
	void saySomething() {
		System.out.println("Hi");
	}
	abstract void implementIt();
}

abstract class SecondOne extends FirstOne{
	
	void saySomething()
	{
		System.out.println("Hello");
	}
	abstract void implementIt();
}

class Do extends SecondOne{

	@Override
	void implementIt() {
		// TODO Auto-generated method stub
		
	}
	
}