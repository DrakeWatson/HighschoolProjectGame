import java.util.Random;


public class Physics_Word_Questions
{
	
	public Physics_Word_Questions()
	{
		
	}
	public Questions getEasyQuestion()
	{
		int NUMBEROFEASY = 2;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFEASY) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(1, "What is a vector","A quantity with magnitude and direction","A quantity with only magnitude","A quantity with only direction","A quantity with a distance and time");
			break;
		case 2:
			returnAnswer.setQuestionDetails(1, "What is a planar","A quantity with only magnitude","A quantity with magnitude and direction","A quantity with only direction","A quantity with a distance and time");
			break;
		
		}
		
		return returnAnswer;
	}
	public Questions getMediumQuestion()
	{
		int NUMBEROFMEDIUM = 4;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFMEDIUM) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(2, "If a constant non-zero force acts on an object, what happens during that time","The object accelerates","The object does not move","The object moves at a constant speed","The object moves");
			break;
		case 2:
			returnAnswer.setQuestionDetails(2, "Mass is most commonly found in what unit","KG","M","S","N");
			break;
		case 3:
			returnAnswer.setQuestionDetails(2, "Acceleration is most what unit","M/S^2","M/S","M","S");
			break;
		case 4:
			returnAnswer.setQuestionDetails(2, "What is the unit for velocity","M/S","Kg","S","G/M");
			break;
	
		}
		
		return returnAnswer;
	}
	public Questions getHardQuestion()
	{
		int NUMBEROFHARD = 4;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFHARD) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(3, "What is centripetal force","A force that makes a body follow a curved path","A force that makes a body follow a straight path","A force that pushes against gravity","A force that holds particles together");
			break;
		case 2:
			returnAnswer.setQuestionDetails(3, "What is centrifugal force","A force that draws a rotating body away from the center of rotation","A force that draws a rotating body torwards the center of rotation","A force that makes a body follow a straight path","A force that pushes particles apart");
			break;
		case 3:
			returnAnswer.setQuestionDetails(3, "What is the gravity constant on earth","-9.8 M/S^2","9.6 M/S^2","9.4M/S^2","8.9 M/S^2");
			break;
		case 4:
			returnAnswer.setQuestionDetails(3, "Who is the best physics teacher","Schwenke","McGivern","Schiller","-");
			break;
		
		}
		
		return returnAnswer;
	}
}
