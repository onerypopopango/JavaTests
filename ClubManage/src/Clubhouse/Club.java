package Clubhouse;

import java.util.ArrayList;
import java.util.HashMap;

public class Club {
	
	private int currentNumber = 1;	
	private ArrayList<Member> members = new ArrayList<Member>();
	private Member m;
	
	public HashMap<Integer, Facility> facilMap = new HashMap<Integer, Facility>();
	
	//constructor
	public Club() {
		m = new Member();
		members.add(m);
		facilMap.put(1, new Facility("Danger Zone", "Training area for mutants."));
		facilMap.put(2, new Facility("Jumping Grounds", "Where the ground and soil literaly jumps up."));
		facilMap.put(3, new Facility("Snape's Hollow", "Practice your Aveda Kadava and Crucious curses here."));
		facilMap.put(4, new Facility("Swordy Cave", "Fence your way to ultimate swordmanship here."));
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
