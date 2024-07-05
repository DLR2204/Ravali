package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	private int age;
	
	private String name;
	
	private int id;
	
	@Autowired	
	private Address add;
	
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

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Person(int age, String name, int id, Address add) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", id=" + id + ", add=" + add + "]";
	}
	
	

}
