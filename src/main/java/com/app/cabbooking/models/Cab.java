/*@Author : Anurag Gupta */
package com.app.cabbooking.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/* This Class File Is Defining Schema For Cab Entity. */
@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"cabbooking_time","cabupdate_time"},allowGetters = true)
public class Cab {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	   private int Booking_Id;
	   private String vehicle_name;
	   private String vehicle_number;
	   private String passenger_name;
	   private String pickup_point;
	   private String dropping_point;
	   private String current_place;
	   
	   @Column(name="cabbooking_time", nullable=false, updatable=false)
	   @Temporal(TemporalType.TIMESTAMP)
	   @CreatedDate
	   private String booking_time;
	   
	   @Column(name="cabupdate_time", nullable=false)
	   @Temporal(TemporalType.TIMESTAMP)
	   @LastModifiedDate
	   private String updating_time;

	public int getBooking_Id() {
		return Booking_Id;
	}

	public void setBooking_Id(int booking_Id) {
		Booking_Id = booking_Id;
	}

	public String getVechile_name() {
		return vehicle_name;
	}

	public void setVechile_name(String vechile_name) {
		this.vehicle_name = vechile_name;
	}

	public String getVechile_number() {
		return vehicle_number;
	}

	public void setVechile_number(String vechile_number) {
		this.vehicle_number = vechile_number;
	}

	public String getPassenger_name() {
		return passenger_name;
	}

	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}

	public String getPickup_point() {
		return pickup_point;
	}

	public void setPickup_point(String pickup_point) {
		this.pickup_point = pickup_point;
	}

	public String getDropping_point() {
		return dropping_point;
	}

	public void setDropping_point(String dropping_point) {
		this.dropping_point = dropping_point;
	}

	public String getCurrent_place() {
		return current_place;
	}

	public void setCurrent_place(String current_place) {
		this.current_place = current_place;
	}

	public String getBooking_time() {
		return booking_time;
	}

	public void setBooking_time(String booking_time) {
		this.booking_time = booking_time;
	}

	public String getUpdating_time() {
		return updating_time;
	}

	public void setUpdating_time(String updating_time) {
		this.updating_time = updating_time;
	}
	   
	   
	   
	   
}
