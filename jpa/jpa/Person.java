package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person { //pojo
	
	@Id
	private int age;
	
	private String name;
	
	private int id;
	
	private String address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getAdd() {
		return address;
	}

	public void setAdd(String add) {
		this.address = add;
	}

	public Person(int age, String name, int id, String add) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.address = add;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", id=" + id + ", add=" + address + "]";
	}
	

}
