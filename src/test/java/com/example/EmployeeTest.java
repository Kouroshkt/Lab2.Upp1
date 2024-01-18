package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee= new Employee("111",10000);
    @Test
    @DisplayName("An employee is created when the method is called")
    void anEmployeeIsCreatedWhenTheMethodIsCalled() {
        assertInstanceOf (Employee.class,employee);
    }

    @Test
    @DisplayName("ID is given when there is an employee")
    void idIsGivenWhenThereIsAnEmployee() {
        assertEquals("111",employee.getId());
    }

    @Test
    @DisplayName("Id is changed to a new id ")
    void idIsChangedToANewId() {
        employee.setId("222");
        assertEquals("222",employee.getId());
    }


}