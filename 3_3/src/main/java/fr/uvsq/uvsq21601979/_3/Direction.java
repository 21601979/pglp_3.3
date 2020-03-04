package fr.uvsq.uvsq21601979._3;

public class Direction 
{
	public int direction;
	
	Direction(int direction)
	{
		this.direction = direction;
	}
	
	void turn()
	{
		direction = (direction + 1)%4; 
	}
}
