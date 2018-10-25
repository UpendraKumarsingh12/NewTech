package com.Comaprator;

import java.util.Comparator;

public class NameComaparator implements Comparator<Employee> {

	@Override
	public int compare(Employee ename1, Employee ename2) {
		
		return ename1.name.compareTo(ename2.name);
	}

}
