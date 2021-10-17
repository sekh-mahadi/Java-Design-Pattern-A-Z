package io.mtech.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import io.mtech.entity.Employee;

public class HRPromotions {
	public boolean isPromotionDueThisYear(Employee employee, LocalDate current) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		LocalDate joiningDate = LocalDate.parse(employee.getDateOfJoining(), formatter);
		System.out.println(joiningDate);
		/*
		 * Period years = Period.between(joiningDate, current);
		 * System.out.println(years.getYears());
		 */
	
		if (Period.between(joiningDate, current).getYears() > 2) {
			return true;
		}
		return false;
	}
}
