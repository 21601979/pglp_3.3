package fr.uvsq.uvsq21601979._3;

public class robot
{
	private Position position;
	private Direction direction;
	
	public robot(Position position, Direction direction)
	{
		this.position = position;
		this.direction = direction;
	}
	
	public void tourne()
	{
		direction.turn();
	}
	
	public void avance()
	{
		if(direction.direction == 0)
		{
			position.x += 1;
		}
		if(direction.direction == 1)
		{
			position.y += 1;
		}
		if(direction.direction == 2)
		{
			position.x -= 1;
		}
		if(direction.direction == 3)
		{
			position.y -= 1;
		}
	}
}
