package com.revature.media;

public class Movie extends Media {
	
	public Movie(String author, String title, int yearPublished, String genre)
	{
		super();
		this.producer = producer;
		this.title = title;
		this.yearPublished = yearPublished;
		this.genre = genre;
	}
	
	public Movie()
	{
		super();
	}

	private String producer;
	
	public String getAuthor() {
		return producer;
	}

	public void setAuthor(String producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Movie [producer=" + producer + ", title = " + title + ", Year Published " + yearPublished + ",Genre " + genre + "]";
	}
	
}
