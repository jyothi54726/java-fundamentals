package fundamentals.datatypes;

public class PrimitiveDatatypes {

	public static void main(String[] args) {
		byte byteValue=10;
		short shortValue=100;
		int intValue=1000;
		long longValue=1000000000;
		float floatValue=10.5f;
		double doubleValue=100.009;
		char charValue='s';
		boolean booleanValue=true;
		
		System.out.println("byte:" + byteValue);
		System.out.println("short:" + shortValue);
		System.out.println("int:" + intValue);
		System.out.println("long:" + longValue);
		System.out.println("float:" + floatValue);
		System.out.println("double:" + doubleValue);
		System.out.println("char:" + charValue);
		System.out.println("boolean:" + booleanValue);

		System.out.println("\n Data Types using Wrappers:");
		
		System.out.println("Type of byteValue:" + ((Object)byteValue).getClass().getSimpleName());
		System.out.println("Type of shortValue:" + ((Object)shortValue).getClass().getSimpleName());
		System.out.println("Type of intValue:" + ((Object)intValue).getClass().getSimpleName());
		System.out.println("Type of floatValue:" + ((Object)floatValue).getClass().getSimpleName());
		System.out.println("Type of doubleValue:" + ((Object)doubleValue).getClass().getSimpleName());
		System.out.println("Type of charValue:" + ((Object)charValue).getClass().getSimpleName());
		System.out.println("Type of booleanValue:" + ((Object)booleanValue).getClass().getSimpleName());
	}

}
