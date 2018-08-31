import java.util.Scanner;
public class strings
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				//quiteDown();
				//printVerticalLetters();
			}
		public static void quiteDown() 
			{
				System.out.println("Yell something into the computer");
				String yelling = userInput.nextLine();
				System.out.print(yelling.substring(0,1));
				System.out.print(yelling.substring(1, yelling.length()).toLowerCase());
			}
		public static void printVerticalLetters()
			{
				System.out.println("Type in a word");
				String word = userInput.nextLine();
				for (int i = 0; i < word.length(); i++)
					{
						System.out.println(word.substring(i, i+1));
					}
			}
		public static void findVowels()
			{
				System.out.println("Type a word to find the number of vowels");
				
			}
	}
