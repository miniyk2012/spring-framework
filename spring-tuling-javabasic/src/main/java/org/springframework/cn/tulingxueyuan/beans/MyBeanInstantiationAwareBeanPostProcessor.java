package org.springframework.cn.tulingxueyuan.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class MyBeanInstantiationAwareBeanPostProcessor implements
		InstantiationAwareBeanPostProcessor {


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
}
