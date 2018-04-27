package com.revature.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.revature.media.Movie;

public class PracticeIO {
	
	public static void main(String[] args)
	{
		String filename = "src/serializedThings/Movies";
		
		List<Movie> movieList = new ArrayList<Movie>();
		Movie m1 = new Movie("Steven Spielberg", "Ready Player One", 2018, "Adventure");
		Movie m2 = new Movie("Quentin Tarantino", "Pulp Fiction", 1994, "Tarantino");
		Movie m3 = new Movie("George Lucas", "Star Wars", 1984, "Sci-fi");
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		System.out.println("Movies before sort");
		for(Movie m : movieList)
		{
			System.out.println(m);
		}
		
		//serializingObject(filename, movieList);
		System.out.println(deserializeObject(filename));
		
		
	}
	public static void serializingObject(String filename, Object o) {
		
		try {
		//use a FileOutputStream to write byte stream to a file
			FileOutputStream fileOut = new FileOutputStream(filename);
		
		//use an ObjectOutputStream to represent an object as a byte stream
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			//Actually send my object - actual serialization process
			out.writeObject(o);
			//Close resources
			out.close();
			fileOut.close();
			
			System.out.println("Serialization succesful!");
			
	} catch (FileNotFoundException f) {
		
		f.printStackTrace();
		
	} catch (IOException e)
		{
		e.printStackTrace();
		}
	

}
	public static Object deserializeObject(String filename)
	{
		Object o = null;
		
		try {
		
			FileInputStream fileIn = new FileInputStream(filename);			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			o = in.readObject();
			
			in.close();
			fileIn.close();
		} 
		catch (FileNotFoundException f)		{
			f.printStackTrace();
			} 
		catch (IOException e)		{
			e.printStackTrace();
			} 
		catch (ClassNotFoundException c) {
			// TODO Auto-generated catch block
			c.printStackTrace();
		}
		
		return o;
	}
}