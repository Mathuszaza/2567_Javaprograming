import java.util.*;
 
public class Lab202 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Input number : ");
	int fristNumber = input.nextInt();
        while(true){
            System.out.print("Input number : ");
            int number = input.nextInt();
            if(fristNumber>number){
                System.out.print("\nBYE BYE");
                break;
            }
            number = fristNumber;
        }
        input.close();
    }
}