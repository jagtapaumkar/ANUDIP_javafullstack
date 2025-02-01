import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1=input.nextInt();
		System.out.println("Enter the num2");
		int num2=input.nextInt();
		
		//Arithmetic operators
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num1*num2);
		
		//increment decrement operators
		System.out.println(num1++);
		System.out.println(++num1);
		System.out.println(num1--);
		System.out.println(--num1);
		
		//logical operators
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		
		//bitwise operators
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(num1^num2);
	}

}
