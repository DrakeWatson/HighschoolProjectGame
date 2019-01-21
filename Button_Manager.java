
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Button_Manager implements ActionListener
{
	private boolean usingDirection;
	private JButton btnALeft;
	private JButton btnBDown;
	private JButton btnCUp;
	private JButton btnDRight;
	private Visual_Manager visualMan;
	public Button_Manager(Boolean isUsingDirection, Visual_Manager visMan) 
	{
		usingDirection = isUsingDirection;
		visualMan = visMan;
	}
	public void addButtons(JButton btnALeft2, JButton btnBDown2, JButton btnCUp2, JButton btnDRight2)
	{
		btnALeft = btnALeft2;
		btnBDown = btnBDown2;
		btnCUp = btnCUp2;
		btnDRight = btnDRight2;
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnALeft)
		{
			if(usingDirection == true)
			{
				System.out.println("Left"); //Used for debugging
				visualMan.movementDone("Left");
				
			}
			else
			{
				System.out.println("Button pressed is A"); //Used for debugging
				visualMan.questionAnswered(1);
			
			}
		//	System.out.println("HelloA"); //Used for debugging
		}
		if(e.getSource() == btnBDown)
		{
			if(usingDirection == true)
			{
				System.out.println("Down"); //Used for debugging
				visualMan.movementDone("Down");
				
			}
			else
			{
				System.out.println("Button pressed is B"); //Used for debugging
				visualMan.questionAnswered(2);
				
			}
		//  System.out.println("HelloB"); //Used for debugging
		}
		if(e.getSource() == btnCUp)
		{
			if(usingDirection == true)
			{
				System.out.println("Up"); //Used for debugging
				visualMan.movementDone("Up");
				
			}
			else
			{
				System.out.println("Button pressed is C"); //Used for debugging
				visualMan.questionAnswered(3);
				
			}
		//	System.out.println("HelloC"); Used for debugging
		}
		if(e.getSource() == btnDRight)
		{
			if(usingDirection == true)
			{
				System.out.println("Right"); //Used for debugging
				visualMan.movementDone("Right");
				
			}
			else
			{
				System.out.println("Button pressed is D"); //Used for debugging
				visualMan.questionAnswered(4);
				
			}
		//	System.out.println("HelloD"); Used for debugging
		} 
	}
	public void changeMode(boolean direction)
	{
		usingDirection = direction;
	}

}
