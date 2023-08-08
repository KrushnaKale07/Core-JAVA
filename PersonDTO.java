package com.jspider.hibernate1.dto;

//ONE TO ONE(UNIDIRECTIONAL) MAPPING
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class PersonDTO {

	@Id
	private int id;
	private String name;
	private String email;
	@OneToOne
	private AadharCardDTO aadharCardDTO;
	
}
