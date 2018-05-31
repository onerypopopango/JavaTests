package Clubhouse;

public class Person {
	
	private String surName;
	private String firstName;
	private String secondName;
	
	//constructor
	public Person(String surName, String firstName, String secondName) {
		this.surName = surName;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public Person(String surname, String firstName) {
		this(surname, firstName, null);
	}
	
	public Person() {
		this("Member", "List", ":");
	}
	
	//overriding toString
	public String toString() {
		String s;
		
		if (this.secondName == null) {
			s = this.firstName + " " + this.surName;
		}
		
		else {
			s = this.surName + " " + this.firstName + " " + this.secondName;
		}
		
		return s;
	}
	
	//method
	public void show() {
		System.out.println(this.toString());
	}

	//properties
	public String getSurname() {
		return surName;
	}

	public void setSurname(String surname) {
		this.surName = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

}
