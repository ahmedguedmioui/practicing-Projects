package LockApp;

public class App {
	Phone phone = new Phone();
	App() {
		if(phone.lock.ReqToOpenApp() == true)
			TurnOnApp();
	}
	void TurnOnApp() {System.out.println("App.TurnOnApp");}
}

class Instagram extends App {
	Instagram() {
		super();
	}
	void TurnOnApp() {
		System.out.println("Instagram");
	}
}

class Youtube extends App {
	Youtube() {
		super();
	}
	void TurnOnApp() {
		System.out.println("Youtube");
	}
}

class Lock {
	int second = 0;
	boolean ReqToOpenApp() {
		if(second == 0)
			return true;
		else
			return false;
	}
	
	void TurnOnApp() {
		if(second > 0) {
			System.out.println("Lock");
			LockPhone(second);
		}
	}
	
	void LockPhone(int second) {
		while(second > 0) {
			System.out.println(second);
			second--;
			
			try {
				Phone.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(second);
	}
}