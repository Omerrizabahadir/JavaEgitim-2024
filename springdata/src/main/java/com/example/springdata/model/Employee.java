package com.example.springdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


    @Entity
    @Table(name = "employee")
    public class Employee {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "employee_id")
        private Long employeeId;
        private String firstname;
        private String surname;
        private int age;
        private String address;

        public Long getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(Long employeeId) {
            this.employeeId = employeeId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeId=" + employeeId +
                    ", firstname='" + firstname + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

