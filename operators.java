public class operators {


    public static void main(String[] args) {
        
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulo

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));   // Greater than
        System.out.println("a < b = " + (a < b));   // Less than
        System.out.println("a == b = " + (a == b)); // Equal to
        System.out.println("a != b = " + (a != b)); // Not equal to
        System.out.println("a >= b = " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b = " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y)); // AND
        System.out.println("x || y = " + (x || y)); // OR
        System.out.println("!x = " + !x);            // NOT

        // Unary Operators
        int c = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("++c = " + (++c));   // Pre-increment
        System.out.println("c++ = " + (c++));    // Post-increment
        System.out.println("c = " + c);          // Value after post-increment
        System.out.println("--c = " + (--c));   // Pre-decrement
        System.out.println("c-- = " + (c--));    // Post-decrement
        System.out.println("c = " + c);          // Value after post-decrement

        // Assignment Operators
        int d = 20;
        d += 5;  // d = d + 5
        System.out.println("\nAssignment Operators:");
        System.out.println("d += 5 => " + d);   // d = d + 5
        d -= 3;  // d = d - 3
        System.out.println("d -= 3 => " + d);   // d = d - 3
        d *= 2;  // d = d * 2
        System.out.println("d *= 2 => " + d);   // d = d * 2
        d /= 4;  // d = d / 4
        System.out.println("d /= 4 => " + d);   // d = d / 4
        d %= 3;  // d = d % 3
        System.out.println("d %= 3 => " + d);   // d = d % 3

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int result = (a > b) ? a : b;  // If a
    }
}
