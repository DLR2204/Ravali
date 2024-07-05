package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")

public class Test {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);

		Person person = (Person) factory.getBean("person");
		
		person.setName("Ravallika");
		
		person.setAge(23);
		
		person.setId(100);
		
		Address add = (Address) factory.getBean("add");
		
		add.setHno(1-2);
		
		add.setColony("SriNagarColony");
		
		add.setCity("hyderabad");
		
		add.setPincode(783247);
		
		person.setAdd(add);
		
		System.out.println(person);

	}

}
