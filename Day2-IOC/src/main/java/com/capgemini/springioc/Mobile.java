package com.capgemini.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
	//object creation
		/*Airtel a = new Airtel();
		a.calling();
		a.data();
		
		VI v = new VI();
		v.calling();
		v.data();*/
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration Loaded");
		
		//Using IOC
		Sim obj=a.getBean("sim", Sim.class);
		obj.calling();
		obj.data();
		
		/*VI obj1=(VI)a.getBean("vi");
		obj1.calling();
		obj1.data();*/
	}

}
