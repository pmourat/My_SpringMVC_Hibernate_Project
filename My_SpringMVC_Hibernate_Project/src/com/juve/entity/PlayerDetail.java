package com.juve.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player_detail")
public class PlayerDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="shirt_number")
	private int shirtNumber;
	
	@Column(name="fifa_rating")
	private int fifaRating;
	
	@Column(name="country")
	private String country;
	
	@Column(name="email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public int getFifaRating() {
		return fifaRating;
	}

	public void setFifaRating(int fifaRating) {
		this.fifaRating = fifaRating;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PlayerDetail [id=" + id + ", shirtNumber=" + shirtNumber + ", fifaRating=" + fifaRating + ", country="
				+ country + ", email=" + email + "]";
	}
	
	
	

}
