package epam.homework.spring;

import epam.homework.spring.entities.Car;
import epam.homework.spring.entities.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Car getCar(){
        Car car = new Car();
        car.setModel("Opel");
        return car;
    }

    @Bean("customer")
    public Object getCustomer(){
        return new Customer();
    }
}
