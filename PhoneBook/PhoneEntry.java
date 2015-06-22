/**
 * JAC 444 Assignment 1
 * PhoneEntry.java
 * @author Hyungi Kim
 */
package PhoneBook;



public class PhoneEntry{
	// A class for PhoneEntry
	public String peName;
	public String peAddr;
	public String pePhoneNum;
	
	public PhoneEntry()
	{
		//A default constructor
		this(null,null,null);
	}
	public PhoneEntry( String peName_, String peAddr_, String pePhoneNum_ )
	{
		//A constructor with name, address, and phone number
		this.peName = peName_;
		this.peAddr = peAddr_;
		this.pePhoneNum = pePhoneNum_;
	}
	

	
	public String toString() {
		
		//toString Method
		return  "\n" + "PhoneEntry [Name = " + peName + ", Adress = " + peAddr
				+ ", Phone Number = " + pePhoneNum +"]";
	}
	

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((peAddr == null) ? 0 : peAddr.hashCode());
		result = prime * result + ((peName == null) ? 0 : peName.hashCode());
		result = prime * result
				+ ((pePhoneNum == null) ? 0 : pePhoneNum.hashCode());
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
		PhoneEntry other = (PhoneEntry) obj;
		if (peAddr == null) {
			if (other.peAddr != null)
				return false;
		} else if (!peAddr.equals(other.peAddr))
			return false;
		if (peName == null) {
			if (other.peName != null)
				return false;
		} else if (!peName.equals(other.peName))
			return false;
		if (pePhoneNum == null) {
			if (other.pePhoneNum != null)
				return false;
		} else if (!pePhoneNum.equals(other.pePhoneNum))
			return false;
		return true;
	}
	public String getPeName() {
		return peName;
		//setter and getter
	}
	public void setPeName(String peName) {
		this.peName = peName;
		//setter and getter
	}
	public String getPeAddr() {
		return peAddr;
		//setter and getter
	}
	public void setPeAddr(String peAddr) {
		this.peAddr = peAddr;
		//setter and getter
	}
	public String getPePhoneNum() {
		return pePhoneNum;
		//setter and getter
	}
	public void setPePhoneNum(String pePhoneNum) {
		this.pePhoneNum = pePhoneNum;
		//setter and getter
	}
}
		

