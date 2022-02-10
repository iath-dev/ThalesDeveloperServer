package com.jdnl.ThalesDeveloperServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BusinessController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("employees")
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @GetMapping("employee/{id}")
    @ResponseBody
    public Employee getEmployee(@PathVariable("id") Long id) {
        return this.employeeRepository.getById(id);
    }
}
