package model;

public class User {

	private String name;
	private int id, age;

	public User(int id, int age, String name) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [ID=" + id + ", name=" + name + ", idade=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}