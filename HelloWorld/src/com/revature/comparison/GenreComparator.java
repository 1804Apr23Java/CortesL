package com.revature.comparison;

import java.util.Comparator;
import com.revature.media.Movie;
public class GenreComparator implements Comperator<Movie> {

	@Override 
	public int compare(Movie arg0, Movie arg1)
	{
		return arg0.getGenre().compareTo(arg1.getGenre());
	}
	
}
