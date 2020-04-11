package com.bo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Entity@ToString
@Table(name = "MACBOOK")
public class Reg_BO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)@Column(length = 10)
	private int id;
	@Column(length = 25)
	private String username;
	@Column(length=20)
	private String password1;
	@Column(length=20)
	private String password2;
	@Column(length=25)
	private String email; 
	@Version@Column(length = 20)@Type(type = "int")
	private int ver;
	@UpdateTimestamp@Column(length = 15)
	private Timestamp lastupdatedDate;
	@CreationTimestamp@Column(length = 20)
	private Timestamp registeredDate;
	
}	
