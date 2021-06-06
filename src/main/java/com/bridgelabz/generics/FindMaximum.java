package com.bridgelabz.generics;

public class FindMaximum {
	public static int getMax_IntegerValue(int[] numbers){
		int maxValue = numbers[0];
		for(int i=1;i < numbers.length;i++){
			if(numbers[i] > maxValue){
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
}