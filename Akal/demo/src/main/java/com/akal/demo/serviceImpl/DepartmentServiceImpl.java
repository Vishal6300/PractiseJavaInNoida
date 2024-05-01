package com.akal.demo.serviceImpl;

import com.akal.demo.dto.ResponseDto;
import com.akal.demo.model.Department;
import com.akal.demo.model.Employee;
import com.akal.demo.repository.DepartmentRepo;
import com.akal.demo.repository.EmployeeRepo;
import com.akal.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public ResponseEntity<Object> addDepartment(Department department) {
        ResponseDto response = new ResponseDto();
        try{
            return new ResponseEntity<>(departmentRepo.save(department), HttpStatus.OK);
        }catch(Exception e){
           response.setMessage(e.getMessage());
           return new ResponseEntity<>(response,HttpStatus.NOT_ACCEPTABLE);
        }

    }

    @Override
    public ResponseEntity<Object> viewEmployeeListByDepartmentId(String departmentId) {
        List<Employee> employeeList= employeeRepo.findByDepartmentId(departmentId);
        if(employeeList.isEmpty()){
            ResponseDto response= new ResponseDto();
            response.setMessage("No employee found in this department.");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(employeeList, HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<Object> viewDepartmentList() {
        List<Department> departments= departmentRepo.findAll();
        if(!departments.isEmpty()){
            return new ResponseEntity<>(departments, HttpStatus.OK);
        }else{
            ResponseDto response= new ResponseDto();
            response.setMessage("No department Found!");
            return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        }
    }
}
