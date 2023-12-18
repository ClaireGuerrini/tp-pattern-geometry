package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class SampleGeometryFactoryTest {


	public static final double EPSILON = 1.0e-15;

	@Test
	public void testCreatePoint(){

		Point p0 = SampleGeometryFactory.createPoint0();
		
		Assert.assertEquals(0.0, p0.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, p0.getCoordinate().getY(), EPSILON);
		
		Point pA = SampleGeometryFactory.createPointA();
		
		Assert.assertEquals(3.0, pA.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, pA.getCoordinate().getY(), EPSILON);
		
	}	
	
	@Test
	public void testCreateLineString(){

		LineString ls = SampleGeometryFactory.createLineString();
		
		
		Assert.assertFalse(ls.isEmpty());
		Assert.assertEquals(2,ls.getNumPoints());
		Assert.assertEquals(0.0,ls.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.0,ls.getPointN(1).getCoordinate().getX(), EPSILON);
		
	}	
}
