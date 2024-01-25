package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class EmployeesTest {
        EmployeeRepository employeeRepository = Mockito.mock(EmployeeRepository.class);
        BankService bankService = new DummyBankService();
        Employees employees = new Employees(employeeRepository, bankService);
        Employee employee1 = new Employee("10", 1000);
        Employee employee2 = new Employee("20", 6000);
        List<Employee> testEmployees = Arrays.asList(employee1, employee2);


    @Test
    @DisplayName("An employees is created when the constructor is called")
    void anEmployeesIsCreatedWhenTheConstructorIsCalled() {
        assertInstanceOf(Employees.class, employees);
    }

    @Test
    @DisplayName("Should given true when paid")
    void shouldGivenTrueWhenPaid() {
        Mockito.when(employeeRepository.findAll()).thenReturn(testEmployees);
        employees.payEmployees();
        assertThat(employee1.isPaid()).isTrue();
    }

    @Test
    @DisplayName("Given false when Runtime Exception")
    void givenFalseWhenRuntimeException() {
        Mockito.when(employeeRepository.findAll()).thenReturn(testEmployees);
        employees.payEmployees();
        assertThat(employee2.isPaid()).isFalse();
    }
}