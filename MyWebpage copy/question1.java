//Danica Keeler, Student number: 220538872

package ITEC1620assignment2;

public class question1 {
	
	int dice1;
	int dice2;
	int Player1 = 0;
	int Player2 = 0;
	int Player3 = 0;
	
	
	public void Player1roll(int dice1, int dice2)
	{
		int roll  = dice1 + dice2;
		this.Player1 += roll;
		System.out.println("Player 1 has rolled " + dice1 + " and a " + dice2 + "\nPlayer 1 now has " + Player1);
		if (dice1 == dice2)
		{
			Player1roll((int)(Math.random()*6), (int)(Math.random()*6));
		}		
	}
	
	public void Player2roll(int dice1, int dice2)
	{
		int roll  = dice1 + dice2;
		this.Player2 += roll;
		System.out.println("Player 2 has rolled " + dice1 + " and a " + dice2 + "\nPlayer 2 now has " + Player2);
		if (dice1 == dice2)
		{
			Player2roll((int)(Math.random()*6), (int)(Math.random()*6));
		}		
	}
	
	public void Player3roll(int dice1, int dice2)
	{
		int roll  = dice1 + dice2;
		this.Player3 += roll;
		System.out.println("Player 3 has rolled " + dice1 + " and a " + dice2 + "\nPlayer 3 now has " + Player3);
		if (dice1 == dice2)
		{
			Player3roll((int)(Math.random()*6), (int)(Math.random()*6));
		}		
	}
	
	public static void main(String[] args) 
	{
		question1 game = new question1();
		
		while (game.Player1 <= 15 || game.Player2 <= 15 || game.Player3 <= 15)
		{
			game.Player1roll((int)(Math.random()*6), (int)(Math.random()*6));
			game.Player2roll((int)(Math.random()*6), (int)(Math.random()*6));
			game.Player3roll((int)(Math.random()*6), (int)(Math.random()*6));
		}	
		
		if (game.Player1 > game.Player2 && game.Player1 > game.Player3)
		{
			if (game.Player2 > game.Player3)
			{
				System.out.println("Player 1 wins first place with a total score of " + game.Player1);
				System.out.println("Player 2 wins second place with a total score of " + game.Player2);
				System.out.println("Player 3 wins third place with a total score of " + game.Player3);
			}
			else
			{
				System.out.println("Player 1 wins first place with a total score of " + game.Player1);
				System.out.println("Player 3 wins second place with a total score of " + game.Player3);
				System.out.println("Player 2 wins third place with a total score of " + game.Player2);
			}
		}	
			
		if (game.Player2 > game.Player1 && game.Player2 > game.Player3)
		{
			if (game.Player1 > game.Player3)
			{
				System.out.println("Player 2 wins first place with a total score of " + game.Player2);
				System.out.println("Player 1 wins second place with a total score of " + game.Player1);
				System.out.println("Player 3 wins third place with a total score of " + game.Player3);
			}
			else
			{
				System.out.println("Player 2 wins first place with a total score of " + game.Player2);
				System.out.println("Player 3 wins second place with a total score of " + game.Player3);
				System.out.println("Player 1 wins third place with a total score of " + game.Player1);
			}
		}
		
		if (game.Player3 > game.Player1 && game.Player3 > game.Player2)
		{
			if (game.Player1 > game.Player2)
			{
				System.out.println("Player 3 wins first place with a total score of " + game.Player3);
				System.out.println("Player 1 wins second place with a total score of " + game.Player1);
				System.out.println("Player 2 wins third place with a total score of " + game.Player2);
			}
			else
			{
				System.out.println("Player 3 wins first place with a total score of " + game.Player3);
				System.out.println("Player 2 wins second place with a total score of " + game.Player2);
				System.out.println("Player 1 wins third place with a total score of " + game.Player1);
			}
		}	
	}	

}


