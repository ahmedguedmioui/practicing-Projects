package GYM;

class Day {
	String BuddyPart1;
	String BuddyPart2;
	String day;
	
	void WordOut1(Login log, String BuddyPart1) {
		this.BuddyPart1 = BuddyPart1;
		System.out.println("----------------------------------");
		System.out.println(day);
		System.out.println("-----------------------");
		System.out.println("hey "+log.ReturnedName+", first you will "
			             + "work your "+BuddyPart1+" out");
	}
	
	void WordOut2(String BuddyPart2) {
		this.BuddyPart2 = BuddyPart2;
		System.out.println("-----------------------");
		System.out.println("now you will work your "+BuddyPart2+" out");
	}
}

class Day1 extends Day {
	String BuddyPart1 = "Chest";
	String BuddyPart2 = "Back arm";
	String day = "day 1";
	void f() {}
}

class Day2 extends Day {
	String BuddyPart1 = "Back";
	String BuddyPart2 = "Front arm";
}

class Day3 extends Day {
	String BuddyPart1 = "Shoulder";
	String BuddyPart2 = "Abdominal";
}

class Day4 extends Day {
	String BuddyPart1 = "Lower leg";
	String BuddyPart2 = "Upper leg";
}