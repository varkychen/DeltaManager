package delta.manager.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("delta/manager/beans.xml");
		SpringHelloWorld helloWorld = (SpringHelloWorld)context.getBean("helloWorldBean");
		helloWorld.printHello();
	}
}
