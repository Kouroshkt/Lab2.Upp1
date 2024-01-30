package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InMemoryEmployeeRepository implements EmployeeRepository {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee save(Employee employee) {
        for (Employee e : employeeList) {
            if (e.equals(employee)) return e;
        }
        String id = UUID.randomUUID().toString();
        employee.setId(String.valueOf(id));
        employeeList.add(employee);
        return employee;
    }
}
