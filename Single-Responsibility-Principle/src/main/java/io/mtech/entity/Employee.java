package io.mtech.entity;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Employee {
private String epmloeeId;
private String name;
private BigDecimal salary;
private String address;
private String dateOfJoining;

}
