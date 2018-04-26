
		/**
		 * 7. Implement a binary search algorithm.
		 * 
		 * Searching a sorted collection is a common task. A dictionary is a sorted list
		 * of word definitions. Given a word, one can find its definition. A telephone
		 * book is a sorted list of people's names, addresses, and telephone numbers.
		 * Knowing someone's name allows one to quickly find their telephone number and
		 * address.
		 * 
		 * If the list to be searched contains more than a few items (a dozen, say) a
		 * binary search will require far fewer comparisons than a linear search, but it
		 * imposes the requirement that the list be sorted.
		 * 
		 * In computer science, a binary search or half-interval search algorithm finds
		 * the position of a specified input value (the search "key") within an array
		 * sorted by key value.
		 * 
		 * In each step, the algorithm compares the search key value with the key value
		 * of the middle element of the array.
		 * 
		 * If the keys match, then a matching element has been found and its index, or
		 * position, is returned.
		 * 
		 * Otherwise, if the search key is less than the middle element's key, then the
		 * algorithm repeats its action on the sub-array to the left of the middle
		 * element or, if the search key is greater, on the sub-array to the right.
		 * 
		 * If the remaining array to be searched is empty, then the key cannot be found
		 * in the array and a special "not found" indication is returned.
		 * 
		 * A binary search halves the number of items to check with each iteration, so
		 * locating an item (or determining its absence) takes logarithmic time. A
		 * binary search is a dichotomic divide and conquer search algorithm.
		 * 
		 */
package com.revature.binarysearch;
import java.util.ArrayList;
import java.util.List;

		class BinarySearch {
			
			
			public static void main(String[] args)
			{
			
			List<String> sortedList = new ArrayList<String>();
			
			int indice = 0;
			
			
			sortedList.add("a");
			sortedList.add("b");
			sortedList.add("c");
			sortedList.add("d");
			sortedList.add("e");
			sortedList.add("f");
			
			searchingIndexOf(sortedList, indice);
			
			//System.out.println("The indice of your character is: " + indice);
			
			}
			


			public static int searchingIndexOf(List<String> sortedList, int indice) {
				
				String searchIndex = "c";
				Integer nuevoIndice=0;
				int i;
				
				for(i = 0; i<sortedList.size(); i++)
				{
					 sortedList.get(i);
					 if(sortedList.get(i).equals(searchIndex))
					 {
						 
						 indice = sortedList.size()/2;
						 
						 if(i == indice)
						 {
							 System.out.println("You've found it. Well done.");
							 System.out.println("It's index is : " + indice);
							 System.out.println("The array is " + sortedList.size() + " long.");
							 
							 return indice;
							 
						 	}
						 else
						 if(i < indice)
						 {
							nuevoIndice = i;
							nuevoIndice -= 1;
							
							 
						 }
						 else
							 if(i > indice)
							 {
								 nuevoIndice = i;
								 nuevoIndice +=i;
							 }
							 							
											 
					 }
				
				}
				// TODO Write an implementation for this method declaration
				//return 0;
				 return indice;
			}
			


		}
		