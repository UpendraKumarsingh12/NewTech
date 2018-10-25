package com.Comaprator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComaparision {

	public static void main(String[] args) {
		Employee e1= new Employee(11,"upendra",32,10000);
		Employee e2= new Employee(12,"dhanjay",39,50000);
		Employee e3= new Employee(13,"prayag",31,100000);
		Employee e4= new Employee(14,"vilash",36,30000);
		ArrayList<Employee>list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println("Sorting by Salary..");
		Collections.sort(list, new SalaryComparator());
		for(Employee esal:list) {
			System.out.println(esal);
			
		}
		System.out.println("Sorting by Name..");
		Collections.sort(list, new NameComaparator());
		for(Employee ename:list) {
			System.out.println(ename);
		}
		System.out.println("Sorting by Age..");
		Collections.sort(list, new AgeComparator());
		for(Employee eage:list) {
			System.out.println(eage);
		}

	}

}
