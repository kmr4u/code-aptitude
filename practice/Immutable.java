package practice.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.Collections;

final class Test {
	private final String name;
	private final Integer id;
	private final Address add;
	private final List<Mobile> contacts;

	Test(String name, Integer id, Address add, List<Mobile> contacts) throws CloneNotSupportedException {
		this.name = name;
		this.id = id;
		this.add = add;
		List<Mobile> cont = new ArrayList<>();
		for (Mobile c : contacts) {
			cont.add((Mobile) c.clone());
		}
		this.contacts = Collections.unmodifiableList(cont);

	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public Address getAdd() throws CloneNotSupportedException {

		return (Address) new Address().clone();
	}

	public List<Mobile> getContacts() throws CloneNotSupportedException {
		List<Mobile> cont = new ArrayList<>();
		for (Mobile c : this.contacts) {
			// Mobile m = new Mobile();
			// m.setNumber(c.getNumber());
			cont.add((Mobile) c.clone());
		}
		return cont;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + ", add=" + add + ", contacts=" + contacts + "]";
	}

}

class Address implements Cloneable {

	public String getId() {
		return id;
	}

	public Address() {
	}

	public Address(String id) {
		this.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address [id=" + id + "]";
	}

}

class Mobile implements Cloneable {

	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Mobile [number=" + number + "]";
	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}

public class Immutable {

	public static void main(String[] args) throws CloneNotSupportedException {

		List<Mobile> contacts = new ArrayList<Mobile>();
		Mobile mob = new Mobile();
		mob.setNumber("1233456");
		contacts.add(mob);

		Address add = new Address();
		add.setId("1");

		Test immutable = new Test("Madhu", 1, add, contacts);
		System.out.println(immutable);

		Mobile mob2 = new Mobile();
		mob2.setNumber("9999");
		contacts.add(mob2);

		immutable.getAdd().setId("2");

		System.out.println(immutable);

		immutable.getContacts().get(0).setNumber("2222");
		System.out.println(immutable);
	}

}
