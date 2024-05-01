package com.akal.demo.controller;

import com.akal.demo.model.Department;
import com.akal.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public ResponseEntity<Object> addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @GetMapping("/viewEmpListByDepartmentId/{departmentId}")
    public ResponseEntity<Object> viewEmployeeListByDepartmentId(@PathVariable String departmentId){
        return departmentService.viewEmployeeListByDepartmentId(departmentId);
    }

    @GetMapping("/viewList")
    public ResponseEntity<Object> viewDepartmentList(){
        return departmentService.viewDepartmentList();
    }
}
