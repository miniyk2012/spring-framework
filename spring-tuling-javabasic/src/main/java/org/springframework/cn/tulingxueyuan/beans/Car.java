package org.springframework.cn.tulingxueyuan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {


	public Car() {
		System.out.println("car初始化");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}

	@Value("aaa")
	private String name = "兰博基尼";
}
