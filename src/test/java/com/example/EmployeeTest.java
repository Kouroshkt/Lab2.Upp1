package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee = new Employee("111", 10000);
    Employee noBady = new Employee(null, 0);

    @Test
    @DisplayName("An employee is created when the constructor is called")
    void anEmployeeIsCreatedWhenTheConstructorIsCalled() {
        assertInstanceOf(Employee.class, employee);
    }

    @Test
    @DisplayName("An empty employee is created when constructor is called")
    void anEmptyEmployeeIsCreatedWhenConstructorIsCalled() {
        assertInstanceOf(Employee.class, noBady);
    }


    @Test
    @DisplayName("ID is given when there is an employee")
    void idIsGivenWhenThereIsAnEmployee() {
        assertEquals("111", employee.getId());
    }

    @Test
    @DisplayName("Id is given when id is null")
    void idIsGivenWhenIdIsNull() {
        assertNull(noBady.getId());
    }


    @Test
    @DisplayName("Should Id is changed to a new id ")
    void shouldIdIsChangedToANewId() {
        employee.setId("222");
        assertEquals("222", employee.getId());
    }

    @Test
    @DisplayName("Salary is given when there is an employee")
    void salaryIsGivenWhenThereIsAnEmployee() {
        assertEquals(10000, employee.getSalary());
    }

    @Test
    @DisplayName("Should salary is changed to a new salary")
    void shouldSalaryIsChangedToANewSalary() {
        employee.setSalary(20000);
        assertEquals(20000, employee.getSalary());
    }

    @Test
    @DisplayName("Should given paid false when is an new employee")
    void shouldGivenPaidFalseWhenIsAnNewEmployee() {
        assertFalse(employee.isPaid());
    }

    @Test
    @DisplayName("Sholud given true paid when paid to an employee")
    void sholudGivenTruePaidWhenPaidToAnEmployee() {
        employee.setPaid(true);
        assertTrue(employee.isPaid());
    }

    @Test
    @DisplayName("Should given employee information when toSting called")
    void shouldGivenEmployeeInformationWhenToStingCalled() {
        String expectedtext= "Employee [id=111, salary=10000.0]";
        assertEquals(expectedtext,employee.toString());
    }



}

