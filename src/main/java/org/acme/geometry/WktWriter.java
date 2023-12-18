package org.acme.geometry;

public class WktWriter {

	public String write(Geometry geometry) {
		
		if ( geometry instanceof Point ){
		    Point point = (Point)geometry;
		    
		    if (point.isEmpty()) {
		    	return "POINT EMPTY";
		    } else {
		    	return "POINT("+point.getCoordinate().getX()+" "+point.getCoordinate().getY()+")";
		    }
		    
		    
		}else if ( geometry instanceof LineString ){
		    LineString lineString = (LineString)geometry;
		    
		    if (lineString.isEmpty()) {
		    	return "LINESTRING EMPTY";
		    } else {
		    	String result = "LINESTRING(";
		    	
		    	for (int i=0; i<lineString.getNumPoints(); i++) {
		    		Point point = lineString.getPointN(i);
		    		result += point.getCoordinate().getX()+" "+point.getCoordinate().getY();
		    		
		    		if (i != lineString.getNumPoints()-1) {
		    			result += ",";
		    		}
		    	}
		    	result += ")";
		    	
		    	return result;
		    }
		    
		    
		    
		}else{
		    throw new RuntimeException("geometry type not supported");
		}
		
		
		
	}
}

//POINT EMPTY
//POINT(3.0 4.0)
//LINESTRING EMPTY
//LINESTRING(0.0 0.0,1.0 1.0,5.0 5.0)