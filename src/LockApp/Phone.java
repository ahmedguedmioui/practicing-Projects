package LockApp;

public class Phone extends Thread{
	static Lock lock = new Lock();
	public static void main(String[] args) {
		lock.second = 10;
		lock.TurnOnApp();
		
	}
}