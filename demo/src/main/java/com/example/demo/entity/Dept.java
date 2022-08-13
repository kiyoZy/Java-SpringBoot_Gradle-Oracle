package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DEPT ")
public class Dept {
	
	@Id
	private Integer id;
	
	private String name;

}
