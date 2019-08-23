package epam.homework.spring;

import epam.homework.spring.entities.Car;
import epam.homework.spring.entities.Customer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class);

		Car firstCar = context.getBean(Car.class);
		System.out.println(firstCar.getModel());

		Customer firstCustomer = (Customer) context.getBean("customer");
		firstCustomer.setName("Alex");
		System.out.println(firstCustomer.getName());
	}

}
