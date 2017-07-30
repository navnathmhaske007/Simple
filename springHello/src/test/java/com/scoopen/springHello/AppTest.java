package com.scoopen.springHello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppTest 
{
	public static void main(String[] args) {
		
	//	ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		
		Resource r = new ClassPathResource("beans.xml");
		
		BeanFactory ap = new XmlBeanFactory(r);
		
		HelloWorld hw = (HelloWorld) ap.getBean("helloWorld");
		
		HelloWorld hw1 = (HelloWorld) ap.getBean("helloWorld");
		
		
		hw.hello();
		
		hw1.hello();
		
		System.out.println(hw==hw1);
		
		
	}
}   