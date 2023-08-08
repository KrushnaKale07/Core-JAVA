package com.jspider.hibernate1.dto;

//ONE TO ONE(UNIDIRECTIONAL) MAPPING
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AadharCardDTO {

	@Id
	private int id;
	private long aadharNumber;
	private String dateOfIssue;
}
