import java.util.*;
public class PersonalTitles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=input.nextInt();
		System.out.println("Enter Gender:M/F");
		String gender=input.next();
		gender=gender.toLowerCase();
		if(gender.equals("m")) {
			if(age>=16) {
				System.out.println("Mr.");
			}
			else {
				System.out.println("Master");
			}
		}
		else {
			if(age>=16) {
				System.out.println("Ms.");
			}
			else {
				System.out.println("Miss");
			}
		}
	}

}
