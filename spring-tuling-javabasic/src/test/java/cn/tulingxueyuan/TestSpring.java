package cn.tulingxueyuan;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.cn.tulingxueyuan.beans.Car;
import org.springframework.cn.tulingxueyuan.beans.SimpleBean;
import org.springframework.cn.tulingxueyuan.beans.SimpleBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

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

		System.out.println(car == car2);
		System.out.println(car);


	}

	@Test
	public void test02() {
		SimpleBean sb1 = (SimpleBean)ioc.getBean("simpleBeanFactory");
		System.out.println(sb1);

		SimpleBean sb2 = (SimpleBean)ioc.getBean("simpleBeanFactory");
		System.out.println(sb2);
		Assert.isTrue(sb1 == sb2, "sb1=sb2");

		SimpleBean sb3 = ioc.getBean("simpleBean", SimpleBean.class);
		Assert.isTrue(sb1 != sb3, "sb1!=sb3");
		System.out.println(sb3);

		SimpleBeanFactory cf = (SimpleBeanFactory)ioc.getBean("&simpleBeanFactory");
		System.out.println(cf);
	}
}
