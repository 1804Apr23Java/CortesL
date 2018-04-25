package com.revature.hello; //package is a namespace

public class Fruit {
	
		private String colores;
		
		//"Void" returns type on a method = returns nothing
		public void grow()
		{
			System.out.println("Fruit is growing");
		}
		public String getColor()
		{
			  return this.colores;
			
		}
		
		public void setColor(String colores)
		{
			 this.colores = colores;
		}
		
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((colores == null) ? 0 : colores.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)//this compares the reference of the objects
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Fruit other = (Fruit) obj;
			if (colores == null) {
				if (other.colores != null)
					return false;
			} else if (!colores.equals(other.colores))
				return false;
			return true;
		}

}
