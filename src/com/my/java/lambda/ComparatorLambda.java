package com.my.java.lambda;

import java.util.Comparator;

public class ComparatorLambda {

	
	public static void main(String[] args) {
		
		//prior java 8
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2); // 0 >> o1==o2 
				  						// 1 >> o1>o2
										// -1 >> o1<o2
			}
		};
		System.out.println("value returned from comparator prior java 8 : "+comparator.compare(3, 2));
		
		//using lambda
		Comparator<Integer> comlambda1 = (Integer o1, Integer o2) -> o1.compareTo(o2);
		System.out.println("value returned from comparator using lambda : "+comlambda1.compare(3, 2));
		
		//using lambda with default type casting
		Comparator<Integer> comlambda2 = (o1, o2)-> o1.compareTo(o2);
		System.out.println("value returned from comparator using lambda : "+comlambda2.compare(3, 2));
	}
}
