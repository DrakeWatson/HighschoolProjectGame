import java.util.Random;


public class Biology_Word_Questions 
{
	
	public Biology_Word_Questions()
	{
		
	}
	public Questions getEasyQuestion()
	{
		int NUMBEROFEASY = 5;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFEASY) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(1, "What do Ribosomes do for a cell","Create Proteins","Makes Lipids","Controls Cell","Stores Water");
			break;
		case 2:
			returnAnswer.setQuestionDetails(1, "What does the cell membrane do","Filters and protects the cell","Creates food","Controls Cell","Creates Proteins");
			break;
		case 3:
			returnAnswer.setQuestionDetails(1, "What do Lysosomes do","Digest food particles","Create proteins","Controls the cell","Is used for movement");
			break;
		case 4:
			returnAnswer.setQuestionDetails(1, "What do Chloroplasts do","Creates food","Controls cell","Filters and protects cell","Creates proteins");
			break;
		case 5:
			returnAnswer.setQuestionDetails(1, "What does the Nucleus do","Controls cell functions","Creates proteins","Protects cell","Is responsible for cell movement");
			break;
		
		}
		
		return returnAnswer;
	}
	public Questions getMediumQuestion()
	{
		int NUMBEROFMEDIUM = 6;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFMEDIUM) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(2, "What is Diffusion","Passive movement of a substance from high to low concentration","Passive diffusion of water from high to low concentration","Using energy to pump molecules accross a memebrane","Release of molecules from a cell");
			break;
		case 2:
			returnAnswer.setQuestionDetails(2, "What is Osmosis","Passive diffusion of water from high to low concentration","Passive movement of a substance from high to low concentration","Using energy to pump molecules accross a memebrane","Release of molecules from a cell");
			break;
		case 3:
			returnAnswer.setQuestionDetails(2, "What is Facilitated Transport","Proteins in the membrane allow the passage of molecules into the cell","Passive movement of a substance from high to low concentration","Using energy to pump molecules accross a memebrane","Passive diffusion of water from high to low concentration");
			break;
		case 4:
			returnAnswer.setQuestionDetails(2, "What is Active Transport","Using energy to pump molecules accross a memebrane","Release of molecules from a cell","Proteins in the membrane allow the passage of molecules into the cell","Passive diffusion of water from high to low concentration");
			break;
		case 5:
			returnAnswer.setQuestionDetails(2, "What is Exocytosis","Release of molecules from the cell","Proteins in the membrane allow the passage of molecules into the cell","Passive diffusion of water from high to low concentration","Passive movement of a substance from high to low concentration");
			break;
		case 6:
			returnAnswer.setQuestionDetails(2, "What is Endocytosis","Process that bring material into the cell by engulfing said material","Passive movement of a substance from high to low concentration","Release of molecules from the cell","Passive diffusion of water from high to low concentration");
			break;
		
		}
		
		return returnAnswer;
	}
	public Questions getHardQuestion()
	{
		int NUMBEROFHARD = 7;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFHARD) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(3, "Due to time constraints, the creator of this program could not complete the biology questions. Instead how many days are in February","28","29","31","30");
			break;
		case 2:
			returnAnswer.setQuestionDetails(3, "Due to time constraints, the creator of this program could not complete the biology questions. Instead how many days are in December","31","29","32","30");
			break;
		case 3:
			returnAnswer.setQuestionDetails(3, "Due to time constraints, the creator of this program could not complete the biology questions. Instead how many days are in March","31","29","32","30");
			break;
		case 4:
			returnAnswer.setQuestionDetails(3, "Due to time constraints, the creator of this program could not complete the biology questions. Instead how many days are in May","31","29","32","30");
			break;
		case 5:
			returnAnswer.setQuestionDetails(3, "Due to time constraints, the creator of this program could not complete the biology questions. Instead how many days are in July","31","29","32","30");
			break;
		case 6:
			returnAnswer.setQuestionDetails(3, "Due to time constraints, the creator of this program could not complete the biology questions. Instead how many days are in January","31","29","32","30");
			break;
		case 7: 
			returnAnswer.setQuestionDetails(3, "Due to time constraints, the creator of this program could not complete the biology questions. Instead how many days are in August","31","29","32","30");
			break;
		}
		
		return returnAnswer;
	}
}
