package GYM;

import java.util.Scanner;
public class GYM {
	SighnUp sighn = new SighnUp();
	Login log = sighn.log;
	Data data = sighn.data;
	
	void letsWorkOut(Day day, String BuddyPart1, String BuddyPart2) {
		day.WordOut1(log, BuddyPart1);
		day.WordOut2(BuddyPart2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GYM gym = new GYM();
		
		Day1 day1 = new Day1();
		Day2 day2 = new Day2();
		Day3 day3 = new Day3();
		Day4 day4 = new Day4();
		
		gym.letsWorkOut(day1, day1.BuddyPart1, day1.BuddyPart2);

    }
}