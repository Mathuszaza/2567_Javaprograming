import java.util.*;
public class Lab502 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
 
        //input
        for (int i = 0;i<number.length;i++) {
            System.out.print("Input number " +(i+1)+ " : ");
            number[i] = input.nextInt();
 
        }
   
        System.out.println();
        System.out.println("Summation of positive number is " + sumOfPos(number));
       
        input.close();
 
    }
 
    public static int sumOfPos(int[] number)
    {
        int sum = 0;
        for (int i =0;i<number.length;i++) {
            sum += number[i];
        }
        return sum;
 
    }
}