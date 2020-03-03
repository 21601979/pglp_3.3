package fr.uvsq.uvsq21601979._3;

public class robotStatique extends robot
{
	robotStatique(Position position, Direction direction)
	{
		super(position,direction);
	}
	
	@Override
	public void avance()
	{
		System.out.println("le robot ne peut pas se déplacer");
	}
}
