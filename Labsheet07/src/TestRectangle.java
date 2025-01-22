
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		System.out.println(r1.showData());
		
		System.out.println("Display data using toSting() method");
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		
		r1.setLength(5.6f);
		r2.setLength(7.8f);
		System.out.println(r1);
		System.out.println("length is "+ r1.getLength());
		System.out.println("width is "+ r1.getWidth());
		
		Spacing();
		System.out.printf("area is %.2f%n", r1.getArea());
		System.out.printf("perimeter is ");
		
	}
	public static void Spacing() {
		System.out.println();
	}
}
