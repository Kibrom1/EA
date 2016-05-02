package edu.mum.hw2.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "movie")
@Table(name = "movie", schema = "cs544")
public class Movie {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	@Enumerated(EnumType.STRING)
	private Category category;

	private String cover;
	private List<Double> rating = new ArrayList<Double>();

	@ElementCollection
	private List<String> comment = new ArrayList<String>();
	@ElementCollection
	private List<Actor> actors = new ArrayList<Actor>();

	public Movie() {

	}

	public int getId() {

		return id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public List<String> getComment() {

		return comment;
	}

	public List<Actor> getActors() {

		return actors;
	}

	public List<Double> getRatings() {
		return rating;
	}

	public void setCover(String cover) {

		this.cover = cover;
	}

	public String getCover() {

		return cover;
	}
	
	public void setCategory(Category cate){
		
		this.category = cate;
	}
	public Category getCategory(){
		
		return category;
	}

}