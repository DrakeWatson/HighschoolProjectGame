/*
 * Creator: Drake Watson
 * Version: 1.0
 * Date Last Edited: 12/8/2014
 */
public class ScienceFairMain 
{

	private static Player_Manager player;
	private static Visual_Manager visMan;
	private static Map_Manager map;
	private static Scoreboard_Manager scoreboard;
	public static void main(String[] args) 
	{
		scoreboard = new Scoreboard_Manager();
		boolean gameRun = true;
		while(gameRun == true)
		{
		scoreboard.displayScoreboard();
		runGame();
			while(Visual_Manager.isGameOver() == false) //Used to pause the previous while loop until the game is over.
			{
				int gameIntRun = 0;
				gameIntRun++;
				System.out.print(gameIntRun);
			}
		}
	}
	public static void runGame()
	{
		player = new Player_Manager(10, 10, 0);
		Tools tool = new Tools();
		map = new Map_Manager();
		map.generateMap(tool.askForLength(), tool.askForWidth(), tool.returnDifficulty(), tool.hasType("Biology"), tool.hasType("Physics"), tool.hasType("Chemistry"), tool.hasType("Mathematics"));
		visMan = new Visual_Manager(true, map.returnMap(), player, map.returnHeight(), map.returnWidth());
		visMan.buildQuestionGUI();
		scoreboard.addPlayer(player);
	}
	public static void displayScoreboard()
	{
		
	}
}
