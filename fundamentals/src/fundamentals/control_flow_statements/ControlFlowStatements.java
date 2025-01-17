package fundamentals.control_flow_statements;

public class ControlFlowStatements {

	public static void main(String[] args) {
        int num = 5;

        // 1. Conditional Statements
        System.out.println("Conditional Statements:");

        // if statement
        if (num > 0) {
            System.out.println("num is positive.");
        }

        // if-else statement
        if (num % 2 == 0) {
            System.out.println("num is even.");
        } else {
            System.out.println("num is odd.");
        }

        // if-else-if ladder
        if (num < 0) {
            System.out.println("num is negative.");
        } else if (num == 0) {
            System.out.println("num is zero.");
        } else {
            System.out.println("num is positive.");
        }

        // switch-case statement
        System.out.println("\nSwitch Statement:");
        int day = 3; // 1: Monday, 2: Tuesday, etc.
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // 2. Looping Statements
        System.out.println("\nLooping Statements:");

        // for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // while loop
        System.out.println("\n\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }

        // do-while loop
        System.out.println("\n\nDo-While Loop:");
        int value = 1;
        do {
            System.out.print(value + " ");
            value++;
        } while (value <= 5);

        // 3. Branching Statements
        System.out.println("\n\nBranching Statements:");

        // break statement
        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.print(i + " ");
        }

        // continue statement
        System.out.println("\nContinue Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue;
            }
            System.out.print(i + " ");
        }

        // return statement
        System.out.println("\n\nReturn Statement:");
        returnDemo();
    }

    // Demonstrating return statement
    public static void returnDemo() {
        System.out.println("This is before return.");
        return; // Exits the method
        // System.out.println("This won't execute"); // Unreachable code
    }
}
