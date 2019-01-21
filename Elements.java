
public class Elements //Creates the object that holds each elements information for reference.
{
	String elementName, symbol;
	int atomicNumber;
	double atomicMass;
	public Elements(int atomicNumber, double atomicMass, String name, String symbol)
	{
		this.atomicMass = atomicMass;
		this.atomicNumber = atomicNumber;
		this.elementName = name;
		this.symbol = symbol;
	}
	public int getAtomicNumber() //Gets the value of the atomic number.
	{
		return atomicNumber;
	}
	public double getAtomicMass()//Gets the value of the atomic mass.
	{
		return atomicMass;
	}
	public String getName()//Gets the name of the element.
	{
		return elementName;
	}
	public String getSymbol()//Gets the symbol of the element.
	{
		return symbol;
	}
	public int getNumberOfNeutrons()
	{
		return (int) (getAtomicMass() - getAtomicNumber());
	}
}
