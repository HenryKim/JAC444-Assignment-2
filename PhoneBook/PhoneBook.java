/**
 * JAC 444 Assignment 1
 * PhoneBook.java
 * @author Hyungi Kim
 */
package PhoneBook;



import java.util.Arrays;


public class PhoneBook extends PhoneEntry
{
	//A class PhoneBook extends from Phone Entry class
	public String pbCityName;
	public int totalEntry;
	private int curEntry;
	public PhoneEntry[] pbEntry;
	
	// default constructor
	public PhoneBook()
	{
		this("Markham", 10000);
		this.pbEntry = new PhoneEntry[totalEntry];
		this.curEntry = 0;
	}
	//a constructor with 2 values city name, and total number entry;
	public PhoneBook( String pbCityName_ , int totalEntry_)
	{
	this.pbCityName = pbCityName_;
	this.totalEntry= totalEntry_;
	this.pbEntry = new PhoneEntry[totalEntry_];
	}
	
	
	public boolean add(PhoneEntry newentry)
	{
		 // if Current Entry is matched to total entry than return false;
		
		if ( curEntry == totalEntry ) return false;
		// other wise add new entry to phone entry
		// and increment current Entry value;
		else
		{
			pbEntry[curEntry] = newentry;
			this.curEntry++;
			return true;
		}
	}
	
	public PhoneEntry[] deleteByName(String name)
	{
		  boolean cnt = false;
		  // loop all Phone Entry until current Entry and use equals() to fine match string
		  // if matched that Phone Entry will be delete (null) and set trigger as true, and return pbEntry
		  // if their is no matched name trigger is false' and will return false
		    for (int i=0; i<curEntry; i++){
		    	//if (pbEntry[i] != null){
		  
		      if (pbEntry[i] != null && pbEntry[i].peName.equals(name))
		      {
		    	  pbEntry[i] = null;
		      }
		    	}
		   // }
		  //if cnt is false?
		    if(!cnt) return null;
		    
		    else return pbEntry;
	}
	//toString();
	public String toString() {
		return "PhoneBook [City Name = " + pbCityName + "Total Entry = " 
				+ totalEntry + "]" 
		+ (pbEntry != null ? Arrays.asList(pbEntry) : null);
	}
	  public static void main(String args[]) {

	
		  //creates phone book obj and phone entry for test
		  PhoneBook phonebook = new PhoneBook("Markham", 5);

		  PhoneEntry[] phoneentry= new PhoneEntry[5];
		  phoneentry[0] = new PhoneEntry( "A" , "Addr1", "111-111-1111");
		  phoneentry[1] = new PhoneEntry( "B" , "Addr2", "222-222-2222");
		  phoneentry[2] = new PhoneEntry( "C" , "Addr3", "333-333-3333");
		  phoneentry[3] = new PhoneEntry( "D" , "Addr4", "444-444-4444");
		  phoneentry[4] = new PhoneEntry( "E" , "Addr5", "555-555-5555");

		  //add obj to Phonebook
		  for(int i = 0; i<5 ; i++ )
		  {
			  phonebook.add(phoneentry[i]);
		  }
		  System.out.println(phonebook.toString());
		  // delete 2 entry from phone book
		  phonebook.deleteByName("B");
		  System.out.println(phonebook.toString());
		  phonebook.deleteByName("E");
		  
		  //display PhoneBook entry
		  System.out.println(phonebook.toString());
			  
	  }
}

