
public class Director {
	private String name;
	private String email;
	private char gender;
	
	Director(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	Director(String name,String email){
		this(name,email,' ');
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public char getGender() {
		return this.gender;
	}
	public String toString() {
		return getName() + "(" + getEmail() +";"+ getGender()  + ")"  ;
	}

}
