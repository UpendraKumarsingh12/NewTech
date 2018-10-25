package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		Student s1= new Student(101,"upendra",32);
		Student s2= new Student(11,"surendra",38);
		Student s3= new Student(111,"harendra",30);
		Student s4= new Student(121,"ravindra",42);
		ArrayList<Student>list= new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s);
		}
	}

}
