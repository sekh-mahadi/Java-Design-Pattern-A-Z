package io.mtech.SRP;

import java.math.BigDecimal;
import java.time.LocalDate;

import io.mtech.entity.Employee;
import io.mtech.service.Finance;
import io.mtech.service.HRPromotions;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEpmloeeId("1002");
		emp.setName("Mahadi");
		emp.setSalary(new BigDecimal(30000));
		emp.setDateOfJoining("03/02/2020");
		emp.setAddress("Bhola");

		LocalDate localDate = LocalDate.parse("2023-02-13");

		HRPromotions hrPromotions = new HRPromotions();
		boolean isPromotion = hrPromotions.isPromotionDueThisYear(emp, localDate);

		if (isPromotion) {
			System.out.println("The employee eligible for Promotion");
		} else {
			System.out.println("The employee does not eligible for Promotion");
		}
		
		Finance finance = new Finance();
		double tax = finance.calcIncomeTaxforCurrentYear(emp);
		System.out.println(tax);

	}

}
