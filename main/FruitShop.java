import java.util.*;
public class FruitShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Fruit");
		String fruit=input.next();
		fruit=fruit.toLowerCase();
		
		System.out.println("Enter Day");
		String day=input.next();
		day=day.toLowerCase();
		
		System.out.println("Enter the quantity");
		double quantity=input.nextDouble();
		
		double amount;
		
		if(day.equals("saturday")||day.equals("sunday")) {
			if(fruit.equals("banana")) {
				amount=quantity*2.70;
				System.out.println(amount);
			}
			else if(fruit.equals("apple")) {
				amount=quantity*1.25;
				System.out.println(amount);
			}
			else if(fruit.equals("orange")) {
				amount=quantity*0.90;
				System.out.println(amount);
			}
			else if(fruit.equals("grapefruit")) {
				amount=quantity*1.60;
				System.out.println(amount);
			}
			else if(fruit.equals("kiwi")) {
				amount=quantity*3.00;
				System.out.println(amount);
			}
			else if(fruit.equals("pineapple")) {
				amount=quantity*5.60;
				System.out.println(amount);
			}
			else if(fruit.equals("grapes")) {
				amount=quantity*4.20;
				System.out.println(amount);
			}
			else {
				System.out.println("Error");
			}
		}
		else if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")) {
			if(fruit.equals("banana")) {
				amount=quantity*2.50;
				System.out.println(amount);
			}
			else if(fruit.equals("apple")) {
				amount=quantity*1.20;
				System.out.println(amount);
			}
			else if(fruit.equals("orange")) {
				amount=quantity*0.85;
				System.out.println(amount);
			}
			else if(fruit.equals("grapefruit")) {
				amount=quantity*1.45;
				System.out.println(amount);
			}
			else if(fruit.equals("kiwi")) {
				amount=quantity*2.70;
				System.out.println(amount);
			}
			else if(fruit.equals("pineapple")) {
				amount=quantity*5.50;
				System.out.println(amount);
			}
			else if(fruit.equals("grapes")) {
				amount=quantity*3.85;
				System.out.println(amount);
			}
			else {
				System.out.println("Error");
			}
		}
		else {
			System.out.println("error");
		}
	}

}
