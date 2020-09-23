package com.example.Sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Sample.bean.Employee;
import com.example.Sample.repo.EmployeeRepo;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner empdata(EmployeeRepo repo) {
		return args->{
			
			repo.save(new Employee("raja",123.45));
			repo.save(new Employee("babu",987.65));
			repo.save(new Employee("mahesh",111.22));	
			
		};
	}


}
