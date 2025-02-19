public class PattanakarnBrach extends Product {
	private int payUnit() {
		return super.getUnit();
	}
	private int freeUnit() {
		return super.getUnit();
	}
	public int getTotalprice() {
		return payUnit() * 100;
	}
	public String toString() {
		return "You bay " + payUnit() + " unit, get free "+freeUnit()+ " unit (" + getTotalprice()+").";
	}
}