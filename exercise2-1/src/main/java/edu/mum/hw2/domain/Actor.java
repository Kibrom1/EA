package edu.mum.hw2.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Actor {

	private String character;
	private String name;
	private double rating;

	public Actor() {
		super();
	}

	public Actor(String name){
		this.name=name;
	}
	public String getCharacter() {

		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}
	public double getRating(){
		
		return rating;
	}
	
	public void setRating(double rate){
		
		this.rating = rate;
	}
}
