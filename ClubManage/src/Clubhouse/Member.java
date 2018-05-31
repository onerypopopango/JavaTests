package Clubhouse;

//inheritance
public class Member extends Person {
	private int memberNumber;
	
	//constructor from superclass/parent
	public Member(String surName, String firstName, String secondName, int memberNumber) {
		super(surName, firstName, secondName);
		this.memberNumber = memberNumber;
	}
	
	public Member(String surName, String firstName, int memberNumber) {
		super(surName, firstName);
		this.memberNumber = memberNumber;
	}
	
	public Member() {
		super();
		this.memberNumber = 0;
	}

	//properties
	public int getMemberNumber() {
		return memberNumber;
	}
	
	public void show() {
		if (memberNumber !=0) {
			System.out.println(this.toString());
			System.out.println("Member No: " + this.memberNumber);
		}
		else {
			System.out.println(this.toString());
		}
		
	}
	
}

