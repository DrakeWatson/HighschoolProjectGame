import javax.swing.JOptionPane;





public class Tools 
{
	public Tools()
	{
		
	}
	public int returnDifficulty()
	{
		int x = 0;
		while(x == 0)
		{
			String difficultyString = JOptionPane.showInputDialog("What is the difficulty? (Easy, Medium, Hard, All)");
			if((difficultyString != null) && (difficultyString.length() > 0))
			{
				if(difficultyString.equalsIgnoreCase("easy"))
				{
					return 1;
				}
				else if(difficultyString.equalsIgnoreCase("medium"))
				{
					return 2;
				}
				else if(difficultyString.equalsIgnoreCase("hard"))
				{
					return 3;
				}	
				else if(difficultyString.equalsIgnoreCase("all"))
				{
					return 4;
				}
				else
				{
					x = 0;
				}
				
				
			}
			
			
			else
			{
				x = 0;
			}
		}
		return 0;
	}
	public int askForLength()
	{
		int x = 0;
		while(x == 0)
		{
			String difficultyString = JOptionPane.showInputDialog("How long do you want the map? (Short, Medium, Long)");
			if((difficultyString != null) && (difficultyString.length() > 0))
			{
				if(difficultyString.equalsIgnoreCase("short"))
				{
					return 20;
				}
				else if(difficultyString.equalsIgnoreCase("medium"))
				{
					return 40;
				}
				else if(difficultyString.equalsIgnoreCase("long"))
				{
					return 70;
				}
				else
				{
					x = 0;
				}
			}
			
			else
			{
				x = 0;
			}
		}
		return 0;
	}
	public int askForWidth()
	{
		int x = 0;
		while(x == 0)
		{
			String difficultyString = JOptionPane.showInputDialog("How wide do you want the map? (Small, Medium, Huge)");
			if((difficultyString != null) && (difficultyString.length() > 0))
			{
				if(difficultyString.equalsIgnoreCase("Small"))
				{
					return 20;
				}
				else if(difficultyString.equalsIgnoreCase("medium"))
				{
					return 40;
				}
				else if(difficultyString.equalsIgnoreCase("Huge"))
				{
					return 70;
				}
				else
				{
					x = 0;
				}
			}
			
			
			else
			{
				x = 0;
			}
		}
		return 0;
	}
	public boolean hasType(String type)
	{
		int x = 0;
		while(x == 0)
		{
			String difficultyString = JOptionPane.showInputDialog("Do you want " + type + " questions? (Yes/No)");
			if((difficultyString != null) && (difficultyString.length() > 0))
			{
				if(difficultyString.equalsIgnoreCase("yes"))
				{
					return true;
				}
				else if(difficultyString.equalsIgnoreCase("no"))
				{
					return false;
				}
				else
				{
					x = 0;
				}
			}
			
			
			else
			{
				x = 0;
			}
		}
		return false;

	}
	
	
}
