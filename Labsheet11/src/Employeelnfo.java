import java.io.IOException;
import java.util.*;
public class Employeelnfo {
	public static void main(String[] args) throws IOException{
		//ประกาศ object input เพื่อรับข้อมูลทาง keyboard
		Scanner input = new Scanner(System.in);
		
		String choose;
		
		System.out.print("Insert or Search Data?: ");
		choose = input.next().toLowerCase();
		
		while(!choose.equals("insert") && !choose.equals("search")) {
			System.out.print("Insert or Search Data ,again?: ");
			choose = input.next().toLowerCase();
		}//end while
		
		SaveandOpen objFile = new SaveandOpen();
		if(choose.equals("insert")) {
			objFile.insert();			
		}else if(choose.equals("search")) {
			System.out.print("\nEnter department:");
			String dept = input.next().toLowerCase();
			objFile.setDept(dept);
			objFile.searchData();			
		} 

	}//end main()

}