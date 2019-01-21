import java.util.Random;


public class Map_Manager 
{
	private String[][] map;
	private int height;
	private int width;
	public Map_Manager()
	{
		
	}
	public void generateMap(int heightOfMap, int widthOfMap, int difficulty, Boolean hasBiology, Boolean hasPhysics, Boolean hasChemistry, Boolean hasMathematics) 
	{
		height = heightOfMap;
		width = widthOfMap;
		if(hasBiology != true && hasChemistry != true && hasPhysics != true && hasMathematics != true )
		{
			System.out.println("There are no subject types currently allowed, and therfore cannot generate map.");
		}
		else
		{
			int typeCount = 0;
			char[] type = new char[5];
			int chooseType;
			int chooseDif = 0;
			Random rand = new Random();
			map = new String[height][width];
		
			if(hasBiology == true)
			{
				typeCount++;
				type[typeCount] = 'B';
			}
			if(hasPhysics == true)
			{
				typeCount++;
				type[typeCount] = 'P';
			}
			if(hasChemistry == true)
			{
				typeCount++;
				type[typeCount] = 'C';
			}
			if(hasMathematics == true)
			{
				typeCount++;
				type[typeCount] = 'M';
			}
		
			for (int i = 0; i < height; i++)
			{
				System.out.println("");
				for (int j = 0; j < width; j++)
				{
					chooseType = rand.nextInt(typeCount) + 1;
					if(difficulty == 4)
					{
						chooseDif = rand.nextInt(difficulty) + 1;
					}
					else
					{
						chooseDif = difficulty;
					}
					map[i][j] = "" + type[chooseType] + chooseDif;
					System.out.print(map[i][j]);
				}
			}
			
		}
	}
	
	public int returnWidth()
	{
		return width;
	}
	public int returnHeight()
	{
		return height;
	}
	public String[][] returnMap()
	{
		//map[9][9] = "x-y-";
		//map[10][9] = "y-";
		//map[11][9] = "x+y-";
		//map[9][10] = "x-";
		//map[11][10] = "x+";
		//map[9][11] = "x-y+";
		//map[10][11] = "y+";
		//map[11][11] = "x+y+";
		return map;
	}
}
