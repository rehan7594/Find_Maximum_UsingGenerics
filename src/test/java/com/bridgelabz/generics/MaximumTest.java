package com.bridgelabz.generics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaximumTest {
	private static final double DELTA = 1e-15;

	@Test
	public void shouldReturn_MaxIntegerValue() {
		int maxValue=Maximum.maximum(52, 11, 21);
		assertEquals( 52 , maxValue );
		int maxValue1=Maximum.maximum(5, 37, 2);
		assertEquals( 37 , maxValue1 );
		int maxValue2=Maximum.maximum(100, 1000, 10000);
		assertEquals( 10000 , maxValue2 );
	}

	@Test
	public void shouldReturn_MaxFloatValue() {
		float maxValue=Maximum.maximum(5.5f, 3.9f, 1.4f);
		assertEquals( 5.5f , maxValue, DELTA );
		float maxValue1=Maximum.maximum(0.65f, 0.81f, 0.045f);
		assertEquals( 0.81f , maxValue1, DELTA);
		float maxValue2=Maximum.maximum(100.56f, 1000.88f, 1000.89f);
		assertEquals( 1000.89f , maxValue2, DELTA );
	}

	@Test
	public void shouldReturn_MaxStringValue() {
		String maxValue=Maximum.maximum("Peach", "Apple", "Banana");
		assertEquals( "Peach" , maxValue );
		String maxValue1=Maximum.maximum("dew", "new", "few");
		assertEquals( "new" , maxValue1);
		String maxValue2=Maximum.maximum("spicy", "sour", "sweet");
		assertEquals( "sweet" , maxValue2);
	}

	@Test
	public void shouldReturn_Max_integerValue() {
		int maxValue=Maximum.maximumValues(52, 11, 21);
		assertEquals( 52 , maxValue );
		int maxValue1=Maximum.maximumValues(5, 37, 2, 91, 65);
		assertEquals( 91 , maxValue1 );
		int maxValue2=Maximum.maximumValues(32, 1, 9, 102, 36, 99, 199, 21, 500);
		assertEquals( 500 , maxValue2 );
	}

	@Test
	public void shouldReturn_Max_floatValue() {
		float maxValue=Maximum.maximumValues(5.5f, 3.9f, 1.4f, 4.8f, 9.0f, 2.1f);
		assertEquals( 9.0f , maxValue, DELTA );
		float maxValue1=Maximum.maximumValues(0.65f, 0.81f, 0.045f, 0.87f);
		assertEquals( 0.87f , maxValue1, DELTA);
		float maxValue2=Maximum.maximumValues(100.56f, 10.88f, 100.89f, 10.087f, 100.66f);
		assertEquals( 100.89f , maxValue2, DELTA );
	}


	@Test
	public void shouldReturn_Max_StringValue() {
		String maxValue=Maximum.maximumValues("Peach", "Apple", "Banana", "Tomato","Pomegranate");
		assertEquals( "Tomato" , maxValue );
		String maxValue1=Maximum.maximumValues("dew", "new", "few", "glue", "head");
		assertEquals( "new" , maxValue1);
		String maxValue2=Maximum.maximumValues("spicy", "sweet");
		assertEquals( "sweet" , maxValue2);
	}
}
