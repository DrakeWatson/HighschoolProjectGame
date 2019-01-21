import java.util.Random;


public class Chemistry_Element_Referance //Holds the raw data for each element object and allows for the easy selection and organization of the elements.
{
	public Chemistry_Element_Referance()
	{
		
	}
	public Elements getElementInformation(int atomicNumber)
	{
		Elements returnElement = new Elements(0,0,"",""); 
		switch (atomicNumber) //Using this switch method, the code is able to easily choose which element to assign to the object simply by looking at the atomic number of the element.
		{
		case 1: Elements hydrogen = new Elements(1,1.0,"Hydrogen","H");
				returnElement = hydrogen;
				break;
		case 2: Elements helium = new Elements(2,4.0,"Helium","He");
				returnElement = helium;
				break;
		case 3: Elements lithium = new Elements(3,6.9,"Lithium","Li");
				returnElement = lithium;
				break;
		case 4: Elements beryllium = new Elements(4,9.0,"Beryllium","Be");
				returnElement = beryllium;
				break;
		case 5: Elements boron = new Elements(5,10.8,"Boron","B");
				returnElement = boron;
				break;
		case 6: Elements carbon = new Elements(6,12.0,"Carbon","C");
				returnElement = carbon;
				break;
		case 7: Elements nitrogen = new Elements(7,14.0,"Nitrogen","N");
				returnElement = nitrogen;
				break;
		case 8: Elements oxygen = new Elements(8,15.9,"Oxygen","O");
				returnElement = oxygen;
				break;
		case 9: Elements flourine = new Elements(9,18.9,"Flourine","F");
				returnElement = flourine;
				break;
		case 10: Elements neon = new Elements(10,20.1,"Neon","Ne");
				returnElement = neon;
				break;
		case 11: Elements sodium = new Elements(11,22.9,"Sodium","Na");
				returnElement = sodium;
				break;
		case 12: Elements magnesium = new Elements(12,24.3,"Magnesium","Mg");
				returnElement = magnesium;
				break;
		case 13: Elements aluminum = new Elements(13,26.9,"Aluminum","Al");
				returnElement = aluminum;
				break;
		case 14: Elements silicon = new Elements(14,28.0,"Silicon","Si");
				returnElement = silicon;
				break;
		case 15: Elements phosphorus = new Elements(15,30.9,"Phosphorus","P");
				returnElement = phosphorus;
				break;
		case 16: Elements sulfur = new Elements(16,32.0,"Sulfur","S");
				returnElement = sulfur;
				break;
		case 17: Elements chlorine = new Elements(17,35.4,"Chlorine","Cl");
				returnElement = chlorine;
				break;
		case 18: Elements argon = new Elements(18,39.9,"Argon","Ar");
				returnElement = argon;
				break;
		case 19: Elements potassium = new Elements(19,39.0,"Potassium","K");
				returnElement = potassium;
				break;
		case 20: Elements calcium = new Elements(20,40.0,"Calcium","Ca");
				returnElement = calcium;
				break;
		case 21: Elements scandium = new Elements(21,44.9,"Scandium","Sc");
				returnElement = scandium;
				break;
		case 22: Elements titanium = new Elements(22,47.8,"Titanium","Ti");
				returnElement = titanium;
				break;
		case 23: Elements vanadium = new Elements(23,50.9,"Vanadium","V");
				returnElement = vanadium;
				break;
		case 24: Elements chromium = new Elements(24,51.9,"Chromium","Cr");
				returnElement = chromium;
				break;
		case 25: Elements manganese = new Elements(25,54.9,"Manganese","Mn");
				returnElement = manganese;
				break;
		case 26: Elements iron = new Elements(26,55.8,"Iron","Fe");
				returnElement = iron;
				break;
		case 27: Elements cobalt = new Elements(27,58.9,"Cobalt","Co");
				returnElement = cobalt;
				break;
		case 28: Elements nickel = new Elements(28,58.6,"Nickel","Ni");
				returnElement = nickel;
				break;
		case 29: Elements copper = new Elements(29,63.5,"Copper","Cu");
				returnElement = copper;
				break;
		case 30: Elements zinc = new Elements(30,65.3,"Zinc","Zn");
				returnElement = zinc;
				break;
		case 31: Elements gallium = new Elements(31,69.7,"Gallium","Ga");
				returnElement = gallium;
				break;
		case 32: Elements germanium = new Elements(32,72.6,"Germanium","Ge");
				returnElement = germanium;
				break;
		case 33: Elements arsenic = new Elements(33,74.9,"Arsenic","As");
				returnElement = arsenic;
				break;
		case 34: Elements selenium = new Elements(34,78.9,"selenium","Se");
				returnElement = selenium;
				break;
		case 35: Elements bromine = new Elements(35,79.9,"Bromine","Br");
				returnElement = bromine;
				break;
		case 36: Elements krypton = new Elements(36,83.8,"Krypton","Kr");
				returnElement = krypton;
				break;
		case 37: Elements rubidium = new Elements(37,85.4,"Rubidium","Rb");
				returnElement = rubidium;
				break;
		case 38: Elements strontium = new Elements(38,86.7,"Strontium","Sr");
				returnElement = strontium;
				break;
		case 39: Elements yttrium = new Elements(39,88.9,"Yttrium","Y");
				returnElement = yttrium;
				break;
		case 40: Elements zirconium = new Elements(40,91.2,"Zirconium","Zr");
				returnElement = zirconium;
				break;
		case 41: Elements niobium = new Elements(41,92.9,"Niobium","Nb");
				returnElement = niobium;
				break;
		case 42: Elements molybdenum = new Elements(42,95.94,"Molybdenum","Mo");
				returnElement = molybdenum;
				break;
		case 43: Elements technetium = new Elements(43,98,"Technetium","Tc");
				returnElement = technetium;
				break;
		case 44: Elements ruthenium = new Elements(44,101.07,"Ruthenium","Ru");
				returnElement = ruthenium;
				break;
		case 45: Elements rhodium = new Elements(45,109.91,"Rhodium","Rh");
				returnElement = rhodium;
				break;
		case 46: Elements palladium = new Elements(46,106.42,"Palladium","Pd");
				returnElement = palladium;
				break;
		case 47: Elements silver = new Elements(47,107.87,"Silver","Ag");
				returnElement = silver;
				break;
		case 48: Elements cadmium = new Elements(48,112.41,"Cadmium","Cd");
				returnElement = cadmium;
				break;
		case 49: Elements indium = new Elements(49,114.82,"Indium","In");
				returnElement = indium;
				break;
		case 50: Elements tin = new Elements(50,118.71,"Tin","Sn");
				returnElement = tin;
				break;
		case 51: Elements antimony = new Elements(51,121.76,"Antimony","Sb");
				returnElement = antimony;
				break;
		case 52: Elements tellurium = new Elements(52,127.6,"Tellurium","Te");
				returnElement = tellurium;
				break;
		case 53: Elements iodine = new Elements(53,126.90,"Iodine","I");
				returnElement = iodine;
				break;
		case 54: Elements xenon = new Elements(54,131.29,"Xenon","Xe");
				returnElement = xenon;
				break;
		case 55: Elements caesium = new Elements(55,132.91,"Caesium","Cs");
				returnElement = caesium;
				break;
		case 56: Elements barium = new Elements(56,137.33,"Barium","Ba");
				returnElement = barium;
				break;
		case 57: Elements lanthanum = new Elements(57,138.91,"Lanthanum","La");
				returnElement = lanthanum;
				break;
		case 58: Elements cerium = new Elements(58,140.12,"Cerium","Ce");
				returnElement = cerium;
				break;
		case 59: Elements praseodymium = new Elements(59,140.91,"Praseodymium","Pr");
				returnElement = praseodymium;
				break;
		case 60: Elements neodymium = new Elements(60,144.24,"Neodymium","Nd");
				returnElement = neodymium;
				break;
		case 61: Elements promethium = new Elements(61,145,"Promethium","Pm");
				returnElement = promethium;
				break;
		case 62: Elements samarium = new Elements(62,150.36,"Samarium","Sm");
				returnElement = samarium;
				break;
		case 63: Elements europium = new Elements(63,151.96,"Europium","Eu");
				returnElement = europium;
				break;
		case 64: Elements gadolinium = new Elements(64,157.25,"Gadolinium","Gd");
				returnElement = gadolinium;
				break;
		case 65: Elements terbium = new Elements(65,158.93,"Terbium","Tb");
				returnElement = terbium;
				break;
		case 66: Elements dysprosium = new Elements(66,162.50,"Dysprosium","Dy");
				returnElement = dysprosium;
				break;
		case 67: Elements holmium = new Elements(67,164.93,"Holmium","Ho");
				returnElement = holmium;
				break;
		case 68: Elements erbium = new Elements(68,167.26,"Erbium","Er");
				returnElement = erbium;
				break;
		case 69: Elements thulium = new Elements(69,168.93,"Thulium","Tm");
				returnElement = thulium;
				break;
		case 70: Elements ytterbium = new Elements(70,173.04,"Ytterbium","Yb");
				returnElement = ytterbium;
				break;
		case 71: Elements lutetium = new Elements(71,174.97,"Lutetium","Lu");
				returnElement = lutetium;
				break;
		case 72: Elements hafnium = new Elements(72,178.49,"Hafnium","Hf");
				returnElement = hafnium;
				break;
		case 73: Elements tantalum = new Elements(73,180.95,"Tantalum","Ta");
				returnElement = tantalum;
				break;
		case 74: Elements tungsten = new Elements(74,183.84,"Tungsten","W");
				returnElement = tungsten;
				break;
		case 75: Elements rhenium = new Elements(75,186.21,"Rhenium","Re");
				returnElement = rhenium;
				break;
		case 76: Elements osmium = new Elements(76,190.23,"Osmium","Os");
				returnElement = osmium;
				break;
		case 77: Elements iridium = new Elements(77,192.22,"Iridium","Ir");
				returnElement = iridium;
				break;
		case 78: Elements platinum = new Elements(78,195.08,"Platinum","Pt");
				returnElement = platinum;
				break;
		case 79: Elements gold = new Elements(79,196.97,"Gold","Au");
				returnElement = gold;
				break;
		case 80: Elements mercury = new Elements(80,200.59,"Mercury","Hg");
				returnElement = mercury;
				break;
		case 81: Elements thallium = new Elements(81,204.38,"Thallium","Ti");
				returnElement = thallium;
				break;
		case 82: Elements lead = new Elements(82,207.2,"Lead","Pb");
				returnElement = lead;
				break;
		case 83: Elements bismuth = new Elements(83,208.98,"Bismuth","Bi");
				returnElement = bismuth;
				break;
		case 84: Elements polonium = new Elements(84,209,"Polonium","Po");
				returnElement = polonium;
				break;
		case 85: Elements astatine = new Elements(85,210,"Astatine","At");
				returnElement = astatine;
				break;
		case 86: Elements radon = new Elements(86,222,"Radon","Rn");
				returnElement = radon;
				break;
		case 87: Elements francium = new Elements(87,223,"Francium","Fr");
				returnElement = francium;
				break;
		case 88: Elements radium = new Elements(88,226,"Radium","Ra");
				returnElement = radium;
				break;
		case 89: Elements actinium = new Elements(89,227,"Actinium","Ac");
				returnElement = actinium;
				break;
		case 90: Elements thorium = new Elements(90,232.04,"Thorium","Th");
				returnElement = thorium;
				break;
		case 91: Elements protactinium = new Elements(91,231.04,"Protactinium","Pa");
				returnElement = protactinium;
				break;
		case 92: Elements uranium = new Elements(92,238.03,"Uranium","U");
				returnElement = uranium;
				break;
		case 93: Elements neptunium = new Elements(93,237,"Neptunium","Np");
				returnElement = neptunium;
				break;
		case 94: Elements plutonium = new Elements(94,244,"Plutonium","Pu");
				returnElement = plutonium;
				break;
		case 95: Elements americium = new Elements(95,243,"Americium","Am");
				returnElement = americium;
				break;
		case 96: Elements curium = new Elements(96,247,"Curium","Cm");
				returnElement = curium;
				break;
		case 97: Elements berkelium = new Elements(97,247,"Berkelium","Bk");
				returnElement = berkelium;
				break;
		case 98: Elements californium = new Elements(98,251,"Californium","Cf");
				returnElement = californium;
				break;
		case 99: Elements einsteinium = new Elements(99,252,"Einsteinium","Es");
				returnElement = einsteinium;
				break;
		case 100: Elements fermium = new Elements(100,257,"Fermium","Fm");
				returnElement = fermium;
				break;
		case 101: Elements mendelevium = new Elements(101,258,"Mendelevium","Md");
				returnElement = mendelevium;
				break;
		case 102: Elements nobelium = new Elements(102,259,"Nobelium","No");
				returnElement = nobelium;
				break;
		case 103: Elements lawrencium = new Elements(103,262,"Lawrencium","Lr");
				returnElement = lawrencium;
				break;
		case 104: Elements rutherfordium = new Elements(104,261,"Rutherfordium","Rf");
				returnElement = rutherfordium;
				break;
		case 105: Elements dubnium = new Elements(105,262,"Dubnium","Db");
				returnElement = dubnium;
				break;
		case 106: Elements seaborgium = new Elements(106,266,"Seaborgium","Sg");
				returnElement = seaborgium;
				break;
		case 107: Elements bohrium = new Elements(107,264,"Bohrium","Bh");
				returnElement = bohrium;
				break;
		case 108: Elements hassium = new Elements(108,269,"Hassium","Hs");
				returnElement = hassium;
				break;
		case 109: Elements meitnerium = new Elements(109,268,"meitnerium","Mt");
				returnElement = meitnerium;
				break;
		case 110: Elements ununnilium = new Elements(110,271,"Ununnilium","Uun");
				returnElement = ununnilium;
				break;
		case 111: Elements unununium = new Elements(111,272,"Unununium","Uuu");
				returnElement = unununium;
				break;
		case 112: Elements ununbium = new Elements(112,277,"Ununbium","Uub");
				returnElement = ununbium;
				break;
		case 113: Elements unutrium = new Elements(113,284,"Unutrium","Uut");
				returnElement = unutrium;
				break;
		case 114: Elements ununquadium = new Elements(114,289,"Ununquadium","Uuq");
				returnElement = ununquadium;
				break;
		
		
		default: return null;
		}
		//System.out.println("Return Element Main Function"); Used for debugging
		return returnElement;
	}
	public Elements getElementRandomInformationEasy()
	{
		int[] numbersThatAreEasy = {1,2,3,4,5,6,7,8,9,10,
									11,12,13,14,15,16,17,
									18,19,20,22,26,28,29,
									30,31,33,34,35,36,37,
									38,47,50,52,53,54,55,
									56,78,79,80,82,83,85,
									86,87,88};
		Random rand = new Random();
		int randomEasyNumber = 0;
		boolean runLoop = true;
		
		
		while (runLoop == true)
		{
			randomEasyNumber = rand.nextInt(87);
			//System.out.println("Random number: " + randomEasyNumber); Used for debugging
			for(int i = 0; i < 48; i++)
			{
				//System.out.println("Numbers that are easy: " + numbersThatAreEasy[i]); Used for debugging
				if(randomEasyNumber == numbersThatAreEasy[i])
				{
					runLoop = false;
					i = 49;
				}
				else
					runLoop = true;
			}
		}
		//System.out.println("Return Element Easy Function"); Used for debugging
		return getElementInformation(randomEasyNumber);
		
	}
	public Elements getElementRandomInformationMedium()
	{
		int[] numbersThatAreMedium = {1,2,3,4,5,6,7,8,9,10,
									11,12,13,14,15,16,17,
									18,19,20,21,22,23,24,
									25,26,27,28,29,30,31,
									32,33,34,35,36,37,38,
									39,40,41,42,43,44,45,
									46,47,48,49,50,51,52,
									53,54,55,56,78,79,80,
									82,83,85,86,87,88};
		Random rand = new Random();
		int randomMediumNumber = 0;
		boolean runLoop = true;
		
		
		while (runLoop == true)
		{
			randomMediumNumber = rand.nextInt(87);
			//System.out.println("Random number: " + randomEasyNumber); Used for debugging
			for(int i = 0; i < 65; i++)
			{
				//System.out.println("Numbers that are easy: " + numbersThatAreEasy[i]); Used for debugging
				if(randomMediumNumber == numbersThatAreMedium[i])
				{
					runLoop = false;
					i = 66;
				}
				else
					runLoop = true;
			}
		}
		//System.out.println("Return Element Easy Function"); Used for debugging
		return getElementInformation(randomMediumNumber);
		
	}
	public Elements getElementRandomInformationHard()
	{
		int[] numbersThatAreHard = {1,2,3,4,5,6,7,8,9,10,
									11,12,13,14,15,16,17,
									18,19,20,21,22,23,24,
									25,26,27,28,29,30,31,
									32,33,34,35,36,37,38,
									39,40,41,42,43,44,45,
									46,47,48,49,50,51,52,
									53,54,55,56,57,58,59,
									60,61,62,63,64,65,66,
									67,68,69,70,71,72,73,
									74,75,76,77,78,79,80,
									81,82,83,84,85,86,87,
									88,89,90,91,92,93,94,
									95,96,97,98,99,100,101,
									102,103,104,105,106,107,
									108,109,110,111,112,113,114};
		Random rand = new Random();
		int randomHardNumber = 0;
		boolean runLoop = true;
		
		
		while (runLoop == true)
		{
			randomHardNumber = rand.nextInt(113);
			//System.out.println("Random number: " + randomEasyNumber); Used for debugging
			for(int i = 0; i < 114; i++)
			{
				//System.out.println("Numbers that are easy: " + numbersThatAreEasy[i]); Used for debugging
				if(randomHardNumber == numbersThatAreHard[i])
				{
					runLoop = false;
					i = 115;
				}
				else
					runLoop = true;
			}
		}
		//System.out.println("Return Element Easy Function"); Used for debugging
		return getElementInformation(randomHardNumber);
		
	}
	public String[] returnFalseAnswerName(int elementToBeExcluded, String informationType)
	{
		
		Random rand = new Random();
		String[] returnNamesString = new String[3];
		returnNamesString[0] = "";
		returnNamesString[1] = "";
		returnNamesString[2] = "";
		while (returnNamesString[0] == returnNamesString[1] || returnNamesString[1] == returnNamesString[2] || returnNamesString[0] == returnNamesString[2])
		{
			for(int i = 0; i < 3; i++)
			{
				int randomNumber = rand.nextInt(114) + 1;
		
				while (randomNumber == elementToBeExcluded)
				{
					randomNumber = rand.nextInt(114) + 1;
				}
				Elements element = getElementInformation(randomNumber);
			//	System.out.println(randomNumber); Used for debugging
				if (informationType.equals("name"))
				{
					returnNamesString[i] = element.getName();
				}
				else if (informationType.equals("atomic number"))
				{
					returnNamesString[i] = "" + element.getAtomicNumber();	
				}
				else if (informationType.equals("atomic mass"))
				{
					returnNamesString[i] = "" + element.getAtomicMass();	
				}
				else if (informationType.equals("symbol"))
				{
					returnNamesString[i] = element.getSymbol();	
				}
				else if (informationType.equals("neutrons"))
				{
					returnNamesString[i] = "" + element.getNumberOfNeutrons();	
				}
			//	System.out.println(element.getName()); //Used for debugging
			}
			
		//	System.out.println("Loop"); Used for debugging
		}	
	//	System.out.println(returnNamesString[0] + returnNamesString[1] + returnNamesString[2]); Used for debugging
		return returnNamesString;
	}
}
