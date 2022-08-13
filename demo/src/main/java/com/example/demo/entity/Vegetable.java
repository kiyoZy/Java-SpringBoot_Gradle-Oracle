package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="VEGETABLE ")
public class Vegetable {

	@Id
	private Integer id;

	private String col1;

	private String col2;

	private String cityId;

}
