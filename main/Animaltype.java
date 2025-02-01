import java.util.*;
public class Animaltype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the animal");
		String animal=input.next();
		animal=animal.toLowerCase();
		if(animal.equals("dog")) {
			System.out.println("mammal");
		}
		else if(animal.equals("crocodile") || animal.equals("tortoise") || animal.equals("snake")) {
			System.out.println("reptile");
		}
		else {
			System.out.println("unknown");
		}
	}

}
