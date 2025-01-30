package Java_basics;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        System.out.print("Enter first boolean value (true/false): ");
	        boolean bool1 = sc.nextBoolean();

	        System.out.print("Enter second boolean value (true/false): ");
	        boolean bool2 = sc.nextBoolean();

	        System.out.println("\n  Arithmetic Operators  ");
	        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

	        System.out.println("\n  Relational Operators  ");
	        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));
	        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2));
	        System.out.println(num1 + " >= " + num2 + " = " + (num1 >= num2));
	        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2));
	        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2));
	        System.out.println(num1 + " != " + num2 + " = " + (num1 != num2));

	        System.out.println("\n  Logical Operators  ");
	        System.out.println(bool1 + " && " + bool2 + " = " + (bool1 && bool2));
	        System.out.println(bool1 + " || " + bool2 + " = " + (bool1 || bool2));
	        System.out.println("!" + bool1 + " = " + (!bool1));

	        System.out.println("\n  Bitwise Operators  ");
	        System.out.println(num1 + " & " + num2 + " = " + (num1 & num2));
	        System.out.println(num1 + " | " + num2 + " = " + (num1 | num2));
	        System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2));
	        System.out.println("~" + num1 + " = " + (~num1));
	        System.out.println(num1 + " << 1 = " + (num1 << 1));
	        System.out.println(num1 + " >> 1 = " + (num1 >> 1));

	        System.out.println("\n  Assignment Operators  ");
	        int assignNum = num1;
	        System.out.println("assignNum = " + assignNum);
	        assignNum += num2;
	        System.out.println("assignNum += num2 -> " + assignNum);
	        assignNum -= num2;
	        System.out.println("assignNum -= num2 -> " + assignNum);
	        assignNum *= num2;
	        System.out.println("assignNum *= num2 -> " + assignNum);
	        assignNum /= (num2 != 0 ? num2 : 1);
	        System.out.println("assignNum /= num2 -> " + assignNum);
	        assignNum %= (num2 != 0 ? num2 : 1);
	        System.out.println("assignNum %= num2 -> " + assignNum);

	        System.out.println("\n  Ternary Operator  ");
	        String result = (num1 > num2) ? "num1 is greater" : "num2 is greater or equal";
	        System.out.println("Ternary result: " + result);

	        sc.close();
	}

}
