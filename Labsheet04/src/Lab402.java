import javax.swing.*;
 
public class Lab402 {
    public static void main(String[] args) {
        
        //input
        int normalYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));
 
        
        if (checkYear(normalYear) == false) {
            while (true) {
            	normalYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));
                if (checkYear(normalYear) == false) {
                    break;
                }
            }
        }
        
        if (isLeapYear(normalYear) == true) {
            JOptionPane.showMessageDialog(null, normalYear + " is Leap year.");
        }
        else {
            JOptionPane.showMessageDialog(null, normalYear + " is NOT Leap year.");
        }
 
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        }
 
        return false;
 
    }
    
    public static boolean checkYear(int checkYear) {
        if (checkYear >= 1000 && checkYear <= 3000) {
                
            return true;
        }
        return false;
    }
}