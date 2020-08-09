package Word;

import java.util.Scanner;
class word {
	Scanner scan = new Scanner(System.in);
   
	private char ch = 'd';
	private char missing_character;
	private String word;
	
	public void lets_play()
    {
		take();
	}
	public String take()
	{
		System.out.println("what is the missing character in the word: win_ow");
		System.out.println("1 - d" + "\n" + "2 - r" + "\n"+ "3 - b");
		
		word = scan.nextLine();
		
		check();
		return word;
	}
	
	public void check()
	{
		this.missing_character = take().charAt(0);
		if(missing_character == ch)
			System.out.println("YES!");
		
		else
			System.out.println("NO!");
	}
}