/**
 * JAC 444 Assignment 1
 * Course.java
 * @author Hyungi Kim
 */
package PartB;

public class Course extends Book
{
	
	// A class for Course extends from Book class
	public String crsName;
	public String crsId;
	public String crsDescription;
	public String mark;


	public Course()
	{
		//default constructor
		this(null,null,null);
	}
	public Course ( String crsName_ , String crsId_, String crsDescription_)
	{
		//constructor with course name, course id , and course description is given
		this.crsName = crsName_;
		this.crsId = crsId_;
		this.crsDescription = crsDescription_;
		this.mark = null;
	}
	public Course(Course a) {
		// a copy constructor
		this.crsName = a.crsName;
		this.crsId = a.crsId;
		this.crsDescription = a.crsDescription;
		this.mark = null;
		// TODO Auto-generated constructor stub
	}
	protected Object clone()
	{
		Course returnObj = (Course)super.clone();
		return returnObj;
	}
	public String getCrsName() {
		return crsName;
		//setter and getter
	}
	public void setCrsName(String crsName) {
		this.crsName = crsName;
		//setter and getter
	}
	public String getCrsId() {
		return crsId;
		//setter and getter
	}
	public void setCrsId(String crsId) {
		this.crsId = crsId;
		//setter and getter
	}
	public String getCrsDescription() {
		return crsDescription;
		//setter and getter
	}
	public void setCrsDescription(String crsDescription) {
		this.crsDescription = crsDescription;
		//setter and getter
	}
	public String getMark() {
		return mark;
		//setter and getter
	}
	public void setMark(String mark) {
		this.mark = mark;
		//setter and getter
	}
	public String toString() {
		//toString Method
		return "Course [crsName=" + crsName + ", crsId=" + crsId
				+ ", crsDescription=" + crsDescription + "]";
	}
	
	
}