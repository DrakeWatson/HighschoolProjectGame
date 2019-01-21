import javax.swing.JOptionPane;


public class Player_Manager 
{
	int xPosition, yPosition, score;
	String name;
	int playerLives;
	
	public Player_Manager(int xPosition, int yPosition, int score)
	{
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.score = score;
		playerLives = 3;
		int x = 0;
		while (x < 1)
		{
			name = JOptionPane.showInputDialog("What is your name?");
			
			if((name != null) && (name.length() > 0))
			{
				x = 1;
			}
			else
				x = 0;
		}
	}
	public void changePlayerPosition(int newX, int newY)
	{
		xPosition += newX;
		yPosition += newY;
	}
	public int getPlayersX()
	{
		return xPosition;
	}
	public int getPlayersY()
	{
		return yPosition;
	}
	public void changePlayerScore(int newScore)
	{
		score = newScore;
	}
	public void addPlayerScore(int valueToAdd)
	{
		score += valueToAdd;
	}
	public int getPlayerScore()
	{
		return score;
	}
	public String getName()
	{
		return name;
	}
	public void changePlayerName(String newName)
	{
		name = newName;
	}
	public void subtractPlayersLives()
	{
		playerLives -= 1;
	}
	public int getPlayerLives()
	{
		return playerLives;
	}
}
