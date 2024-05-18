package com.springb.h2db.entity;


import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_customer")
@Setter
@Getter	/*Used Lombok library Annotations for clean code and simplicity and also the setter and getter methods were causing unusual behaviour at the server end*/
@ToString
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Long age;
	
	private String location;
	
	@CreationTimestamp
	@Column(name="created_at", nullable=false, updatable=false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
	
}
