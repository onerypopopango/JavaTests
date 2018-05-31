package Clubhouse;

import java.util.ArrayList;

public class Club {
	
	private int currentNumber = 1;	
	private ArrayList<Member> members = new ArrayList<Member>();
	private Member m;
	
	//constructor
	public Club() {
		m = new Member();
		members.add(m);
	}
	
	//methods
	public Member addMember(String surName, String firstName, String secondName) {	
		currentNumber = this.getCurrentNumber();
		m = new Member(surName, firstName, secondName, currentNumber);
		members.add(m);
		this.setCurrentNumber(currentNumber+1);
		
		return m;
	}
	
	public Member addMember(String surName, String firstName) {	
		currentNumber = this.getCurrentNumber();
		Member m = new Member(surName, firstName, currentNumber);
		members.add(m);
		this.setCurrentNumber(currentNumber+1);
		
		return m;
	}
	
	//arraylist to remove member...
	public void removeMember(int a) {
		members.remove(a);
	}

	//properties
	public void show() {
		for (Member m : members) {
			m.show();
			System.out.println("");
		}
	}

	public int getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
}
