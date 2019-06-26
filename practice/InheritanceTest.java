package practice.org;

public class InheritanceTest extends SuperClass{
	
	{
		System.out.println("C");
	}
	static {
		System.out.println("D");
	}
	
	public static void main(String args[])
	{
		Parent child = new Child();
		System.out.println(child.name +" - "+child.getName());
		
		Pet pet = new Cat();
		Ball ball = new Ball();
		
		System.out.println("My "+pet.getName()+" is playing with a "+ball.getName());
		
		
		
		Dog d  = new Dog();
		
		d.makeNoise();
		d.move();
		d.wagTail();
		d.fetch();
		
		Canine c = new Dog();
		
		c.makeNoise();
		c.move();
		c.wagTail();
		//c.fetch();
		
		Animal a = new Dog();
		
		a.makeNoise();
		a.move();
		//a.wagTail();
		//a.fetch();
		
	}
}
class Parent{
	public String name = "Parent";
	
	public String getName()
	{
		return name;
	}
}
class Child extends Parent{
	public String name = "Child";
	
	public String getName() {
		return name;
	}
}

class Pet{
	
	public String getName()
	{
		return "Pet";
	}
}
class Cat extends Pet{
	
	public String getName() {
		
		return "Cat";
	}
}
class Shape{
	
	private String name;
	
	public Shape() {
		name = "Shape";
	}
	
	public String getName() {
		return name;
	}
}
class Ball extends Shape{
	
	private String name;
	
	public Ball() {
		name = "Ball";
	}
	
}

class SuperClass{
	{
		System.out.println("A");
	}
	static {
		System.out.println("B");
	}
	
}

abstract class Animal{

	public abstract void makeNoise();
	public abstract void move();
}
abstract class Canine extends Animal{
	public void wagTail() {
		System.out.println("Wagging");
	}
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Shout");
	}
	public void move() {
		System.out.println("Run");
	}
}
class Dog extends Canine{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
	}
	public void fetch() {
		System.out.println("Fetch");
	}
}