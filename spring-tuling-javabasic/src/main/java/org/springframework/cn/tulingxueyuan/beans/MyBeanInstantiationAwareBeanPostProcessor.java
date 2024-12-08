package org.springframework.cn.tulingxueyuan.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

// 先注释
@Component
public class MyBeanInstantiationAwareBeanPostProcessor implements
		InstantiationAwareBeanPostProcessor {


	/**
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName)
			throws BeansException {
		if (beanClass == Car.class) {
			Car car = new Car();
			car.setName("保时捷");
			return car;
		}
		return null;
	}
	*/


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Car) {
			System.out.println("postProcessAfterInitialization for Car");
		} else if (bean instanceof SimpleBean) {
			System.out.println("postProcessAfterInitialization for SimpleBean: " + bean);
		}
		return bean;
	}
}
