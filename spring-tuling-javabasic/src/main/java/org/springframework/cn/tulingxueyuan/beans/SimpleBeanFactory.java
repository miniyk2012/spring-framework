package org.springframework.cn.tulingxueyuan.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 先注释
@Component
public class SimpleBeanFactory implements FactoryBean<SimpleBean> {


	private String message;

	@Autowired
	public void setMessage(@Value("hello world") String message) {
		this.message = message;
	}


	public SimpleBeanFactory() {
		System.out.println("SimpleBeanFactory初始化");
	}

	@Override
	public SimpleBean getObject() throws Exception {
		System.out.println("SimpleBeanFactory.getObject");
		SimpleBean simpleBean = new SimpleBean();
		simpleBean.setMessage(message);
		return simpleBean;
	}

	@Override
	public Class<?> getObjectType() {
		return SimpleBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}


}
