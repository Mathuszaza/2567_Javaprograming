import java.util.*;
public class Lab306 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int sentenceCount = 0;
 
        System.out.print("Message: ");
        String message = input.nextLine();
        if (message.toLowerCase().indexOf("nichi")>=0) {
        	sentenceCount++;
 
        }
       
        if (sentenceCount > 0) {
            System.out.println("Nichi is a sentence");
        }
        else {
            System.out.println(input);
        }
 
        input.close();
 
    }
}