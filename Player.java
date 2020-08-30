package strategydesignpattern;

public abstract class Player
{
	//protected means only parent and children in uml it is #
	public String Name;
	private boolean Offence= true;
	DefenceBehavior DefenceBehavior; //veryshort class
	OffenceBehavior OffenceBehavior;
	//variables
	public String name;
	boolean turnover;
	
	
	
	//public player(Variables)
	//this.variable = variable
	
	//puts in the players name
	public Player(String Name) 
	{
		this.Name = Name;
	}
	
	
	//super.display shows parent display
	//display shows child display
	
	
	//makes players play
	public play()
	{
		if(Offence)
		{
			return this.OffenceBehavior;
		}
		else if
		{
			return this.DefenceBehavior;
		}
	}
	//switches behavior if their is a turnover(the boolean switches)
	public void turnover()
	{
		this.Offence = !this.Offence;
	}

	protected abstract void DefenceBehavior();
	{
		
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
