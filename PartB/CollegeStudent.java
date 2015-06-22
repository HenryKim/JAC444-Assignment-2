/**
 * JAC 444 Assignment 1
 * CollegeStudnet.java
 * @author Hyungi Kim
 */
package PartB;

import java.util.Arrays;
import java.util.Random;



public class CollegeStudent extends Student implements Runnable{
	//Its a CollegeStudent Class extended from Student class and implements an Runnable Thread
	public Course crs[];
	public int totalgrade;
	public CollegeStudent()
	{
		//Default Constructor for this class
		this.crs = new Course [3];
		this.totalgrade = 0;
	}
	public String toString() {
		//to String Method
		return "CollegeStudent [crs="
				+ (crs != null ? Arrays.asList(crs) : null) + ", totalgrade="
				+ totalgrade + "]";
	}
	public CollegeStudent(Course A){
		this(A, null ,null); // Constructor for only 1 class
	}
	public CollegeStudent(Course A, Course B){
		this ( A, B, null); // Constructor for only 2 class
	}
	public CollegeStudent(Course A, Course B, Course C){
		if( A == null || B == null || C == null) // if given class is null == NOT equal to 3
		{
			throw new NullPointerException("Class Must be minimum of 3"); // Throws null pointer Exception
		}
		else
		{
		//A constructor for construct 3 Course
		this.crs = new Course[3];
		this.crs[0] = new Course(A);
		this.crs[1] = new Course(B);
		this.crs[2] = new Course(C);
		this.totalgrade = 0;
		}
	}
	
	public String grade(int marks)
	{ try{
		//A grade method implements from gradeable interface
		//it receives Intiger value 
		//returns a String if value fits in range
		if( marks <= 49)
		{
			return "F";
		}
		else if (  marks >= 50 && marks <= 59)
		{
			return "D";
		}
		else if ( marks >= 60 && marks <= 69)
		{
			return "C";
		}
		else if ( marks >= 70 && marks <= 79)
		{
			return "B";
		}
		else if ( (marks >= 80) && (marks <= 89 ))
		{
			return "A";
		}
		else if ( marks >= 90)
		{
			return "A+";
		}
	    }catch(ArithmeticException ae){
	    	System.out.println("Given Mark is Invalid");// Exception for mark is invalid
	    }
		return null;
	}
	public void run(){
		//a Over ride of run method for multi thread
		Random random = new Random();
		int b;
		this.totalgrade = 0; //total grade for calculate student's Semister average
		for(int i = 0; i<3; i++)
		{
		//A for loop for enter marks	
		b = random.nextInt(100); // generate random value 0~100
		this.crs[i].setMark(grade(b)); // sends reandom value generate to grade method and use setters to set marks in tat cousr in current student
		this.totalgrade += b; // added in to total grade
		}
		System.out.println("Student's Final Grade is a " + grade( (this.totalgrade/3 ) )); //calculates average marks and send to grade method to print
	}
	/*protected Object clone()
	{
		CollegeStudent returnObj = (CollegeStudent)super.clone();
		return returnObj;
	}
	*/
	public static void main (String args[])
	{
		// A main method's to test
		try{
			Course[] crs = new Course[3];
			crs[0] = new Course("Java", "Jac444", "Java Course");
			crs[1] = new Course("C++", "OOP344", "C++ Course"); 
			crs[2] = new Course("DataBase","DBS301","SQL Course");
			//crs[3] = new Course("DataBase","DBS301","SQL Course");  // Array index bound exception test
			CollegeStudent cir = new CollegeStudent(crs[0],crs[1],crs[2]);
			CollegeStudent cir2 = new CollegeStudent(crs[0],crs[1],crs[2]);
			CollegeStudent cir3 = new CollegeStudent(crs[0],crs[1],crs[2]);
			//CollegeStudent cir4 = new CollegeStudent(crs[0]); // Class minimum of 3 exception test 1
			//CollegeStudent cir5 = new CollegeStudent(crs[0], crs[1]); // Class minimum of 3 exception test 2
			//CollegeStudent cir6 = new CollegeStudent(crs[0], crs[1], null); // Class minimum of 3 exception test 3
			Thread th = new Thread(cir);  //Creates New thread
			Thread th2 = new Thread(cir2); //Creates New thread
			Thread th3 = new Thread(cir3); //Creates New thread
			th.start(); // thread starts
			th2.start(); // thread starts
			th3.start(); // thread starts
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error in Array Creation");
			System.out.println("Application is closed");
			System.exit(-1);
		}catch(NullPointerException npe){
			System.out.println("A Class must be minimum of 3");
			System.out.println("Application is closed");
			System.exit(-1);
		}
	}
}


