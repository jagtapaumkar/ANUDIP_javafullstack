import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		int width=input.nextInt();
		System.out.println("Area will be "+length*width);
		System.out.println("Perimeter will be"+2*(length+width));
	}

}
