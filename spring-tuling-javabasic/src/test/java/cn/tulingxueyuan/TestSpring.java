package cn.tulingxueyuan;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.cn.tulingxueyuan.beans.Car;
import org.springframework.cn.tulingxueyuan.beans.CarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	@Rule
	public final ExpectedException exceptionRule = ExpectedException.none();
	private ApplicationContext ioc ;

	@Before
	public void init() {
		ioc = new ClassPathXmlApplicationContext("classpath:/spring.xml");
	}

	@Test
	public void test01() {
		Car car = ioc.getBean("car", Car.class);
		Car car2 = ioc.getBean("car", Car.class);

		System.out.println(car);


		Car car3 = (Car)ioc.getBean("carFactory");
		System.out.println(car3);

		CarFactory cf = (CarFactory)ioc.getBean("&carFactory");
		System.out.println(cf);
	}
}
