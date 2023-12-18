package org.acme.geometry;


import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {
	
	public static final double EPSILON = 1.0e-15;

	@Test
	public void testConstructorCoordinate(){
		Coordinate bottomLeft = new Coordinate(0.0,1.0);
		Coordinate topRight = new Coordinate(3.0,4.0);
		
		Envelope envelope = new Envelope(bottomLeft,topRight);
		
		Assert.assertEquals(0.0, envelope.getXmin(), EPSILON);
		Assert.assertEquals(1.0, envelope.getYmin(), EPSILON);
		Assert.assertEquals(3.0, envelope.getXmax(), EPSILON);
		Assert.assertEquals(4.0, envelope.getYmax(), EPSILON);
		Assert.assertFalse(envelope.isEmpty());
		Assert.assertEquals("0.0,1.0,3.0,4.0", envelope.toString());
		
		
	}
	
	@Test
	public void testConstructorEmpty(){
		Envelope envelope = new Envelope();
		Assert.assertTrue(envelope.isEmpty());

		
		
	}

}
