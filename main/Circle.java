import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Radius");
		float radius=input.nextFloat();
		System.out.println("Area will be "+3.14*radius*radius);
		System.out.println("Circumference will be "+2*3.14*radius);
	}

}
