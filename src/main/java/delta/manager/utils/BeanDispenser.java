package delta.manager.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDispenser {
	
	private static Map<String,ApplicationContext> resourceApplicationContextMap = new HashMap<String,ApplicationContext>();
	private static ApplicationContext currentApplicationContext;
	
	public static <T> T dispenseBean(String resource, String beanName, Class<T> objectReturnType) {
		loadApplicationContext(resource);
		return fetchBean(beanName,objectReturnType);
	}
	
	private static void loadApplicationContext(String classPathResource) {
		ApplicationContext context = resourceApplicationContextMap.get(classPathResource);
		if(context == null) {
			context = new ClassPathXmlApplicationContext(classPathResource);
			resourceApplicationContextMap.put(classPathResource, context);
		}
		currentApplicationContext = context;
	}
	
	private static <T> T fetchBean(String beanName, Class<T> objectReturnType) {
		Object obj = currentApplicationContext.getBean(beanName);
		return objectReturnType.cast(obj);
	}
}
