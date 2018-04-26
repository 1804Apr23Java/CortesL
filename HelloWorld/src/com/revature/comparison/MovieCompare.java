package com.revature.comparison;
import com.revature.media.Movie;


import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class MovieCompare {

	public static void main(String[] args)
	{
		List<Movie> movieList = new ArrayList<Movie>();
		Movie m1 = new Movie("Steven Spielberg", "Ready Player One", 2018, "Adventure");
		Movie m2 = new Movie("Quentin Tarantino", "Pulp Fiction", 1994, "Tarantino");
		Movie m3 = new Movie("George Lucas", "Star Wars", 1984, "Sci-fi");
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		System.out.println("Movies before sort");
			//	for(Movie m:movieList)
					
		
	}
	public static List<Movie> sortWithYearComparable(List<Movie> movieList)
	
	{
		Collections.sort(movieList, new YearComparator());
		System.out.println("Movies after sort: ");
		for(Movie m : movieList)
		{
			System.out.println(m);
		}
		return movieList;
	}
	
	public static List<Movie> sortWithGenreComparable(List<Movie> movieList)
	
	{
		Collections.sort(movieList, new GenreComparator());
		System.out.println("Movies after sort: ");
		for(Movie m : movieList)
		{
			System.out.println(m);
		}
		return movieList;
	}
	public static List<Movie> sortWithComparable(List<Movie> movieList)
	
	{
		Collections.sort(movieList);
		System.out.println("Movies after sort: ");
		for(Movie m : movieList)
		{
			System.out.println(m);
		}
		return movieList;
	}
}
