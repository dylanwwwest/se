package strategydesignpattern;

public class Goalie extends Player {
	public Goalie(String Name) 
	{
		super(Name);
	}
	

	
	public void setDefenceBehavior() 
	{
		//sets defensive behavior to blockgoal
		DefenceBehavior = new BlockGoalBehavior();
	}
	public void setOffensiveBehavior()
	{
		//sets offensive behavior to blockgoal
		OffenceBehavior = new BlockGoalBehavior();
	}


	@Override
	//displays
	public void display() 
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	protected void DefenceBehavior() {
		// TODO Auto-generated method stub
		
	}
}
