/**
 * JAC 444 Assignment 1
 * Book.java
 * @author Hyungi Kim
 */
package PartB;

public class Book
{
	//A book class
	public String bName;
	public String bISBN;
	public int bPrice;
	
	
	public Book()
	{
	//default constructor
		this( null, null ,0);
	}
	public Book( String bName_, String bISBN_, int bPrice_)
	{
		// A constructor for book name, book isbn code ,and book price
		this.bName = bName_;
		this.bISBN = bISBN_;
		this.bPrice = bPrice_;
	}
	public String getbName() {
		return bName;
			//setters and getters
	}
	public void setbName(String bName) {
		this.bName = bName;
		//setters and getters
	}
	public String getbISBN() {
		return bISBN;
		//setters and getters
	}
	
	public void setbISBN(String bISBN) {
		this.bISBN = bISBN;
		//setters and getters
	}
	public int getbPrice() {
		return bPrice;
		//setters and getters
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
		//setters and getters
	}
	public String toString() {
		//toString Method
		return "Book [bName=" + bName + ", bISBN=" + bISBN + ", bPrice="
				+ bPrice + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bISBN == null) ? 0 : bISBN.hashCode());
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
		result = prime * result + bPrice;
		return result;
	}
	public boolean equals(Object obj) {
		
		//equals() method
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bISBN == null) {
			if (other.bISBN != null)
				return false;
		} else if (!bISBN.equals(other.bISBN))
			return false;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		if (bPrice != other.bPrice)
			return false;
		return true;
	}
	protected Object clone()
	{
		//Clone();
		try{
			Book returnObj = (Book)super.clone();
			return returnObj;
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
}