package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class InMemoryEmployeeRepositoryTest{
    EmployeeRepository employeeRepository= new InMemoryEmployeeRepository();
    Employee employee1= new Employee("",2500);
    Employee employee2= new Employee("",1500);
    Employee employee3= new Employee("",1800);

    @Test
    @DisplayName("Given a empty list Employees when call findAll method")
    void givenAListEmployeesWhenCallFindAllMethod() {

        assertThat(employeeRepository.findAll()).isEmpty();
    }

    @Test
    @DisplayName("Give a id som 1 when called save first time")
    void giveAIdSom1WhenCalledSave() {
        employeeRepository.save(employee1);
        assertThat(employee1.getId()).isNotEmpty();
    }

    @Test
    @DisplayName("Given three employees when a list is taken ")
    void givenThreeEployeeWhenAListIsTaken() {
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
        assertThat(employeeRepository.findAll()).isEqualTo(Arrays.asList(employee1, employee2,employee3));
    }

    @Test
    @DisplayName("Given a employee when take the two eguals eployeer")
    void givenAEmployeeWhenTakeTheTwoEgualsEployeer() {
        employeeRepository.save(employee1);
        employeeRepository.save(employee1);
        assertThat(employeeRepository.findAll()).isEqualTo(Arrays.asList(employee1));
    }

}
