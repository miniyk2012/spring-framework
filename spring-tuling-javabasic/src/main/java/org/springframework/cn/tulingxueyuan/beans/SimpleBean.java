package org.springframework.cn.tulingxueyuan.beans;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class SimpleBean {
	private String message;

	public SimpleBean() {
		super();
	}

	@Override
	public String toString() {
		return "SimpleBean{" +
				"message='" + message + '\'' +
				",id=" + System.identityHashCode(this) +
				'}';
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void init() {
		System.out.println("SimpleBean initialized with message: " + message + " " + this);
	}
}
