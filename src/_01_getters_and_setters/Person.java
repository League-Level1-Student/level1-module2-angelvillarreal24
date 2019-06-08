package _01_getters_and_setters;

public class Person {

	private String name;
	private String superpower;

	public Person(String name1, String superpower1) {
		this.name = name1;
		this.superpower = superpower1;
	}

	public String getName() {
		return name;
	}

	public String getSuperpower() {
		return superpower;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	@Override
	public String toString() {
		return name + " has mad " + superpower + " skills!";
	}
}
