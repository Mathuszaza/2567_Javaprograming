
public class Drink {
	private int type;
	private char size;
	
	Drink(int type,char size){
		this.type = type;
		this.size = size;
	}
	Drink(){
		this(0,' ');
	}
	public String getTypeName() {
		if(this.type == 1) {
			return "Hot";
		}
		else if(this.type == 2) {
			return "Cold";
		}
		else {
			return null;
		}
	}
	public int getTypePrice() {
		if(this.type == 1) {
			return 10;
		}
		else if(this.type == 2) {
			return 20;
		}
		else {
			return 0;
		}
	}
	public String getSizePrice() {
		if(this.size == 's'||this.type == 'S') {
			return "Small";
		}
		else if(this.type == 'm'||this.type == 'M') {
			return "Medium";
		}
		else if(this.type == 'l'||this.type == 'L') {
			return "Large";
		}
		else {
			return null;
		}
	}
	public int getSizePrice() {
		if(this.size == 's'||this.type == 'S') {
			return 15;
		}
		else if(this.type == 'm'||this.type == 'M') {
			return 20;
		}
		else if(this.type == 'l'||this.type == 'L') {
			return 25;
		}
		else {
			return 0;
		}
	}
	public int getTotalPrice() {
		
	}
}
