package com.bridgelabz.generics;

public class Maximum<E extends Comparable<E>> {
	
	public E x;
	public E y;
	public E z;

	public Maximum(E x,E y,E z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public E maximum() {
		return Maximum.maximum(x, y, z);
	}
	
	public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
		 E maxValue = x;
		 if(y.compareTo(maxValue) > 0 ) {
			maxValue=y;
		 }	
		 if(z.compareTo(maxValue) > 0 ) {
			maxValue=z;	
		 }
		 return maxValue;
	}
	
	public static <E extends Comparable<E>> E maximumValues( E ...values) {
		 E maxValue = values[0];
		 for(int i=1; i < values.length; i++){
		 if(values[i].compareTo(maxValue) > 0 )
			maxValue=values[i];
		 }
		 return maxValue;
	} 
}
