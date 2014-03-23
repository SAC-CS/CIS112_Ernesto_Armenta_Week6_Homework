import java.util.Scanner; //program uses class Scanner
public class RockPaperScissor 
{

	public static void main(String[] args) 
	{
		//
		Scanner input = new Scanner (System.in);
		int computerPick;
		int userPick;
		computerPick = 1 + (int) (Math.random()*3);
		System.out.println("Let's play the rock-paper-scissors game!!!");
		System.out.println ("Please enter 1 for rock, 2 for paper, or 3 for scissors");
		userPick = input.nextInt();
		if (computerPick==1)
		{
			System.out.print("The computer picked rock, ");
		}
		if (computerPick==2)
		{
			System.out.print("The computer picked paper, ");
		}
		if (computerPick==3)
		{
			System.out.print("The computer picked scissors, ");
		}
		if (computerPick == userPick) 
		{
			System.out.println ("It's a tie!!!");
		}
		else if (computerPick>userPick) 
		{
			if (computerPick>2)
			{
				if (userPick>1)
				{
					System.out.println("You lose!!!");
				}
				else if (userPick==1)
				{
					System.out.println("You Win!!!");
				}
			}
			else if (computerPick==2)
			{
				System.out.println("You lose!!!");
			}
				
		}
		else if (computerPick<userPick)
		{
			if (userPick>2)
			{
				if  (computerPick>1)
				{
					System.out.println("You Win!!!");
				}
				else if (computerPick==1)
				{
					System.out.println("You lose!!!");
				}
			}
			else if (userPick==2)
			{
				System.out.println("You Win!!!");
			}
		}
	}

}
