package strategydesignpattern;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior
{
	public void Defense()
	{
		System.out.println("Blocks Puck");
	}

	@Override
	public void Offence() 
	{
		System.out.println("Blocks Puck");
		
	}


}
