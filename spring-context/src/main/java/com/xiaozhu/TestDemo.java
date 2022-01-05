package com.xiaozhu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("恭喜恭喜");
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = (Hello) ac.getBean("hello");
		System.out.println(hello.sayHello());
	}
}
