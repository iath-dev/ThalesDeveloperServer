package com.jdnl.ThalesDeveloperServer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ThalesDeveloperServerApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	public void getEmployeeTest() throws Exception {
		ResponseEntity<Employee> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/api/v1/employee/1").toString(), Employee.class);

		assertThat(response.getBody().getId()).isNotZero();
	}

	@Test
	public void getEmployeesTest() throws Exception {
		ResponseEntity<Employee[]> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/api/v1/employees").toString(), Employee[].class);

		assertThat(response.getBody()).isNotEmpty();
	}

}
