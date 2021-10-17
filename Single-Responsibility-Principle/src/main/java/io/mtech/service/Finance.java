package io.mtech.service;

import java.math.BigDecimal;

import io.mtech.entity.Employee;

public class Finance {

	public double calcIncomeTaxforCurrentYear(Employee employee) {
		if (employee.getSalary().compareTo(new BigDecimal("25000")) == 1) {
			return (0.5 * 12 * employee.getSalary().doubleValue()) / 100;
		}
		return 0.0;
	}
}
