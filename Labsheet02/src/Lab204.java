import java.util.Scanner;
 
public class Lab204 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int numberX = input.nextInt();
		System.out.print("Input value of Y : ");
		int numberY = input.nextInt();
		while(numberY < numberX) {
			System.out.print("Input value of Y, again : ");
			numberY = input.nextInt();
		}
		
		System.out.println("");
 
		int sum = numberX;
		
        for (int i = numberX + 1; i <= numberY; i++) {
            int fristSum = sum;
            sum += i;
            System.out.println(fristSum + " + " + i + " = " + sum);
        }
			
		input.close();
	}
 
}