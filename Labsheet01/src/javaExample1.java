import java.util.*;
import java.text.*;

public class javaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println();
		float totalPriceofProduct = productUnit *productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct)+" baht");
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is "+frm.format(totalwithVat)+" Baht");
		System.out.println();
		String frmtotalwithVat = String.format("%,.2f", totalwithVat);
		System.out.println("Out using String.format");
		System.out.println("Add VAT 7% is "+frmtotalwithVat+" Baht");
		System.out.println("Output using print");
		System.out.printf("Add VAT 7%% is %,.2f", totalwithVat);
		
		input.close();

	}

}
