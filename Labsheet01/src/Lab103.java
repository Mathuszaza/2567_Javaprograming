import javax.swing.*;
public class Lab103 {
    public static void main(String[] args)
    {
 
       int ParkingMinutes = Integer.parseInt(JOptionPane.showInputDialog(null,
    		   "Input Time Parking (minutes):",
    		   "Input",JOptionPane.QUESTION_MESSAGE));
 
       //Calculate
       int hour = ParkingMinutes / 60;
       int minutes = ParkingMinutes - (hour * 60);
       double ParkingPay = (hour *  50) + (minutes * 0.25);
 
       //ShowMessage
       JOptionPane.showMessageDialog(null,
    		   "You parking " +hour+ " Hour " +minutes+ " Minute. " +
               "\nAmount to be paid is " +ParkingPay+ " baht.");
    }
}