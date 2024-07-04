package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
	Resource resource = new ClassPathResource("SpringConfig.xml");
		
	BeanFactory factory = new  XmlBeanFactory(resource);
		
		
//	ApplicationContext factory = new ClassPathXmlApplicationContext("SpringConfig.xml");
	
	
	System.out.println(factory.getBean("emp"));
	}

}
