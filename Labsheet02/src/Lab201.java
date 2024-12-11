import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many cutomer per bill"));
		DecimalFormat frm = new DecimalFormat("#,###.00");
		double totalPrice = BUFFET * numberofCustomer;
		//System.out.print("Total price is %,.2f baht.",totalPrice);
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total price is "+frm.format(totalPrice)+ " baht." + "\nDo you have a member card?");
		}while(isMember==JOptionPane.CANCEL_OPTION);
		
		if (isMember==JOptionPane.YES_OPTION) {
			double priceAfterDiscount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+frm.format(priceAfterDiscount) +" baht.");
		}
		else if (isMember==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+ totalPrice +" baht.");
		}

	}

}
