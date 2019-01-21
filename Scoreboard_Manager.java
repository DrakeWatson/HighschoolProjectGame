import javax.swing.JOptionPane;


public class Scoreboard_Manager {

	private String playerScores;
	public Scoreboard_Manager()
	{
		playerScores = "";
	}
	public void addPlayer(Player_Manager player)
	{
		System.out.println("Player score: " + player.getPlayerScore());
		playerScores += "\n" + player.getName() + ": " + player.getPlayerScore();
	}
	public void displayScoreboard()
	{
		JOptionPane.showMessageDialog(null, "Recent scores:"  + "\n" + playerScores);
	}
}
