package com.lodging.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HOTEL")
public class Hotel {

	@Id
	@Column(name = "Oid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "HOTEL_ID_SEQ")
	private Long oid;
	
	@Column
	private String name;
	
	@Column
	private String facilityCode;
	
	@Column 
	private Integer hotelRooms;
	
	@Column 
	private Long hotelNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_oid", referencedColumnName = "oid")
	private Address address;

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	public Integer getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(Integer hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

	public Long getHotelNumber() {
		return hotelNumber;
	}

	public void setHotelNumber(Long hotelNumber) {
		this.hotelNumber = hotelNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
