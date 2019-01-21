import java.util.Random;


public class Question_Manager 
{
	public Question_Manager()
	{
		
	}
	public Questions getRandomQuestion(String subject)
	{
		boolean answerPicked = false;
		while(answerPicked == false)
		{
			
			if (subject.substring(0, 1).equals("C"))
			{
				
				return getChemistryQuestion(Integer.parseInt(subject.substring(1, 2)));
			}
			else if (subject.substring(0, 1).equals("P"))
			{
				
				return getPhysicsQuestion(Integer.parseInt(subject.substring(1, 2)));
			}
			else if (subject.substring(0, 1).equals("M"))
			{
				
				return getMathematicsQuestion(Integer.parseInt(subject.substring(1, 2)));
			}
			else if (subject.substring(0, 1).equals("B"))
			{
				
				return getBiologyQuestion(Integer.parseInt(subject.substring(1, 2)));
			}
		}
		return null;
	}
	public Questions getChemistryQuestion(int dif)
	{
		int NUMQUESTIONS = 3;
		int questionNumber = 0;
		Random questionChoose = new Random(); //Creating a new random object to get random integers for the choosing of questions.
		Chemistry_Element_Referance chemistryRef = new Chemistry_Element_Referance(); //Creating a new chemistryRef object to get the element information from.
		Elements element = new Elements(0,0.0,"",""); //Creating a default element with no values.
		
		if (dif == 1)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + 1; //Easy
		}
		if (dif == 2)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS + 1; //Medium
		}
		if (dif == 3)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS * 2 + 1; //Hard
		}
		if (dif == 4)
		{
			questionNumber = questionChoose.nextInt(9) + 1; //All
		}
		
		System.out.println("Random Number: " + questionNumber); // Used for debugging
		Questions returnQuestion = new Questions(0,"","","","","");
		
		switch(questionNumber)
		{
		//Easy Questions
		case 1:
			element = chemistryRef.getElementRandomInformationEasy();
			String[] falseAnswers1 = chemistryRef.returnFalseAnswerName(element.getAtomicNumber(), "name");
			System.out.println(falseAnswers1[0] + falseAnswers1[1] + falseAnswers1[2]);
			Questions easyQuestion1 = new Questions(1, "What element's symbol is " + element.getSymbol(),element.getName(),falseAnswers1[0],falseAnswers1[1],falseAnswers1[2]);
			
			System.out.println(easyQuestion1.printOutQuestion());
			returnQuestion = easyQuestion1;
			
			break;
		case 2:
			element = chemistryRef.getElementRandomInformationEasy();
			String[] falseAnswers2 = chemistryRef.returnFalseAnswerName(element.getAtomicNumber(), "symbol");
			System.out.println(falseAnswers2[0] + falseAnswers2[1] + falseAnswers2[2]);
			Questions easyQuestion2 = new Questions(1, "What is the symbol for " + element.getName(),element.getSymbol(),falseAnswers2[0],falseAnswers2[1],falseAnswers2[2]);
			
			System.out.println(easyQuestion2.printOutQuestion());
			returnQuestion = easyQuestion2;
			
			break;
		case 3:
			Chemistry_Word_Questions chemistryWordEasy = new Chemistry_Word_Questions();
			Questions easyQuestion3 = chemistryWordEasy.getEasyQuestion();
			
			System.out.println(easyQuestion3.printOutQuestion());
			returnQuestion = easyQuestion3;
			
			break;
		//Medium Questions
		case 4:
			element = chemistryRef.getElementRandomInformationMedium();
			String[] falseAnswersM1 = chemistryRef.returnFalseAnswerName(element.getAtomicNumber(), "name");
			System.out.println(falseAnswersM1[0] + falseAnswersM1[1] + falseAnswersM1[2]);
			Questions mediumQuestion1 = new Questions(2, "What element has an atomic number of " + element.getAtomicNumber(),element.getName(),falseAnswersM1[0],falseAnswersM1[1],falseAnswersM1[2]);
		
			System.out.println(mediumQuestion1.printOutQuestion());
			returnQuestion = mediumQuestion1;
			
			break;
		case 5:
			Chemistry_Word_Questions chemistryWordMedium = new Chemistry_Word_Questions();
			Questions mediumQuestion2 = chemistryWordMedium.getMediumQuestion();
			
			System.out.println(mediumQuestion2.printOutQuestion());
			returnQuestion = mediumQuestion2;
			
			break;
		case 6:
			element = chemistryRef.getElementRandomInformationMedium();
			String[] falseAnswersM3 = chemistryRef.returnFalseAnswerName(element.getAtomicNumber(), "atomic number");
			System.out.println(falseAnswersM3[0] + falseAnswersM3[1] + falseAnswersM3[2]);
			Questions mediumQuestion3 = new Questions(2, "How many protons does " + element.getName() + " have","" + element.getAtomicNumber(),falseAnswersM3[0],falseAnswersM3[1],falseAnswersM3[2]);
			
			System.out.println(mediumQuestion3.printOutQuestion());
			returnQuestion = mediumQuestion3;
			
			break;
		//Hard Questions
		case 7:
			element = chemistryRef.getElementRandomInformationHard();
			String[] falseAnswersH1 = chemistryRef.returnFalseAnswerName(element.getAtomicNumber(), "neutrons");
			System.out.println(falseAnswersH1[0] + falseAnswersH1[1] + falseAnswersH1[2]);
			Questions hardQuestion1 = new Questions(3, "How many neutrons does " + element.getName() + " have","" + element.getNumberOfNeutrons(),falseAnswersH1[0],falseAnswersH1[1],falseAnswersH1[2]);
			
			System.out.println(hardQuestion1.printOutQuestion());
			returnQuestion = hardQuestion1;
			break;
		case 8:
			Chemistry_Word_Questions chemistryWordHard = new Chemistry_Word_Questions();
			Questions hardQuestion2 = chemistryWordHard.getHardQuestion();
			
			System.out.println(hardQuestion2.printOutQuestion());
			returnQuestion = hardQuestion2;
			
			break;
		case 9:
			element = chemistryRef.getElementRandomInformationHard();
			String[] falseAnswersH3 = chemistryRef.returnFalseAnswerName(element.getAtomicNumber(), "name");
			System.out.println(falseAnswersH3[0] + falseAnswersH3[1] + falseAnswersH3[2]);
			Questions hardQuestion3 = new Questions(3, "What element's symbol is " + element.getSymbol(),element.getName(),falseAnswersH3[0],falseAnswersH3[1],falseAnswersH3[2]);
			
			System.out.println(hardQuestion3.printOutQuestion());
			returnQuestion = hardQuestion3;
			
			break;
		default: System.out.println("Question Is Invalid");
		}
		return returnQuestion;
	}	
	public Questions getMathematicsQuestion(int dif)
	{
		int NUMQUESTIONS = 3;
		int questionNumber = 0;
		Random rand = new Random();
		Random questionChoose = new Random(); //Creating a new random object to get random integers for the choosing of questions.
		
		//This below is used to determine the questions that will be used based upon the difficulties. It uses a algorithm that determines the correct amount of random numbers to cycle
		//through based upon the number of questions in each difficulty.
		if (dif == 1)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + 1; //Easy
		}
		if (dif == 2)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS + 1; //Medium
		}
		if (dif == 3)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS * 2 + 1; //Hard
		}
		if (dif == 4)
		{
			questionNumber = questionChoose.nextInt(9) + 1; //All
		}
		
		System.out.println("Random Number: " + questionNumber); // Used for debugging
		Questions returnQuestion = new Questions(0,"","","","","");
		
		switch(questionNumber)
		{
			//Easy Questions
		case 1:
			Mathematics_Word_Questions mathWordEasy = new Mathematics_Word_Questions();
			Questions easyQuestion1 = mathWordEasy.getEasyQuestion();
			
			System.out.println(easyQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = easyQuestion1;
			
			break;
		case 2:
			
			int x = rand.nextInt(100) + 1;
			int y = rand.nextInt(10) + 1;
			int z = rand.nextInt(20) + 1;
			
			returnQuestion.setQuestionDetails(1, "What is the result of f(" + x + ") = x * " + y + " + " + z,"" + ((x * y) + z),"" + (rand.nextInt(100) + 1),"" + (rand.nextInt(x * y) + 1),"" + ((y + z) * x));
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging

			break;
			
		case 3:
			
			int x2 = rand.nextInt(100) + 1;
			int y2 = rand.nextInt(10) + 1;
			int z2 = rand.nextInt(20) + 1;
			
			returnQuestion.setQuestionDetails(1, "What is the result of f(" + x2 + ") = x - " + y2 + " * " + z2,"" + ((x2 - (y2 * z2))),"" + (rand.nextInt(100) - rand.nextInt(100) + 1),"" + (rand.nextInt(100) - rand.nextInt(x2 * y2) + 1),"" + ((y2 + z2) * x2));
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging

			break;
			//Medium Questions
		case 4:
			Mathematics_Word_Questions mathWordMedium = new Mathematics_Word_Questions();
			Questions mediumQuestion1 = mathWordMedium.getMediumQuestion();
			
			System.out.println(mediumQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = mediumQuestion1;
			
			break;
		case 5:
			
			int x3 = rand.nextInt(9) + 1;
			int y3 = rand.nextInt(20) + 1;
			int z3 = rand.nextInt(300) + 1;
			
			returnQuestion.setQuestionDetails(2,"x * " + y3 + "(" + z3 + " + " + y3 + ") What is the result if x = " + x3,"" + (x3 * y3 * (z3 + y3)),"" + (x3 * z3 * (z3 + y3)),"" + (y3 * y3 * (z3 + y3)),"" + (x3 * y3 * (z3 + z3)));
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging
			
			break;
		case 6:
			
			int circumference = rand.nextInt(99) + 50;
	
			returnQuestion.setQuestionDetails(2,"What is the radius of a circle with a circumferance of " + circumference,"" + (circumference / 2) / 3.14,"" + (circumference / 3.14) / 3.14,"" + (circumference * 3.14) / 2,"" + (circumference / 3.14));
			System.out.println("Answer " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging
			
			break;
			//Hard Questions
		case 7:
			Mathematics_Word_Questions mathWordHard = new Mathematics_Word_Questions();
			Questions hardQuestion1 = mathWordHard.getHardQuestion();
			
			System.out.println("Answer: " + hardQuestion1.getAnswer()); // Used for debugging
			System.out.println(hardQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = hardQuestion1;
			
			break;
		case 8:
			
			int var1 = rand.nextInt(400) + 50;
			int var2 = rand.nextInt(600) + 100;
			int var3 = rand.nextInt(800) + 300;
			
			returnQuestion.setQuestionDetails(3,"What is " + var1 + " * " + var2 + " * " + var3,"" + var1 * var2 * var3,"" + var1 + var2 + var3,"" + var2 * var2 * var3,"" + var3 * var3 * var1);
			System.out.println(returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging
			
			break;
		case 9:
			int h = rand.nextInt(60) + 10;
			double b = rand.nextDouble() * 150;
			returnQuestion.setQuestionDetails(3,"What is the length of the hypotenuse of a ninety degree triangle with sides length " + h + " and " + b,"" + Math.sqrt(Math.pow(h,2) + Math.pow(b,2)),"" + Math.pow(h,2) + Math.pow(b,2),"" + Math.sqrt(Math.pow(h,2)),"" + Math.sqrt(Math.pow(b,2)));
			System.out.println("HardPlaceHolder"); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging
			
			break;
			
			default: System.out.println("Question Is Invalid");
		}
			return returnQuestion;
	}
	public Questions getPhysicsQuestion(int dif)
	{
		int NUMQUESTIONS = 3;
		int questionNumber = 0;
		Random rand = new Random();
		Random questionChoose = new Random(); //Creating a new random object to get random integers for the choosing of questions.
		
		//This below is used to determine the questions that will be used based upon the difficulties. It uses a algorithm that determines the correct amount of random numbers to cycle
		//through based upon the number of questions in each difficulty.
		if (dif == 1)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + 1; //Easy
		}
		if (dif == 2)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS + 1; //Medium
		}
		if (dif == 3)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS * 2 + 1; //Hard
		}
		if (dif == 4)
		{
			questionNumber = questionChoose.nextInt(9) + 1; //All
		}
		
		System.out.println("Random Number: " + questionNumber); // Used for debugging
		Questions returnQuestion = new Questions(0,"","","","","");
		
		switch(questionNumber)
		{
			//Easy Questions
		case 1:
			Physics_Word_Questions physicsWordEasy = new Physics_Word_Questions();
			Questions easyQuestion1 = physicsWordEasy.getEasyQuestion();
			
			System.out.println(easyQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = easyQuestion1;
			
			break;
		case 2:
			int mass = rand.nextInt(50) + 1;
			int accel = rand.nextInt(10) + 1;
			returnQuestion.setQuestionDetails(1,"What is the force of an object with a mass of " + mass + "kg and an acceleration of " + accel + "M/S^2","" +(double) accel * mass,"" +(double) mass,"" +(double) accel,"" + (double) mass / accel);
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging

			break;
			
		case 3:
			int dist = rand.nextInt(30) + 1;
			int time = rand.nextInt(10) + 1;
			returnQuestion.setQuestionDetails(1,"What is the velocity of an object moving a distance of " + dist + "meters in " + time + "seconds","" + (double) dist / time,"" + (double)dist * time,"" + (double)(dist + time),"" + (double)(dist - time));
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging
			
			break;
			//Medium Questions
		case 4:
			Physics_Word_Questions physicsWordMedium = new Physics_Word_Questions();
			Questions mediumQuestion1 = physicsWordMedium.getMediumQuestion();
			
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(mediumQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = mediumQuestion1;
			
			break;
		case 5:
			double initialV = rand.nextDouble() * 100;
			int T = rand.nextInt(30) + 1;
			int A = rand.nextInt(40) + 5;
			returnQuestion.setQuestionDetails(2,"If an object moving at " + initialV + "meters per second has an acceleration of " + A + "M/s^2, how fast is it moving after " + T + " seconds","" + (initialV + (A * T)),"" + (initialV + (initialV * T)),"" + (A + (A * T)),"" + (initialV + (A * A)));
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging
			
			break;
		case 6:
			int initialV2 = rand.nextInt(40) + 1;
			int A2 = rand.nextInt(10) + 1;
			int D = rand.nextInt(100) + 1;
			returnQuestion.setQuestionDetails(2,"If an object with an initial velocity of " + initialV2 + "meters per second is accelerating at " + A2 + "M/s^2, how fast is it moving when it has gone " + D +"meters","" + (Math.pow(initialV2, 2) + 2 * A2 * D),""  + (Math.pow(A2, 2) + 2 * A2 * D),""  + (Math.pow(initialV2, 2) + 2 * D * D),""  + (Math.pow(D, 2) + 2 * initialV2 * D));
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(returnQuestion.printOutQuestion()); // Used for debugging
			
			break;
			//Hard Questions
		case 7:
			Physics_Word_Questions physicsWordHard1 = new Physics_Word_Questions();
			Questions hardQuestion1 = physicsWordHard1.getHardQuestion();
			
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(hardQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = hardQuestion1;
			
			break;
		case 8:
			Physics_Word_Questions physicsWordHard2 = new Physics_Word_Questions();
			Questions hardQuestion2 = physicsWordHard2.getHardQuestion();
			
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(hardQuestion2.printOutQuestion()); // Used for debugging
			returnQuestion = hardQuestion2;
			break;
		case 9:
			Physics_Word_Questions physicsWordHard3 = new Physics_Word_Questions();
			Questions hardQuestion3 = physicsWordHard3.getHardQuestion();
			
			System.out.println("Answer: " + returnQuestion.getAnswer()); // Used for debugging
			System.out.println(hardQuestion3.printOutQuestion()); // Used for debugging
			returnQuestion = hardQuestion3;
			break;
			
			default: System.out.println("Question Is Invalid");
		}
			return returnQuestion;
	}
	public Questions getBiologyQuestion(int dif)
	{
		int NUMQUESTIONS = 1;
		int questionNumber = 0;
		Random rand = new Random();
		Random questionChoose = new Random(); //Creating a new random object to get random integers for the choosing of questions.
		
		//This below is used to determine the questions that will be used based upon the difficulties. It uses an algorithm that determines the correct amount of random numbers to cycle
		//through based upon the number of questions in each difficulty.
		if (dif == 1)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + 1; //Easy
		}
		if (dif == 2)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS + 1; //Medium
		}
		if (dif == 3)
		{
			questionNumber = questionChoose.nextInt(NUMQUESTIONS) + NUMQUESTIONS * 2 + 1; //Hard
		}
		if (dif == 4)
		{
			questionNumber = questionChoose.nextInt(3) + 1; //All
		}
		
		System.out.println("Random Number: " + questionNumber); // Used for debugging
		Questions returnQuestion = new Questions(0,"","","","","");
		
		switch(questionNumber)
		{
			//Easy Questions
		case 1:
			Biology_Word_Questions biologyWordEasy = new Biology_Word_Questions();
			Questions easyQuestion1 = biologyWordEasy.getEasyQuestion();
			
			System.out.println(easyQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = easyQuestion1;
			
			break;
			//Medium Questions
		case 2:
			Biology_Word_Questions biologyWordMedium = new Biology_Word_Questions();
			Questions mediumQuestion1 = biologyWordMedium.getMediumQuestion();
			
			System.out.println("MediumPlaceHolder"); // Used for debugging
			System.out.println(mediumQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = mediumQuestion1;
			
			break;
			// Hard Questions
		case 3:
			
			Biology_Word_Questions biologyWordHard = new Biology_Word_Questions();
			Questions hardQuestion1 = biologyWordHard.getHardQuestion();
			
			System.out.println("HardPlaceHolder"); // Used for debugging
			System.out.println(hardQuestion1.printOutQuestion()); // Used for debugging
			returnQuestion = hardQuestion1;
			
			break;
			
			default: System.out.println("Question Is Invalid");
		}
			return returnQuestion;
	}
}
