package com.akal.demo.controller;

import com.akal.demo.model.Employee;
import com.akal.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/update")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/viewList")
    public ResponseEntity<Object> viewAllEmployee(){
        return employeeService.viewAllEmployee();
    }

    @GetMapping("/findByEmpId/{empId}")
    public ResponseEntity<Object> findEmployeeById(@PathVariable String empId){
        return employeeService.findEmployeeById(empId);
    }
}
