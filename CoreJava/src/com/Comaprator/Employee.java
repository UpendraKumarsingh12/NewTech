package com.Comaprator;

public class Employee {
int empid;
String name;
int age;
int salary;
public Employee(int empid, String name, int age, int salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}

}
