package org.springframework.cn.tulingxueyuan.beans;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Override
	public String toString() {
		return "Car{" +
				"tank=" + tank +
				", name='" + name + '\'' +
				'}';
	}

	@Autowired
	private Tank tank;


	public Car() {
		System.out.println("car初始化");
	}

	public Car(String name) {
		System.out.println("car有参构造");
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



//	@Value("aaa")
	private String name = "兰博基尼";
}
