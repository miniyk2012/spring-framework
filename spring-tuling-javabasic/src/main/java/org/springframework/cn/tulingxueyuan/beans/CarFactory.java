package org.springframework.cn.tulingxueyuan.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//@Component
public class CarFactory implements FactoryBean<Car> {


	private String name;

	public CarFactory() {
		System.out.println("CarFactory初始化");
	}

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setName("yangkai");
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
}
