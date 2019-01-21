import java.util.Random;


public class Questions
{ //Contain all chemistry question related code and is the object where those questions will be stored.
	private String questionString, answer;
	private String[] falseAnswers;
	private int difficulty;
	private String answerA, answerB, answerC, answerD;
	public Questions(int difficulty, String questionString, String answer, String falseAnswer1, String falseAnswer2, String falseAnswer3)
	{
	this.questionString = questionString;
	this.answer = answer;
	this.difficulty = difficulty;
	falseAnswers = new String[3];
	falseAnswers[0] = falseAnswer1;
	falseAnswers[1] = falseAnswer2;
	falseAnswers[2] = falseAnswer3;
	}
	public void setQuestionDetails(int difficulty, String questionString, String answer, String falseAnswer1, String falseAnswer2, String falseAnswer3)
	{
		this.questionString = questionString;
		this.answer = answer;
		this.difficulty = difficulty;
		falseAnswers[0] = falseAnswer1;
		falseAnswers[1] = falseAnswer2;
		falseAnswers[2] = falseAnswer3;
	}
	public String printOutQuestion()
	{
		// System.out.println("1");  Used for debugging
		Random rand = new Random();
		String[] answers = new String[4];
		String returnString;
		answers[0] = answer;
		answers[1] = falseAnswers[0];
		answers[2] = falseAnswers[1];
		answers[3] = falseAnswers[2];
		String firstAns = "", secondAns = "", thirdAns = "", fourthAns = "";
		
		while(firstAns == secondAns || firstAns == thirdAns || firstAns == fourthAns || secondAns == thirdAns || secondAns == fourthAns || thirdAns == fourthAns)
		{
			firstAns = answers[rand.nextInt(4)];
		//	System.out.println(firstAns); Used for debugging
			secondAns = answers[rand.nextInt(4)];
		//	System.out.println(secondAns); Used for debugging
			thirdAns = answers[rand.nextInt(4)];
		//	System.out.println(thirdAns); Used for debugging
			fourthAns = answers[rand.nextInt(4)];
		//	System.out.println(fourthAns); Used for debugging
		}
		
		answerA = firstAns;
		answerB = secondAns;
		answerC = thirdAns;
		answerD = fourthAns;
		//System.out.println(questionString + "Answer A: " + firstAns + "Answer B: " + secondAns + "Answer C: " + thirdAns + "Answer D: " + fourthAns); Used for debugging
		returnString = questionString + "?"; 
		System.out.println("Actual Answer is: " + answer);
		return returnString;
	}
	public int getIntAnswer()
	{
		if(answerA == answer)
		{
			System.out.println("Button answer is A");
			return 1;
		}
		if(answerB == answer)
		{
			System.out.println("Button answer is B");
			return 2;
		} 
		if(answerC == answer)
		{
			System.out.println("Button answer is C");
			return 3;
		}
		if(answerD == answer)
		{
			System.out.println("Button answer is D");
			return 4;
		}
		else
			return 0;
	}
	public int getScoreToAdd()
	{
		if(difficulty == 1)
		{
			return 5;
		}
		if(difficulty == 2)
		{
			return 10;
		}
		if(difficulty == 3)
		{
			return 15;
		}
		if(difficulty == 4)
		{
			return 25;
		}
		else
			return 0;
	}
	public String answerA()
	{
		return answerA;
	}
	public String answerB()
	{
		return answerB;
	}
	public String answerC()
	{
		return answerC;
	}
	public String answerD()
	{
		return answerD;
	}
	public String getQuestionString()
	{
		return questionString;
	}
	public String getAnswer()
	{
		return answer;
	}
	public int getDif()
	{
		return difficulty;
	}
	public String getFalseAnswer1()
	{
		return falseAnswers[0];
	}
	public String getFalseAnswer2()
	{
		return falseAnswers[1];
	}
	public String getFalseAnswer3()
	{
		return falseAnswers[2];
	}

}
