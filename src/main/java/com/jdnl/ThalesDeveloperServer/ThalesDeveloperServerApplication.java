package com.jdnl.ThalesDeveloperServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThalesDeveloperServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ThalesDeveloperServerApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("Tiger Nixon", 61, 320800));
		this.employeeRepository.save(new Employee("Garrett Winters", 63, 170750));
		this.employeeRepository.save(new Employee("Ashton Cox", 66, 86000));
		this.employeeRepository.save(new Employee("Cedric Kelly", 22, 433060));
		this.employeeRepository.save(new Employee("Airi Satou", 33, 162700));
		this.employeeRepository.save(new Employee("Brielle Williamson", 61, 372000));
		this.employeeRepository.save(new Employee("Herrod Chandler", 59, 137500));
		this.employeeRepository.save(new Employee("Rhona Davidson", 55, 327900));
		this.employeeRepository.save(new Employee("Colleen Hurst", 39, 205500));
		this.employeeRepository.save(new Employee("Sonya Frost", 23, 103600));
		this.employeeRepository.save(new Employee("Jena Gaines", 30, 90560));
		this.employeeRepository.save(new Employee("Quinn Flynn", 22, 342000));
		this.employeeRepository.save(new Employee("Charde Marshall", 36, 470600));
		this.employeeRepository.save(new Employee("Haley Kennedy", 43, 313500));
		this.employeeRepository.save(new Employee("Tatyana Fitzpatrick", 19, 385750));
		this.employeeRepository.save(new Employee("Michael Silva", 66, 198500));
		this.employeeRepository.save(new Employee("Paul Byrd", 64, 725000));
		this.employeeRepository.save(new Employee("Gloria Little", 59, 237500));
		this.employeeRepository.save(new Employee("Bradley Greer", 41, 132000));
		this.employeeRepository.save(new Employee("Dai Rios", 35, 217500));
		this.employeeRepository.save(new Employee("Jenette Caldwell", 30, 345000));
		this.employeeRepository.save(new Employee("Yuri Berry", 40, 675000));
		this.employeeRepository.save(new Employee("Caesar Vance", 21, 106450));
		this.employeeRepository.save(new Employee("Doris Wilder", 23, 85600));
	}

}
