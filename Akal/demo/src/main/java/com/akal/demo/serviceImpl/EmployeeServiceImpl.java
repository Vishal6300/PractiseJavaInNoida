package com.akal.demo.serviceImpl;

import com.akal.demo.dto.ResponseDto;
import com.akal.demo.model.Employee;
import com.akal.demo.repository.EmployeeRepo;
import com.akal.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public ResponseEntity<Object> addEmployee(Employee employee
    ) {
        ResponseDto response= new ResponseDto();
        try{
            employeeRepo.save(employee);
            response.setMessage("Employee added Successfully.");
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Object> updateEmployee(Employee employee) {
        Employee employee1= employeeRepo.findById(employee.getEmpId()).orElse(null);
        ResponseDto response= new ResponseDto();
        if(employee1 == null){
            response.setMessage("Employee Id is invalid! Please give correct input!");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }else{
            try{
               employee1.setName(employee.getName());
               employee1.setSalary(employee.getSalary());
               employee1.setAddress(employee.getAddress());
               employee1.setDepartmentId(employee.getDepartmentId());
               employeeRepo.save(employee1);
               response.setMessage("Employee Updated Successfully");
               return new ResponseEntity<>(response,HttpStatus.OK);
            }catch (Exception e){
                return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            }
        }
    }

    @Override
    public ResponseEntity<Object> viewAllEmployee() {
        List<Employee> employeeList= employeeRepo.findAll();
        if(!employeeList.isEmpty()){
            return new ResponseEntity<>(employeeList, HttpStatus.OK);
        }else{
            ResponseDto response= new ResponseDto();
            response.setMessage("No employee Found!");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Object> findEmployeeById(String empId) {
        Employee employee= employeeRepo.findById(empId).orElse(null);
        if(employee != null){
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }else{
            ResponseDto response= new ResponseDto();
            response.setMessage("No employee Found!");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
}
