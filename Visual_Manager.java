import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.Color;

public class Visual_Manager extends JFrame 
{
	private static boolean isGameOver;
	private boolean usingDirection;
	private String[][] map;
	private Player_Manager player;
	private JButton btnALeft;
	private JButton btnDRight;
	private JButton btnBDown;
	private JButton btnCUp;
	private JTextArea AnswerA;
	private JTextArea AnswerB;
	private JTextArea AnswerC;
	private JTextArea AnswerD;
	private JTextArea QuestionText;
	private JLabel xMinusyMinus;
	private JLabel yMinus;
	private JLabel xPlusyMinus;
	private JLabel xMinus;
	private JLabel xPlus;
	private JLabel xMinusyPlus;
	private JLabel xPlusyPlus;
	private JLabel yPlus;
	private Questions question;
	private Question_Manager questionMang;
	private int height;
	private int width;
	private Button_Manager lForButton;
	
	public Visual_Manager(boolean isUsingDirection, String[][] mapOfQuestions, Player_Manager playersStats, int heightOfMap, int widthOfMap)
	{
		usingDirection = isUsingDirection;
		map = mapOfQuestions;
		player = playersStats;
		height = heightOfMap;
		width = widthOfMap;
		isGameOver = false;
	}
	public void buildQuestionGUI()
	{
		
		lForButton = new Button_Manager(usingDirection, this);
		questionMang = new Question_Manager();
		
		getContentPane().setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		getContentPane().setLayout(null);
		
		JLabel lblHighSchoolQuiz = new JLabel("High School Quiz Game - By Drake Watson - Version 1.0");
		lblHighSchoolQuiz.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 16));
		lblHighSchoolQuiz.setBounds(49, 11, 486, 48);
		getContentPane().add(lblHighSchoolQuiz);
		
		
		btnDRight = new JButton("D - Right");
		btnDRight.setText("Right");
		btnDRight.setBounds(447, 374, 89, 23);
		getContentPane().add(btnDRight);
		btnDRight.addActionListener(lForButton);
		
		btnCUp = new JButton("C - Up");
		btnCUp.setText("Up");
		btnCUp.setBounds(313, 374, 89, 23);
		getContentPane().add(btnCUp);
		btnCUp.addActionListener(lForButton);
		
		btnBDown = new JButton("B - Down");
		btnBDown.setText("Down");
		btnBDown.setBounds(179, 374, 89, 23);
		getContentPane().add(btnBDown);
		btnBDown.addActionListener(lForButton);
		
		btnALeft = new JButton("A - Left");
		btnALeft.setText("Left");
		btnALeft.setBounds(45, 374, 89, 23);
		getContentPane().add(btnALeft);
		btnALeft.addActionListener(lForButton);
		
		lForButton.addButtons(btnALeft, btnBDown, btnCUp, btnDRight);
		
		AnswerD = new JTextArea();
		AnswerD.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		AnswerD.setWrapStyleWord(true);
		AnswerD.setOpaque(false);  
		AnswerD.setLineWrap(true);
		AnswerD.setEditable(false);
		AnswerD.setText("-");
		AnswerD.setBounds(447, 291, 113, 72);
		getContentPane().add(AnswerD);
		
		AnswerA = new JTextArea();
		AnswerA.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		AnswerA.setOpaque(false);  
		AnswerA.setWrapStyleWord(true);
		AnswerA.setLineWrap(true);
		AnswerA.setEditable(false);
		AnswerA.setText("-");
		AnswerA.setBounds(49, 291, 113, 72);
		getContentPane().add(AnswerA);

		AnswerC = new JTextArea();
		AnswerC.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		AnswerC.setWrapStyleWord(true);
		AnswerC.setOpaque(false);  
		AnswerC.setLineWrap(true);
		AnswerC.setEditable(false);
		AnswerC.setText("-");
		AnswerC.setBounds(320, 291, 113, 72);
		getContentPane().add(AnswerC);
		
		AnswerB = new JTextArea();
		AnswerB.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		AnswerB.setWrapStyleWord(true);
		AnswerB.setOpaque(false); 
		AnswerB.setLineWrap(true);
		AnswerB.setEditable(false);
		AnswerB.setText("-");
		AnswerB.setBounds(181, 291, 113, 72);
		getContentPane().add(AnswerB);
		
			
		
		QuestionText = new JTextArea("Where do you want to move next?");
		QuestionText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		QuestionText.setWrapStyleWord(true);
		QuestionText.setLineWrap(true);
		QuestionText.setEditable(false);
		QuestionText.setBounds(40, 86, 500, 55);
		getContentPane().add(QuestionText);
		
		
		xMinusyMinus = new JLabel(map[player.getPlayersX() - 1][player.getPlayersY() - 1]);
		xMinusyMinus.setForeground(Color.RED);
		xMinusyMinus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		xMinusyMinus.setBounds(250, 150, 30, 14);
		getContentPane().add(xMinusyMinus);
		
		yMinus = new JLabel(map[player.getPlayersX()][player.getPlayersY() - 1]);
		yMinus.setForeground(Color.RED);
		yMinus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		yMinus.setBounds(278, 150, 30, 14);
		getContentPane().add(yMinus);
		
		xPlusyMinus = new JLabel(map[player.getPlayersX() + 1][player.getPlayersY() - 1]);
		xPlusyMinus.setForeground(Color.RED);
		xPlusyMinus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		xPlusyMinus.setBounds(306, 150, 30, 14);
		getContentPane().add(xPlusyMinus);
		
		xMinus = new JLabel(map[player.getPlayersX() - 1][player.getPlayersY()]);
		xMinus.setForeground(Color.RED);
		xMinus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		xMinus.setBounds(250, 175, 30, 14);
		getContentPane().add(xMinus);
		
		xPlus = new JLabel(map[player.getPlayersX() + 1][player.getPlayersY()]);
		xPlus.setForeground(Color.RED);
		xPlus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		xPlus.setBounds(306, 175, 30, 14);
		getContentPane().add(xPlus);
		
		JLabel xy = new JLabel("O");
		xy.setForeground(Color.BLUE);
		xy.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		xy.setBounds(278, 175, 18, 14);
		getContentPane().add(xy);
		
		xMinusyPlus = new JLabel(map[player.getPlayersX() - 1][player.getPlayersY() + 1]);
		xMinusyPlus.setForeground(Color.RED);
		xMinusyPlus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		xMinusyPlus.setBounds(250, 200, 30, 14);
		getContentPane().add(xMinusyPlus);
		
		xPlusyPlus = new JLabel(map[player.getPlayersX() + 1][player.getPlayersY() + 1]);
		xPlusyPlus.setForeground(Color.RED);
		xPlusyPlus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		xPlusyPlus.setBounds(306, 200, 30, 14);
		getContentPane().add(xPlusyPlus);
		
		yPlus = new JLabel(map[player.getPlayersX()][player.getPlayersY() + 1]);
		yPlus.setForeground(Color.RED);
		yPlus.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		yPlus.setBounds(278, 200, 30, 14);
		getContentPane().add(yPlus);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		JOptionPane.showMessageDialog(null, "You have 3 lives to get as many points as you can or until the map is cleared. Good Luck!");
	}
	public void questionAnswered(int answer)
	{
		boolean mapCleared = false;
		if(question.getIntAnswer() == answer)
		{
			
			for (int i = 0; i < height; i++)
			{
				for (int j = 0; j < width; j++)
				{
					if(map[i][j] != "-")
					{
						mapCleared = false;
						System.out.println("Map is cleared.");
						i = height + 1;
						j = height + 1;
					}
					else
					{
						mapCleared = true;
						System.out.println("Map is not cleared.");
					}
				}
			}		
			if (mapCleared == true)
			{
				JOptionPane.showMessageDialog(null, "Map is cleared congratulations! Your score is " + player.getPlayerScore() + ". Thanks for playing " + player.getName() + "!");
				isGameOver = true;
				this.dispose();
			}
			else
			{
				System.out.println("intAnswer: " + question.getIntAnswer() + " ButtonInt:" + answer);
				player.addPlayerScore(question.getScoreToAdd());
				JOptionPane.showMessageDialog(null, "Correct! You get " + question.getScoreToAdd() + " points. Your score is now " + player.getPlayerScore());
			}
		}
		else
		{
			System.out.println("intAnswer: " + question.getIntAnswer() + " ButtonInt:" + answer);
			player.subtractPlayersLives();
			if(player.getPlayerLives() <= 0)
			{
				JOptionPane.showMessageDialog(null, "Out of lives! Your score is " + player.getPlayerScore() + ". Thanks for playing " + player.getName() + "!");
				isGameOver = true;
				this.dispose();
			}
			else
			{
				
				JOptionPane.showMessageDialog(null, "Wrong, the correct answer was " + question.getAnswer() + "." + " You have " + player.getPlayerLives() + " lives left.");
			}
		}
		lForButton.changeMode(true);
		btnDRight.setText("Right");
		btnCUp.setText("Up");
		btnBDown.setText("Down");
		btnALeft.setText("Left");
		QuestionText.setText("Where do you want to move?");
		AnswerA.setText("-");
		AnswerB.setText("-");
		AnswerC.setText("-");
		AnswerD.setText("-");
	}
	public void movementDone(String direction)
	{
		boolean canMove = false;
		
		if(direction.equals("Left"))
		{
			if(player.getPlayersX() == 1)
			{
				JOptionPane.showMessageDialog(null, "Cannot move in that direction.");
				canMove = false;
				//System.out.println("Can move is " + canMove); Used for debug
			}
			else
			{
			System.out.println("MovingLeft");
			map[player.getPlayersX()][player.getPlayersY()] = "-";
			player.changePlayerPosition(-1, 0);
			xMinusyMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY() - 1]);
			yMinus.setText(map[player.getPlayersX()][player.getPlayersY() - 1]);
			xPlusyMinus.setText(map[player.getPlayersX() + 1][player.getPlayersY() - 1]);
			xMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY()]);
			xPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY()]);
			xMinusyPlus.setText(map[player.getPlayersX() - 1][player.getPlayersY() + 1]);
			xPlusyPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY() + 1]);
			yPlus.setText(map[player.getPlayersX()][player.getPlayersY() + 1]);
			canMove = true;
			//System.out.println("Can move is " + canMove); Used for debug
			}
		}
		if(direction.equals("Right"))
		{
			if(player.getPlayersX() == width - 2)
			{
				JOptionPane.showMessageDialog(null, "Cannot move in that direction.");
				canMove = false;
				//System.out.println("Can move is " + canMove); Used for debug
			}
			else
			{
			System.out.println("MovingRight");
			map[player.getPlayersX()][player.getPlayersY()] = "-";
			player.changePlayerPosition(1, 0);
			xMinusyMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY() - 1]);
			yMinus.setText(map[player.getPlayersX()][player.getPlayersY() - 1]);
			xPlusyMinus.setText(map[player.getPlayersX() + 1][player.getPlayersY() - 1]);
			xMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY()]);
			xPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY()]);
			xMinusyPlus.setText(map[player.getPlayersX() - 1][player.getPlayersY() + 1]);
			xPlusyPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY() + 1]);
			yPlus.setText(map[player.getPlayersX()][player.getPlayersY() + 1]);
			canMove = true;
			//System.out.println("Can move is " + canMove); Used for debug
			}
		}
		if(direction.equals("Up"))
		{	
			if(player.getPlayersY() == 1)
			{
				JOptionPane.showMessageDialog(null, "Cannot move in that direction.");
				canMove = false;
				//System.out.println("Can move is " + canMove); Used for debug
			}
			else
			{
			System.out.println("MovingUp");
			map[player.getPlayersX()][player.getPlayersY()] = "-";
			player.changePlayerPosition(0, -1);
			xMinusyMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY() - 1]);
			yMinus.setText(map[player.getPlayersX()][player.getPlayersY() - 1]);
			xPlusyMinus.setText(map[player.getPlayersX() + 1][player.getPlayersY() - 1]);
			xMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY()]);
			xPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY()]);
			xMinusyPlus.setText(map[player.getPlayersX() - 1][player.getPlayersY() + 1]);
			xPlusyPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY() + 1]);
			yPlus.setText(map[player.getPlayersX()][player.getPlayersY() + 1]);
			canMove = true;
			//System.out.println("Can move is " + canMove); Used for debug
			}
		}
		if(direction.equals("Down"))
		{
			if(player.getPlayersY() == height - 2)
			{
				JOptionPane.showMessageDialog(null, "Cannot move in that direction.");
				canMove = false;
				//System.out.println("Can move is " + canMove); Used for debug
			}
			else
			{
			System.out.println("MovingDown");
			map[player.getPlayersX()][player.getPlayersY()] = "-";
			player.changePlayerPosition(0, 1);
			xMinusyMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY() - 1]);
			yMinus.setText(map[player.getPlayersX()][player.getPlayersY() - 1]);
			xPlusyMinus.setText(map[player.getPlayersX() + 1][player.getPlayersY() - 1]);
			xMinus.setText(map[player.getPlayersX() - 1][player.getPlayersY()]);
			xPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY()]);
			xMinusyPlus.setText(map[player.getPlayersX() - 1][player.getPlayersY() + 1]);
			xPlusyPlus.setText(map[player.getPlayersX() + 1][player.getPlayersY() + 1]);
			yPlus.setText(map[player.getPlayersX()][player.getPlayersY() + 1]);
			canMove = true;
			//System.out.println("Can move is " + canMove); Used for debug
			}
		}
		
		if(canMove == true)
		{
			//System.out.println("Can move is " + canMove); Used for debug
			if(map[player.getPlayersX()][player.getPlayersY()].equals("-"))
			{
				lForButton.changeMode(true);
			}
			else
			{
				lForButton.changeMode(false);
				btnDRight.setText("D");
				btnCUp.setText("C");
				btnBDown.setText("B");
				btnALeft.setText("A");
				question = questionMang.getRandomQuestion(map[player.getPlayersX()][player.getPlayersY()]);
				AnswerA.setText(question.answerA());
				AnswerB.setText(question.answerB());
				AnswerC.setText(question.answerC());
				AnswerD.setText(question.answerD());
				QuestionText.setText(question.getQuestionString());
			}
	
			
		}
	}
	public static boolean isGameOver()
	{
		return isGameOver;
	}
}
