package strategydesignpattern;
import java.util.Random;
public class Forward extends Player {
	Random num = new Random();
	int smallRan = num.nextInt(2);
	public Forward(String Name) 
	{
		super(Name);
	}
	//sets offensive behavior so that half the time it will be pass and half will be shoot. This is from a random num generator from 1-2
	public void setOffensiveBehavior()
	{
		if(smallRan == 1)
		{
			OffenceBehavior = new Passbehavior();
		}
		
		else if(smallRan == 2)
		{
			OffenceBehavior = new ShootBehavior();
		}
	}	
	//sets defensive behavior so that half the time it will be pass and half will be shoot. This is from a random num generator from 1-2
	public void setDefensiveBehavior()
	{
		if(smallRan == 1)
		{
			DefenceBehavior = new BlockBehavior();
		}
		
		else if(smallRan == 2)
		{
			DefenceBehavior = new ChasePuckBehavior();
		}
	}
	//call upon behavior
	
	
	public void display() {
		System.out.println(Name + "");
}

	@Override
	protected void DefenceBehavior() {
		// TODO Auto-generated method stub
		
	}
}
