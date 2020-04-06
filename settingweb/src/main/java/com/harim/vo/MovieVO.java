package com.harim.vo;

public class MovieVO {
	private int movie_id;
	private String movie_name;
	private String director;
	private String types;
	private String moviecol;
	
	public void setMovie_id(int id) {
		this.movie_id = id;
	}
	
	public int getMovie_id() {
		return movie_id;
	}
	
	public void setMovie_name(String name) {
		this.movie_name = name;
	}
	
	public String getMovie_name() {
		return movie_name;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setTypes(String type) {
		this.types = type;
	}
	
	public String getTypes() {
		return types;
	}
	
	public void setMoviecol(String moviecol) {
		this.moviecol = moviecol;
	}
	
	public String getMoviecol() {
		return moviecol;
	}
}
