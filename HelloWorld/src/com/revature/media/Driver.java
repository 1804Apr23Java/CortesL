package com.revature.media;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import com.revature.media.Media;
import com.revature.media.Book;
import com.revature.media.Movie;
import com.revature.hello.Fruit;
public class Driver {

	public static void main(String[] args)
	{
		
	
	List<Media> mediaList = new ArrayList<Media>();
	
	Book b1 = new Book("Elie Weisel", "Night", 1960, "memoir");
	Book b2 = new Book("Stephen King", "It", 1986, "horror");
	
	Movie m1 = new Movie("Steven Spielberg", "Jaws", 1975, "horror");
	Movie m2 = new Movie("David Michael Latt", "Sharknado", 2013, "science fiction");
	
	mediaList.add(b1);
	mediaList.add(b2);
	mediaList.add(m1);
	mediaList.add(m2);
	
	//funWithReflections();
	
	//System.out.println(genericReflections(mediaList));
	//Book b4 = (Book) objectReflections(b2);
	
	System.out.println(filterByMediaType(mediaList, "Book"));
	
	
	
	
}
	public static List<Media> filterByMediaType(List<Media> mediaList, String mediaType)
	{
		
		List<Media> filteredList = new ArrayList<Media>();//List alone is an interface
		try {
			checkType(mediaType);
		} catch 
			(MediaException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
		for (Media item : mediaList)
		{
			if(item.getClass().getName().equals("com.revature.media." + mediaType)) {
				filteredList.add(item);
		}
		}
		return filteredList;
		
	}
	
	public static void checkType(String type) throws MediaException
	{
		if(!type.equals("Book") && !type.equals("Movie"))
			throw new MediaException();
	}
	//return first Book from list of objets, if exist
	public static <T> List<T> genericReflections(List<T> l)
	{
		List<T> newList = new ArrayList<T>();
		
		for(T item : l)
		{
			if (item.getClass().getName().equals("com.revature.media.Book"))
			newList.add(item);
				
			
		}
			return newList;
		
	}
	
	public static Object objectReflections(Book b2)
	{
		return new Fruit();
	}
	public static void funWithReflections()
	{
		try {
			
			//get Book class using relfection
			Class clazz = Class.forName("com.revature.media.Book");
			System.out.println(clazz.getSimpleName());
			
			//Print declared fields can be done as well
			Field[] fields = clazz.getDeclaredFields();
			for(Field f: fields)
			{
				System.out.println(f.getName() + "with a database type of " + f.getType());
			}
			
			//New instance of Book
			Book b3  = (Book) clazz.newInstance();
			Field author = clazz.getDeclaredField("author");
			author.setAccessible(true);
			author.set(b3, "Michael Bay");
			System.out.println(b3);
			
		} catch (ClassNotFoundException c)
		{
			c.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
