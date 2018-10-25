package com.comparable;

public class Student implements Comparable<Student> {
int rollnum;
String name;
int age;
public Student(int rollnum, String name, int age) {
	super();
	this.rollnum = rollnum;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Student [rollnum=" + rollnum + ", name=" + name + ", age=" + age + "]";
}
@Override
public int compareTo(Student stuObject) {
	if(age==stuObject.age) {
		return 0;
	}else if(age>stuObject.age) {
		return 1;
	}else
	return -1;
}

}
