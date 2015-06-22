/**
 * JAC 444 Assignment 1
 * Student.java
 * @author Hyungi Kim
 */
package PartB;

public class Student implements Gradeable{
	// A class for Student implements Gradeable intergace
	public int stnId;
	public String stnName;
	public Address stnAddr;
	public Student(){
		//default constructor
		this(0, null, null);
	}
	public Student(int stnID_, String stnName_, Address stnAddr_){
		//constructor with  student id, student name, Address.
		this.stnId = stnID_;
		this.stnName = stnName_;
		this.stnAddr = new Address(stnAddr_);
	}
/*	protected Object clone()
	{
			Student returnObj = (Student)super.clone();
			return returnObj;
	}
	*/
	public class Address 
	{
		// A Address class is inner class of student. It has detail information about student's address
		public String street;
		public int number;
		public String town;
		public String province;
		public String zipCode;
		 public Address()
		 {
			 this(null,0,null,null,null);
			 // A default constructor for Address class
		 }
		 public Address( String street_, int number_, String town_, String province_, String zipCode_)
		 {
			 //An address class constructor when street, street number, town , province and zipcode is given
			 this.street = street_;
			 this.town = town_;
			 this.province = province_;
			 this.zipCode = validate(zipCode_);
			 this.number = number_;
		 }
		 public Address(Address a)
		 { if(a != null){
			 //An Copy Constructor
			 this.street = a.street;
			 this.town = a.town;
			 this.province = a.province;
			 this.zipCode = validate(a.zipCode);
			 this.number = a.number;
			 }
		 }
		public String getStreet() {
			return street;
			//Setters and getters
		}
		public void setStreet(String street) {
			this.street = street;
			//Setters and getters
		}
		public int getNumber() {
			return number;
			//Setters and getters
		}
		public void setNumber(int number) {
			this.number = number;
			//Setters and getters
		}
		public String getTown() {
			return town;
			//Setters and getters
		}
		public void setTown(String town) {
			this.town = town;
			//Setters and getters
		}
		public String getProvince() {
			return province;
			//Setters and getters
		}
		public void setProvince(String province) {
			this.province = province;
			//Setters and getters
		}
		public String getZipCode() {
			return zipCode;
			//Setters and getters
		}
		public void setZipCode(String zipCode) {
			//Setters and getters
			this.zipCode = validate(zipCode);
		}
		protected Object clone()
		{
			try{
				Address returnObj = (Address)super.clone();
				return returnObj;
			}
			catch (CloneNotSupportedException e)
			{
				e.printStackTrace();
				return null;
			}
		}
		public String toString() {
			//toString Method;
			return "Address [street=" + street + ", number=" + number
					+ ", town=" + town + ", province=" + province
					+ ", zipCode=" + zipCode + "]";
		}
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + number;
			result = prime * result
					+ ((province == null) ? 0 : province.hashCode());
			result = prime * result
					+ ((street == null) ? 0 : street.hashCode());
			result = prime * result + ((town == null) ? 0 : town.hashCode());
			result = prime * result
					+ ((zipCode == null) ? 0 : zipCode.hashCode());
			return result;
		}
		public boolean equals(Object obj) {
			//equals method
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Address other = (Address) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (number != other.number)
				return false;
			if (province == null) {
				if (other.province != null)
					return false;
			} else if (!province.equals(other.province))
				return false;
			if (street == null) {
				if (other.street != null)
					return false;
			} else if (!street.equals(other.street))
				return false;
			if (town == null) {
				if (other.town != null)
					return false;
			} else if (!town.equals(other.town))
				return false;
			if (zipCode == null) {
				if (other.zipCode != null)
					return false;
			} else if (!zipCode.equals(other.zipCode))
				return false;
			return true;
		}
		private Student getOuterType() {
			return Student.this;
		}
		
		  protected String validate( String zipCode_)
		  {
		    String postCode = zipCode_;
		    // Check code format, throw an exception if it is invalid.
		    if ((postCode.length()== 0)
		      || (!Character.isLetter(postCode.charAt(0)))
		      || (!Character.isDigit(postCode.charAt(1)))
		      || (!Character.isLetter(postCode.charAt(2)))
		      || (!Character.isWhitespace(postCode.charAt(3)))
		      || (!Character.isDigit(postCode.charAt(4)))
		      || (!Character.isLetter(postCode.charAt(5))) 
		      || (!Character.isDigit(postCode.charAt(6)))
		      || (!Character.isUpperCase(postCode.charAt(0)))
		      || (!Character.isUpperCase(postCode.charAt(2)))
		      || (!Character.isUpperCase(postCode.charAt(5)))
		      || (postCode.length() > 7)) 
		    {
		      return null;
		    }
		    else
		    {
		      return postCode;
		    }    
		  }
		 
		 }
	//Setters and getters
	public int getStnId() {
		return stnId;
		//Setters and getters
	}
	public void setStnId(int stnId) {
		this.stnId = stnId;
		//Setters and getters
	}
	public String getStnName() {
		return stnName;
		//Setters and getters
	}
	public void setStnName(String stnName) {
		this.stnName = stnName;
		//Setters and getters
	}
	public Address getStnAddr() {
		return stnAddr;
		//Setters and getters
	}
	public void setStnAddr(Address stnAddr) {
		this.stnAddr = stnAddr;
		//Setters and getters
	}
	public String toString() {
		//toStringMethod of Studnet class
		return "Student [stnId=" + stnId + ", stnName=" + stnName
				+ ", stnAddr=" + stnAddr + "]";
	}
	public String grade(int marks) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
