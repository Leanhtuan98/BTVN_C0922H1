package com.example.btvnc0922h1.service;

import com.example.btvnc0922h1.dao.EmployeeDAO;
import com.example.btvnc0922h1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;
    public List<Employee> getAll(){
        return employeeDAO.getAll();
    }
    public void delete(int EmployeeCode){
        employeeDAO.delete(employeeDAO.findById(EmployeeCode));
    }

    public void update(Employee employee){
        employeeDAO.update(employee);
    }

    public void create(Employee employee){
        employeeDAO.create(employee);
    }
    public Employee findById(int EmployeeCode){
        return employeeDAO.findById(EmployeeCode);
    }


}
