package org.springframework.cn.tulingxueyuan;

import org.springframework.cn.tulingxueyuan.beans.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		Car car = ioc.getBean(Car.class, "car");
		System.out.println(car);
	}

}
