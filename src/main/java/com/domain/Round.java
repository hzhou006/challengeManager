package com.domain;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rounds")
public class Round {
	@id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String description;
    Timestamp currTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCurrTime() {
		return currTime;
	}
	public void setCurrTime(Timestamp currTime) {
		this.currTime = currTime;
	}
	
    
}
