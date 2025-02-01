import java.util.Scanner;

public class Roi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Principle");
		int principle=input.nextInt();
		System.out.println("Enter the Rate");
		float rate=input.nextFloat();
		System.out.println("Enter the years");
		float time=input.nextFloat();
		float SI=((rate*time)*(principle))/100;
		System.out.println("Simple interest will be"+SI);
		System.out.println("Final Amount will be"+SI+principle);
	}

}
