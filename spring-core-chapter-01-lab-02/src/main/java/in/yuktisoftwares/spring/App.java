package in.yuktisoftwares.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main(String[] args) {
		// Load the Spring configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}
}
