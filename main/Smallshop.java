import java.util.*;
public class Smallshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the product");
		String product=input.next();
		product=product.toLowerCase();
		System.out.println("Enter the city");
		String city=input.next();
		city=city.toLowerCase();
		System.out.println("Enter the quantity");
		int quantity=input.nextInt();
		
		double price;
		if(product.equals("coffee")) {
			if(city.equals("sofia")) {
				double amount=0.50;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("plovdiv")) {
				double amount=0.40;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("varna")) {
				double amount=0.45;
				price=amount*quantity;
				System.out.println(price);
			}
			else {
				System.out.println("error");
			}
		}
		
		else if(product.equals("water")) {
			if(city.equals("sofia")) {
				double amount=0.80;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("plovdiv")) {
				double amount=0.70;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("varna")) {
				double amount=0.70;
				price=amount*quantity;
				System.out.println(price);
			}
			else {
				System.out.println("error");
			}
		}
		
		else if(product.equals("beer")) {
			if(city.equals("sofia")) {
				double amount=1.20;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("plovdiv")) {
				double amount=1.15;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("varna")) {
				double amount=1.10;
				price=amount*quantity;
				System.out.println(price);
			}
			else {
				System.out.println("error");
			}
		}
		
		else if(product.equals("sweets")) {
			if(city.equals("sofia")) {
				double amount=1.45;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("plovdiv")) {
				double amount=1.30;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("varna")) {
				double amount=1.35;
				price=amount*quantity;
				System.out.println(price);
			}
			else {
				System.out.println("error");
			}
		}
		
		else if(product.equals("peanuts")) {
			if(city.equals("sofia")) {
				double amount=1.60;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("plovdiv")) {
				double amount=1.50;
				price=amount*quantity;
				System.out.println(price);
			}
			else if(city.equals("varna")) {
				double amount=1.55;
				price=amount*quantity;
				System.out.println(price);
			}
			else {
				System.out.println("error");
			}
		}
		else {
			System.out.println("error");
		}
	}

}
