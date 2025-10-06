package shoping_cart;

import java.util.Scanner;

public class ShopingCart 
{
	 public static void main(String[] args) 
	 {
		Scanner scan = new Scanner(System.in);
		char Currency = '₹';
		double total;
		
		String[] items = {"kfc","pizza","burger","cake","chicken bryani"};
		double[] prices= {200,199,100,75,299};
		System.out.println("Avilable items: ");
		for(int i=0;i<items.length;i++)
		{
			System.out.println("- "+items[i]+":" + Currency + prices[i]);
		}
		
		System.out.print("\n What Item Would You Like To Buy?: ");
		String item = scan.next().toLowerCase();
		
		double price=0;
		boolean found= false;
		
		for( int i=0; i< items.length; i++)
		{
			if(item.equals(items [i]))
			{
				price = prices[i];
				found = true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("Sorry , that item is not aviladle.");
			return;
			
		}
		System.out.println("The price of " +item+ " is "+Currency + price);
		
		System.out.print("How many would you like? ");
		int quantity = scan.nextInt();
		
		total = price*quantity;
		if(total> 499)
		{
			System.out.println("Congratulations! You are eligible for  a ₹100 discount!");
			System.out.print("Do you want to apply the discount ? (yes/no): ");
			String choice = scan.next();
			if(choice.equalsIgnoreCase("yes")) {
				total-=100;
				System.out.println("₹100 discount applied successfully! ");
				
			}else {
				System.out.println("Discount is not applied.");
			}
		}else {
			System.out.println("if you want ₹100. cashback, purchase above ₹499.");
		}
		System.out.println("\n You have bought "+ quantity +" "+item +"/s");
		System.out.println("Your total amount is "+Currency + total);
		System.out.println("Thank you for Shopping with us");
		scan.close();
	}
}
