package fr.uvsq.uvsq21601979._3;

public class robotStatique
{
	protected Position position;
	protected Direction direction;
	
	public robotStatique(Position position, Direction direction)
	{
		this.position = position;
		this.direction = direction;
	}
	
	public void tourne()
	{
		direction.turn();
	}
	
	public void avance()
	{}
}
