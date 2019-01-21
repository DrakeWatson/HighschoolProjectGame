import java.util.Random;


public class Chemistry_Word_Questions
{ //Used to pick the questions that are more specific than the questions pertaining to the elements
	
	public Chemistry_Word_Questions()
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
			returnAnswer.setQuestionDetails(1, "What does the nucleus of an atom contain","Neutrons and Protons", "Neutrons, Protons, and Electrons", "Protons and Electrons", "Protons");
			break;
		case 2:
			returnAnswer.setQuestionDetails(1, "What are the elements in the very first group of the periodic table called (Far left group)","Alkali Metals","Alkaline Earth Metals","Halogens","Metalloids");
			break;
		case 3:
			returnAnswer.setQuestionDetails(1, "In which group or column are the Noble Gases found","18","1","7","They are found in a period, not a group.");
			break;
		case 4:
			returnAnswer.setQuestionDetails(1, "What is Avogadro's number (Used for calculating molarity)","6.02 x 10^23","6.05 x 10^23","8.02 x 10^23","12");
			break;
		case 5:
			returnAnswer.setQuestionDetails(1, "Which group contains Beryllium, Barium, and Calcium","Alkaline Earth Metals","Alkali Metals","Transition Metals","There is no group that contains all three");
			break;
		case 6:
			returnAnswer.setQuestionDetails(1, "What is the most abundant element in the universe","Hydrogen","Helium","Neon","Carbon");
			break;
		case 7: 
			returnAnswer.setQuestionDetails(1, "What are you mostly made of","Carbon","Helium","Nitrogen","Oxygen");
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
			returnAnswer.setQuestionDetails(2, "What kind of molecular bond holds H2O molecules together","Hydrogen Bonds", "Covalent Bonds", "Ionic Bonds", "Oxygen Bonds");
			break;
		case 2:
			returnAnswer.setQuestionDetails(2, "Covalent bonds do what with their electrons","Share electrons", "Give electrons", "Take electrons", "Remove electrons");
			break;
		case 3:
			returnAnswer.setQuestionDetails(2, "Ionic bonds do what with their electrons","Give and take electrons", "Share electrons", "Take electrons", "Give electrons");
			break;
		case 4: 
			returnAnswer.setQuestionDetails(2, "What is the universe in a constant state of","Entropy", "Stability", "Flight", "Normality");
			break;
		case 5:
			returnAnswer.setQuestionDetails(2, "Moving from a solid state to a gaseous state instantly is called what","Sublimation", "Evaporation", "Freezing", "Condensation");
			break;
		case 6:
			returnAnswer.setQuestionDetails(2, "During the phase change of a substance, the tempurature does what","Stays constant throughout the phase change", "Slowly increases or decreases", "Radically increases or decreases", "Changes immediately to the new tempearture");
			break;
		case 7:
			returnAnswer.setQuestionDetails(2, "AgNO3 + NACl -> AgCl + NaNo3 is an example of what kind of reaction","Double Replacement", "Synthesis", "Decomposition", "Substitution");
			break;

		}
		return returnAnswer;
	}
	public Questions getHardQuestion() //All hard questions for chemistry are provided by Mrs. Cosh
	{
		int NUMBEROFHARD = 1;
		Questions returnAnswer = new Questions(0,"","","","","");
		Random rand = new Random();
		int randomNumber = rand.nextInt(NUMBEROFHARD) + 1;
		
		switch(randomNumber)
		{
		case 1:
			returnAnswer.setQuestionDetails(3, "In the reaction of sodium metal with chlorine gas to form sodium chloride, if 14 grams of sodium are used, how many grams of sodium chloride will be formed","35.6 grams", "17.9 grams", "71.2 grams", "49.5 grams");
			break;
		case 2:
		returnAnswer.setQuestionDetails(3, "If 2 moles of hydrogen gas react with 2 moles of oxygen gas to form water, as seen in the equation: 2 H2 + O2 --> 2 H2O, what is the limiting reactant, and how many moles of the excess will be left over","Hydrogen is the limiting reactant and 1 mole of oxygen will be left over", "Hydrogen is the limiting reactant and 2 moles of oxygen will be left over", "Oxygen is the limiting reactant and 1 mole of hydrogen will be left over", "Oxygen is the limiting reactant and 2 moles of hydrogen will be left over");
			break;
		case 3:
			returnAnswer.setQuestionDetails(3, "Water has a specific heat of 4.18 J/gC.  If a 1000. g mass of water is heated from 14.0 C to 45.0 C, how much energy was used","129580 J", "188100 J", ".12958 J", "58520 J");
			break;
		case 4:
			returnAnswer.setQuestionDetails(3, "Samples A, B, C and D all start at 19 degrees C are placed under heat lamps and each absorb 68 kJ of energy.  The final temperature of each sample is:  A: 21C  B: 20C  C:24C  D: 30C.  Which of the samples has the highest specific heat","B", "A", "C", "D");
			break;
		case 5:
			returnAnswer.setQuestionDetails(3, "What happens to the molecules in a solid substance when heat energy is applied to it at the melting point","The PE increases, temperature remains the same", "The PE increases, temperature increases", "The KE increases, temperature remains the same", "The KE increases, temperature increases");
			break;
		}
		return returnAnswer;
	}
}
