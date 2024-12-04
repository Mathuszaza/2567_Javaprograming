import java.util.Scanner;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of minutes   : ");
		String minutes = input.nextLine();
		int hour = minutes/60;
		int day = hour/24;
		int year = day/365;
		int motday = day%365;
		System.out.println(+mintes+ "minutes is approximately "+year+" years and "+motday+" days");

	}

}
