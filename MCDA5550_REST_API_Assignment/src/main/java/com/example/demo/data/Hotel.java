package com.example.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Id;


@Entity
@Table(name="Hotel")
public class Hotel {
	
    @Id
    @SequenceGenerator(name= "Hotel_SEQ", sequenceName = "Hotel_SEQ_ID", initialValue=1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator="Hotel_SEQ")
    @Column(name="hotel_id")
    private Long id;
    @Column(name="hotel_name")
    private String hotelName;
    @Column(name="address")
    private String address;
    @Column(name="phone_no")
    private String phoneNo;
    @Column(name="no_of_room")
    private Integer noOfRoom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(Integer noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelName=" + hotelName + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", noOfRoom=" + noOfRoom + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, hotelName, id, noOfRoom, phoneNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(address, other.address) && Objects.equals(hotelName, other.hotelName)
				&& Objects.equals(id, other.id) && Objects.equals(noOfRoom, other.noOfRoom)
				&& Objects.equals(phoneNo, other.phoneNo);
	}
    
    
}