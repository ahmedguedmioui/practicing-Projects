package Puzzls;

import java.util.Scanner;
class puzzls {
	Scanner scan = new Scanner(System.in);
	String name;
	//first-------------------------
	private String [] num = {"1945" , "drive"};
	private String [] user = new String[2];
	//second-----------------------
	private String [] num1 = {"player" , "elon musk"};
	private String [] user1 = new String[2];
	puzzls() {
		this.name = scan.next();
		get_answer_user1();
	}
	public String [] get_answer_user1() {
		System.out.println("first round:");
		System.out.println("---------------");
		
		System.out.println(name + " player:");
		System.out.println("when did the WW2 end?: ");
		user[0] = scan.nextLine();
		System.out.println("what do we do with a car?: ");
		user[1] = scan.nextLine();
		
		System.out.println("---------------");
		check_answers();
		return user;
	}
	public void check_answers() {
		if(user[0].equalsIgnoreCase(num[0]) && user[1].equalsIgnoreCase(num[1])) {
			System.out.println(name + " player, good answers!");
			or_nor_1();
		}
		else System.out.println("sorry," +  name + " player :(");
		
		System.out.println("---------------");
	}
	public void or_nor_1() {
		System.out.println("---------------");
		System.out.println("second round:");
		System.out.println("---------------");
			
		System.out.println(name + " player:");
		System.out.println("who is cristiano ronaldo?: ");
		user1[0] = scan.nextLine();
		System.out.println("who made spaceX and paypal?: ");
		user1[1] = scan.nextLine();
		
		System.out.println("----------------------------");
		check_answers1();
	}
	public void check_answers1() {
		if(user1[0].equalsIgnoreCase(num1[0]) && user1[1].equalsIgnoreCase(num1[1]))
			System.out.println(name + " player, you won!");
		else System.out.println("sorry," +  name + " player :(");
	}	
}

class first extends puzzls {
	first() {
		super();
	}
	public static void main(String[] args) {
		first first = new first();
	}
}