package org.springframework.cn.tulingxueyuan.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

// 先注释
//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		GenericBeanDefinition car =(GenericBeanDefinition) beanFactory.getBeanDefinition("car");
		car.setScope("prototype");
		ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
		constructorArgumentValues.addIndexedArgumentValue(0, "niubi");
		car.setConstructorArgumentValues(constructorArgumentValues);
	}
}
