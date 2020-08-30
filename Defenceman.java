package strategydesignpattern;

import java.util.Random;

public class Defenceman extends Player {
	int Rnum;
	Random num = new Random();
	Random num2 = new Random();
	int smallRan = num2.nextInt(2);
	
	private void Random(int max, int min)
	{
		
		int Rnum = num.nextInt((max-min) + 1)+ min;
	}
//*
	public Defenceman(String Name) 
	{
		super(Name);
		
	}

	public void setOffensiveBehavior()
	{
		if(Rnum < 10)
		{
		OffenceBehavior = new Passbehavior();
		
		}
		else 
		{
		OffenceBehavior = new SlapShotBehavior();
		}
		
	}
	
	public void setDeffenciveBehavior()
	{
		if(smallRan == 1)
		{
			DefenceBehavior = new ChasePuckBehavior();
		}
		
		else if(smallRan == 2)
		{
			DefenceBehavior = BlockBehavior();
		}
	}
	public void display() {
		System.out.println(Name);
		
		
	}
	@Override
	protected void DefenceBehavior() {
		// TODO Auto-generated method stub
		
	}
	
	//*	
	

}
