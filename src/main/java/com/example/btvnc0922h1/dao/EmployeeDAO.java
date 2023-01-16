package com.example.btvnc0922h1.dao;

import com.example.btvnc0922h1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;
@Component
public class EmployeeDAO {
    @Autowired
    EntityManager entityManager;

    public List<Employee> getAll() {
        String sql = "Select e from Employee e";
        List<Employee> employees = entityManager.createQuery(sql).getResultList();
        return employees;
    }

    public void create(Employee employee) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();
    }
    public void update(Employee employee){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(employee);
        transaction.commit();
    }
    public void delete(Employee employee){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(employee);
        transaction.commit();
    }
    public Employee findById(int EmployeeCode){
        String sql = "Select nv from Employee nv where nv.EmployeeCode = " + EmployeeCode;
        Employee employee = (Employee) entityManager.createQuery(sql).getSingleResult();
        return employee;
    }


}
