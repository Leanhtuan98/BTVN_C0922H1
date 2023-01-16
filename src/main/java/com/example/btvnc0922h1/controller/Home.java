package com.example.btvnc0922h1.controller;

import com.example.btvnc0922h1.model.Employee;
import com.example.btvnc0922h1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller

public class Home {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("employee",employeeService.getAll());
        return "home";
    }
    @GetMapping("/delete/{EmployeeCode}")
    public String delete(@PathVariable int EmployeeCode) {
        employeeService.delete(EmployeeCode);
        return "redirect:/home";
    }
    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }
    @PostMapping("/create")
    public String create(Employee employee) {
        employeeService.create(employee);
        return "redirect:/home";
    }
    @GetMapping("/update/{EmployeeCode}")
    public String edit(@PathVariable int EmployeeCode, Model model){
        model.addAttribute("up",employeeService.findById(EmployeeCode));
        return "update";
    }
    @PostMapping("/update")
    public String edit(Employee employee) {
        employeeService.update(employee);
        employeeService.create(employee);
        return "redirect:/home";
    }





}
