package com.lodging.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@Column(name="Oid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name="id_sequence", sequenceName="ADDRESS_ID_SEQ")
	private Long oid;
	
	@Column
	private String street;
	
	@Column
	private String city;
	
	@Column 
	private String state;
	
	@Column
	private Long zipcode;

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	
}
