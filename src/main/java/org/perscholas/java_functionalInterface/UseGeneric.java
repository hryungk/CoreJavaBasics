package org.perscholas.java_functionalInterface;

public class UseGeneric {
	
	public static void main(String[] args) {		
		InterfaceGeneric<Integer> nums = new InterfaceGeneric<>() {
			@Override
			public Integer compare(Integer o1, Integer o2) {
				if (o1 > o2)
					return o1;
				else 
					return o2;
			}
		};
		int max = nums.compare(13, 9);		
		System.out.println(max);
		
		
		InterfaceGeneric<Float> floats = (Float o1, Float o2) -> {
			if (o1 > o2)
				return o1;
			else 
				return o2;			
		};
		float maxFloat = floats.compare(13F, 9F);		
		System.out.println(maxFloat);
	}
}
