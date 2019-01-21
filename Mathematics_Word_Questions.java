import java.util.Random;


public class Mathematics_Word_Questions 
{

	public Mathematics_Word_Questions()
	{
		
	}
	public Questions getEasyQuestion()
	{
		int NUMBEROFEASY = 7;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFEASY) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(1, "What is the equation for slope-intercept form","y = mx + b", "y = bx + m", "y - b = bx + m", "y = x - m");
			break;
		case 2:
			returnAnswer.setQuestionDetails(1, "What is the reciprocal of 2/5","5/2","25",".4","2 * 5");
			break;
		case 3:
			returnAnswer.setQuestionDetails(1, "How many quadrants are there","4","2","8","16");
			break;
		case 4:
			returnAnswer.setQuestionDetails(1, "0 increased by 12 is divided by the product of 2 and 3. What is the result","2","3","4","6");
			break;
		case 5:
			returnAnswer.setQuestionDetails(1, "What is a real number","Any number that can be found on a number line","Position numbers","Physical numbers","Numbers divisble by 0");
			break;
		case 6:
			returnAnswer.setQuestionDetails(1, "What is the opposite of taking the square root of a number","Putting it to the power of 2","Multiplying it by 2","Adding by 2","Dividing it by itself");
			break;
		case 7: 
			returnAnswer.setQuestionDetails(1, "What is a prime number","A number that can only be divided by 1 and itself","A number that is negative","A number that when multiplied by itself becomes the square root of it's reciprocal","Any number multiplied by 0");
			break;
		}
		
		return returnAnswer;
	}
	public Questions getMediumQuestion()
	{
		int NUMBEROFMEDIUM = 7;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFMEDIUM) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(2, "What is the value of |-5| + |-38| - 32","11", "43", "34", "13");
			break;
		case 2:
			returnAnswer.setQuestionDetails(2, "What is x^5 * x^10","x^15","x^50","Cannot be simplified","x^20");
			break;
		case 3:
			returnAnswer.setQuestionDetails(2, "What kind of sequences are there","Geometric and Arithmetic","Geometric and Linear","Linear and Dynamic","Static and Arithmetic");
			break;
		case 4:
			returnAnswer.setQuestionDetails(2, "What is sinx","1/(cscx)","1/(secx)","1/(cotx)","(cosx)/(sinx)");
			break;
		case 5:
			returnAnswer.setQuestionDetails(2, "What is cosx","1/(secx)","1/(cscx)","(sinx)/(cosx)","1/(cotx)");
			break;
		case 6:
			returnAnswer.setQuestionDetails(2, "How many radians are in a circle with a radius of one","2","3.14","1","4.5");
			break;
		case 7: 
			returnAnswer.setQuestionDetails(2, "On the unit circle what is the point at 2 radians","1,0","-1,0","0,1","0,-1");
			break;
		}
		
		return returnAnswer;
	}
	public Questions getHardQuestion()
	{
		int NUMBEROFHARD = 5;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFHARD) + 1;
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(3, "Let the function h be defined by h(x) = 2 cos(10x) + 12. The maximum value of h is attained at which of the following values of x?","PIE / 5","PIE / 10","PIE / 15","PIE / 20");
			break;
		case 2:
			returnAnswer.setQuestionDetails(3, "f(x) = x(x + 1), g(x) = x^2 - 1. Given these two equations, if f(a) = g(a) what is a","-1","2","0","1");
			break;
		case 3:
			returnAnswer.setQuestionDetails(3, "What is the inverse of f(x) = x + 1","f-1(x) = x - 1","f-1(x) = -x - 1","f-1(x) = x^2 - 1","f-1(x) = x - x");
			break;
		case 4:
			returnAnswer.setQuestionDetails(3, "In which direction does the graph of the parabola x = -y^2 open","Left","Up","Right","Down");
			break;
		case 5:
			returnAnswer.setQuestionDetails(3, "What is the 7th term in this sequence {1, 13, 25...}","73","61","72","85");
			break;
		}
		
		return returnAnswer;
	}
}
