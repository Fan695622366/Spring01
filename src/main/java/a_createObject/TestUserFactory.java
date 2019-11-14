package a_createObject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserFactory {

	@Test
	public void test1() {
		
		/**
		 * 通过传统工厂创建对象
		 */
		//静态工厂创建对象
		User u1 = UserFactory.getUser();
		System.out.println(u1);
		
		//通过非静态方法创建对象
		User u2 = new UserFactory().getUser2();
		System.out.println(u2);
	}
	
	@Test
	public void test2() {
		
		/**
		 * 通过IoC容器创建对应的对象
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml",TestUserFactory.class);
		
		User user = (User)context.getBean("user");
		
		System.out.println(user);
		
		User uu =(User)context.getBean("user");
		
		System.out.println(uu);
		
		System.out.println(user == uu);
		
		/**
		 * 销毁IoC.destroy是AbstractApplicationContext的方法
		 */
		context.destroy();
	}
	
	@Test
	public void test3() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml",TestUserFactory.class);
		
		User user3 = (User)context.getBean("user3");
		System.out.println(user3);
		
		User user4 = (User)context.getBean("user4");
		System.out.println(user4);
		
	}
}
