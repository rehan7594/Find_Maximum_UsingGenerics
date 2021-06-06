package com.bridgelabz.generics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaximum_test {
	private static final double DELTA = 1e-15;

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

	@Test  
	public void shouldReturn_MaximumFloatValue(){  
		assertEquals(42.5f,FindMaximum.getMax_FloatValue(new float[]{42.5f, 42.1f,12.7f}), DELTA);  
		assertEquals(23.2f,FindMaximum.getMax_FloatValue(new float[]{23.2f,11.5f,9.8f}), DELTA);  
	}  



	@Test
	public void shouldReturn_MaximumFloatvalue(){  
		assertEquals(39.4f,FindMaximum.getMax_FloatValue(new float[]{31.0f,39.4f,10.1f}), DELTA);  
		assertEquals(49.9f,FindMaximum.getMax_FloatValue(new float[]{4.0f,49.9f,35.0f}), DELTA);  
	}  

	@Test  
	public void shouldReturn_MaximumFloatValuE(){  
		assertEquals(72.2f,FindMaximum.getMax_FloatValue(new float[]{8.5f,32.0f,72.2f}), DELTA );  
		assertEquals(65.7f,FindMaximum.getMax_FloatValue(new float[]{23.8f,11.6f,65.7f}), DELTA);  
	}  

	@Test 
	public void shouldReturn_MaximumStringValuE(){
		assertEquals("Banana",FindMaximum.getMax_StringValue(new String[] {"Banana", "Peach", "Apple"}));
		assertEquals("Rabbit",FindMaximum.getMax_StringValue(new String[] {"Rabbit", "Snake", "Rat"}));

	}

	@Test 
	public void shouldReturn_MaximumStringValue(){
		assertEquals("Transcation",FindMaximum.getMax_StringValue(new String[] {"Money", "Transcation", "Cash"}));
		assertEquals("Orange",FindMaximum.getMax_StringValue(new String[] {"Blue", "Orange", "Red"}));

	}

	@Test 
	public void shouldReturn_MaximumStringvalue(){
		assertEquals("Karnataka",FindMaximum.getMax_StringValue(new String[] {"Delhi", "Goa", "Karnataka"}));
		assertEquals("Aeroplane",FindMaximum.getMax_StringValue(new String[] {"Bus", "Train", "Aeroplane"}));

	}

	@Test
	public void shouldReturn_MaxIntegerValue() {
		int maxValue=FindMaximum.getMax_Value(52, 11, 21);
		assertEquals( 52 , maxValue );
		int maxValue1=FindMaximum.getMax_Value(20, 22, 3);
		assertEquals( 22 , maxValue1 );
		int maxValue2=FindMaximum.getMax_Value(14, 2, 23);
		assertEquals( 23 , maxValue2 );
	}

	@Test
	public void shouldReturn_MaxFloatValue() {
		float maxValue=FindMaximum.getMax_Value(5.2f, 1.1f, 2.1f);
		assertEquals( 5.2f , maxValue, DELTA );
		float maxValue1=FindMaximum.getMax_Value(1.0f, 4.2f, 3.3f);
		assertEquals( 4.2f , maxValue1, DELTA );
		float maxValue2=FindMaximum.getMax_Value(1.9f, 7.2f, 15.3f);
		assertEquals( 15.3f , maxValue2, DELTA );

	}

	@Test
	public void shouldReturn_MaxStringValue() {
		String maxValue=FindMaximum.getMax_Value("Peach", "Apple" , "Banana");
		assertEquals("Peach", maxValue);
		String maxValue1=FindMaximum.getMax_Value("Rabbit", "Zebra", "Cat");
		assertEquals("Zebra", maxValue1);
		String maxValue2=FindMaximum.getMax_Value("London", "Delhi", "Portugal");
		assertEquals("Portugal", maxValue2);
	}
}