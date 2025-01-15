import javax.swing.*;
 
public class Lab508 {
 
    public static void main(String[] args) {
        int[] nums =  {25, 78, 41, 22, 36, 85, 37};
        int rowIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
              
        while (checkIndex(nums, rowIndex) == false) {
        	rowIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
        }
        JOptionPane.showMessageDialog(null,"Current data, nums["+rowIndex+"] is "+currentData(nums, rowIndex)
                                          +"\n"+ (prevData(nums, rowIndex) != 0 ? "Previous data, nums["+(rowIndex-1)+"] is "+prevData(nums, rowIndex) : "No previous data" )
                                          +"\n"+ (nextData(nums, rowIndex) != 0 ? "Next data, nums["+(rowIndex+1)+"] is "+nextData(nums, rowIndex) : "No next data" ));   
    }   
    public static boolean checkIndex(int[] nums,int index)
    {
        boolean check = false;
        check = (index >= 0 && index < nums.length) ? true : false;
        return check;
           
    }   
    public static int currentData(int[] nums,int index)
    {
         int current = 0;
         for (int i = 0 ; i < nums.length ; i++) {
            current = (index == i) ? nums[i] : current;
         }
         return current;
    }
    public static int prevData(int[] nums,int index)
    {
        int previousData = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            previousData = (index == i) && (i>=1) ? nums[i-1] : previousData;
         }
        return previousData;
    }
    public static int nextData(int[] nums,int index)
    {
        int next = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            next = (index == i) && (i<6) ? nums[i+1] : next;
         }
        return next;
    }
}