package fr.uvsq.uvsq21601979._3;

public class robot extends robotStatique
{	
	public robot(Position position, Direction direction)
	{
		super(position, direction);
	}
	
	@Override
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
