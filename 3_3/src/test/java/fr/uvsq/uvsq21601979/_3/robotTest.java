package fr.uvsq.uvsq21601979._3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class robotTest 
{
	@Test
	public void avanceTest()
	{	
		robot r = new robot(new Position(0,0),new Direction(0));
		r.avance();
		assertEquals(r.position.x,1);
	}
	
	@Test
	public void tourneTest()
	{	
		robot r = new robot(new Position(0,0),new Direction(0));
		r.tourne();
		assertEquals(r.direction.direction,1);
	}
}
