package com.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="techer_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	 @Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	private  int id;
	private String name;
	private String address;
	private double salary;
	private String subject;

}
