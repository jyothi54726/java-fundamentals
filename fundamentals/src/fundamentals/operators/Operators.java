package fundamentals.operators;

public class Operators {

	public static void main(String[] args) {
		
		int a = 10, b=5, c;
		boolean x=true, y=false;
	
		// 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // AND
        System.out.println("x || y: " + (x || y)); // OR
        System.out.println("!x: " + (!x));         // NOT

        // 4. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));   // Bitwise AND
        System.out.println("a | b: " + (a | b));   // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b));   // Bitwise XOR
        System.out.println("~a: " + (~a));         // Bitwise Complement
        System.out.println("a << 1: " + (a << 1)); // Left Shift
        System.out.println("a >> 1: " + (a >> 1)); // Right Shift

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        c = a;
        System.out.println("c = a: " + c);
        c += b;
        System.out.println("c += b: " + c);
        c -= b;
        System.out.println("c -= b: " + c);
        c *= b;
        System.out.println("c *= b: " + c);
        c /= b;
        System.out.println("c /= b: " + c);
        c %= b;
        System.out.println("c %= b: " + c);

        // 6. Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("a: " + a);
        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("a++: " + (a++)); // Post-increment
        System.out.println("--a: " + (--a)); // Pre-decrement
        System.out.println("a--: " + (a--)); // Post-decrement

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Minimum value: " + min);
	}
}
