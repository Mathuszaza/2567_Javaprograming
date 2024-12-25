import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		
		inputStudent();
		
	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		String studentID, subjectCobe;
		boolean isStudentIDVaild, isSubjectCobeVaild;
		while(true) {
			System.out.print("Enter student ID (10 digits): ");
			studentID = scan.nextLine();
			
			System.out.print("Enter student ID (7 digits): ");
			subjectCobe = scan.nextLine();
			
			isStudentIDVaild = isLenght(studentID, 10);
			isSubjectCobeVaild = isLenght(subjectCobe, 7);
			if(isStudentIDVaild && isSubjectCobeVaild) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCobe);

				break;
			}else {
				System.out.print("");
			}
		}
	}
	public static boolean isLenght(String ID,int len) {

		return ID.length() == len;
	}
    public static boolean isITStudent(String stID)	{
    	if(stID.substring(0,6)=="211311") {
    		return true;
    	}
    	else {
    	    return false;
    	}
    }
    public static boolean isITSubject(String subCode)	{
    	if(subCode.substring(0,2)=="21"&& subCode.charAt(4)=='1') {
    		return true;
    	}
    	else {
    	    return false;
    	}
    }
    public static void displayData(boolean isSt,boolean isSub) {
    	System.out.println();
    	if (isSt == true) {
			System.out.print("1st year student in IT");
		}
		else {
			System.out.print("is not 1st year student in IT");
		}
		if (isSub == true) {
			System.out.print("\nEnroll in courses for Year 1");
		}
		else {
			System.out.print("\nnot enroll in courses for Year 1");
		}
 
 
	}
}
