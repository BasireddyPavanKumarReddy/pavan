package org.registration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_tab")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private String name;
	
	@Id
	private String email;
	
	private String pass;
	
	private String confPass;
	
	
	

}
