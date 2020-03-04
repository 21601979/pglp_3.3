package fr.uvsq.uvsq21601979._3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class robotStatiqueTest 
{
	@Test
	public void avanceTest()
	{	
		robotStatique r = new robotStatique(new Position(0,0),new Direction(0));
		r.avance();
		assertEquals(r.position.x,0);
	}
	
	@Test
	public void tourneTest()
	{	
		robotStatique r = new robotStatique(new Position(0,0),new Direction(0));
		r.tourne();
		assertEquals(r.direction.direction,1);
	}
}
