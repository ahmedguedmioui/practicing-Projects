package GYM;

import java.util.Scanner;

public class Login {
	Scanner scan = new Scanner(System.in);

	int User;
	
	String username_email; // we can sighn up with either username or email
	String password; // we nust use a password
	
	// for returning username to use it in the app,
	//and avoiding caling check_password(data, counter);
	String ReturnedName; 
	
	void check_username_email(Data data) {
		int counter = 0, counter2 = 0;
		System.out.println("Log in");
		System.out.println("---------------------------");
		
		System.out.print("enter username or email: ");
		username_email = scan.next();

		for(int i = 0; i < data.All.length; i++) 
			for(int j = 0; j < data.All[0].length; j++) 
				// to check if the username or email that 
				// is entered exist in some user's array
				if(username_email.equals(data.All[i][j])) {
					counter = i;
					counter2++;
				}
		
		if(counter2 == 0) {
			System.out.println(counter);
			System.out.println("---------------------------");
			System.out.println(username_email+" is not correct! \n"+"Try again");
			check_username_email(data);
		}
	
		ReturnedName = check_password(data, counter);
		User = counter;
	}
	int getUser() {
		return User;
	}
	
	String check_password(Data data, int i) {
		int counter = 0;
		System.out.println("---------------------------");
		
		System.out.print("enter password: ");
		password = scan.next();
		
		for(int j = 0; j < data.All[i].length; j++)
			// to check if the username or email that is entered
			// exist in some user's array
			if(password.equals(data.All[i][j]))
				counter++;
		
		if(counter > 0) {
			System.out.println("welcome, "+data.All[i][0]);
			return data.All[i][0];
		}
			
		else {
			System.out.println("---------------------------");
			System.out.println(password+" is not correct! \n"+"Try again");
			check_password(data, i);
			return "no";
		}
	}
}