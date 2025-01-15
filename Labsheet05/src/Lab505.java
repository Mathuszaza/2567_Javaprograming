import java.util.*;
 
public class Lab505 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] listNumber = {78, 36, 58, 41, 25, 92 ,75};
        int rowIndex;
 
        System.out.print("Input index of array : ");
        rowIndex = input.nextInt();
        while (rowIndex < 0 || rowIndex > listNumber.length-1)
        {
            System.out.print("Input index of array, again : ");
            rowIndex = input.nextInt();  
        }
        System.out.println();
 
        for (int i = 0; i<listNumber.length;i++)
        {
            if (rowIndex == i) {
                System.out.println("Value in current index is " + listNumber[i]);
                System.out.println((rowIndex == (listNumber.length-1)) ? "Sorry, " + rowIndex + " is the last index in array." : "Value in next    index is " + listNumber[i+1]);               
            }
        }
        input.close();
 
    }
}