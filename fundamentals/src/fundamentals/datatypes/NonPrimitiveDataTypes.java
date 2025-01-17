package fundamentals.datatypes;

import java.util.ArrayList;
import java.util.HashMap;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		String stringValue="Hello, Java!";
		Integer intObject=42;
		Double doubleObject=99.99;
		int[] intArray= {1,2,3,4,5};
		ArrayList<String> stringList=new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		System.out.println("String: "+ stringValue);
		System.out.println("Integer Object: " + intObject);
        System.out.println("Double Object: " + doubleObject);
        System.out.println("Array: " + java.util.Arrays.toString(intArray));
        System.out.println("ArrayList: " + stringList);
        System.out.println("HashMap: " + hashMap);
        
        System.out.println("\nData Types Identified:");
        System.out.println("Type of stringValue: " + stringValue.getClass().getSimpleName());
        System.out.println("Type of intObject: " + intObject.getClass().getSimpleName());
        System.out.println("Type of doubleObject: " + doubleObject.getClass().getSimpleName());
        System.out.println("Type of intArray: " + intArray.getClass().getSimpleName());
        System.out.println("Type of stringList: " + stringList.getClass().getSimpleName());
        System.out.println("Type of hashMap: " + hashMap.getClass().getSimpleName());
	}
}
