package Clubhouse;

public class ClubManager {
	
public static void main(String[] args) {
		
		System.out.println("Hi there, meathead.");
		System.out.println("");
		
		Club night = new Club();
		
		night.addMember("Lim", "Hoe", "Kit");
		night.addMember("Cena", "John");
		night.addMember("Tan", "Ah", "Tek");
		night.addMember("Tepes", "Vlad");
		night.addMember("Marley", "Bob");
		night.show();
		
		night.removeMember(3);
		night.show();
		
		night.addMember("Lin", "Boon", "Keng");
		night.show();
		
		//Member a = new Member();
		//a = night.getMembers(1);
		//a.show();
		
		
	}
}
