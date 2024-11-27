import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		System.out.println("--------------------------------");
		float totalPriceofProduct = productUnit *productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct)+" baht");
		System.out.println("--------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("--------------------------------");
		float totalwithdis = totalPriceofProduct*(discount/100.0f);
		System.out.println("Discount from "+discount+"%     "  +frm.format(totalwithdis)+" baht.");
		float amount = totalPriceofProduct - totalwithdis;
		System.out.println("Amount to be paid     "+frm.format(amount)+" baht.");
		
		input.close();


	}

}
