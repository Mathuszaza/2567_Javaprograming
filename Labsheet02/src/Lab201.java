import javax.swing.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many cutomer per bill"));
		double totalPrice = BUFFET * numberofCustomer;
		//System.out.print("Total price is %,.2f baht.",totalPrice);
		int isMember = JOptionPane.showConfirmDialog(null,"Total price is "+totalPrice+ "baht. Do you have a member card?");
		if (isMember==JOptionPane.YES_OPTION) {
			double priceAfterDiscount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+priceAfterDiscount +" baht.");
		}
		

	}

}
