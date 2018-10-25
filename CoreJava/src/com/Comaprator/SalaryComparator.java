package com.Comaprator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee sal1, Employee sal2) {
		if(sal1.salary==sal2.salary) {
			return 0;
		}else if(sal1.salary>sal2.salary) {
			return 1;
		}else
		return -1;
	}

}
