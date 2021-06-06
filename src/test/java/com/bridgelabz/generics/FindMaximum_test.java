package com.bridgelabz.generics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaximum_test {
	 @Test  
	    public void shouldReturn_MaximumIntegerValue(){  
	        assertEquals(44,FindMaximum.getMax_IntegerValue(new int[]{44,32,12}));  
	        assertEquals(23,FindMaximum.getMax_IntegerValue(new int[]{23,11,9}));  
	    }  
	 
	 @Test  
	    public void shouldReturn_MaximumIntegervalue(){  
	        assertEquals(40,FindMaximum.getMax_IntegerValue(new int[]{31,9,40}));  
	        assertEquals(39,FindMaximum.getMax_IntegerValue(new int[]{4,39,35}));  
	    }  
	 
	 @Test  
	    public void shouldReturn_MaximumIntegerValuE(){  
	        assertEquals(72,FindMaximum.getMax_IntegerValue(new int[]{8,32,72}));  
	        assertEquals(65,FindMaximum.getMax_IntegerValue(new int[]{23,11,65}));  
	    }
}
