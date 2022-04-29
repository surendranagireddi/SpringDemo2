package com.suren.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.suren.beans.WishMessageGenerator;

public class ConstructorInjection {

	public static void main(String[] args) {
	

	
	 // hold the name and location  of spring bean cfg file in resource Object

	//FileSystemResource res = new FileSystemResource("C://Surendra/Javaworkspace/ConstructorInjection/src/main/java/com/suren/cfgs/applicationContext.xml");
	//create a beanFactory Spring container IOC

		FileSystemResource res = new FileSystemResource("src/main/java/com/suren/cfgs/applicationContext.xml");
	XmlBeanFactory factory = new XmlBeanFactory(res);

	System.out.println("----------------------");

	// get target spring bean  class object with dependent spring bean class Obj

	Object object = factory.getBean("mg");

	//type casting 
	WishMessageGenerator generator = (WishMessageGenerator)object;

	System.out.println("-------------");

	//invoke the b mnethod 

	String msg = generator.generateMessage("Surya");

	System.out.println("Wish Message is :: " +msg);

	System.out.println("-----------------------");


}
}
