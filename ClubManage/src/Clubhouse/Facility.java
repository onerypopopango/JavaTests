package Clubhouse;

public class Facility {
	
	private String name;
	private String description;
	
	//constructors
	public Facility(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Facility(String name) {
		this(name, " ");
	}
	
	public Facility() {
		this("Void Deck", "Dead");
	}
	
	//overriding
	public String toString() {
		String s = this.name; 
		String t;
		
		if (this.description != " ") {
			t = "\"" + this.description + "\"";
		}
		else {
			t = "";
		}
		
		String u = s + "\n" + t;
		
		return u;
	}
	
	//methods
	public void show() {
		System.out.println(this.toString());
	}

	//properties
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
