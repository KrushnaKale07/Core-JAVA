package com.jspider.hibernate1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee1DTO {

	@Id
	private int id;
	private String name;
	private String email;
	private double sallary;

}
