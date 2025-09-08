import java.util.Scanner;
public class practice_operators {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.print("Enter first number (a): ");
int a = sc.nextInt();
System.out.print("Enter second number (b): ");
int b = sc.nextInt();

 // Arithmetic Operators
System.out.println("\n Arithmetic Operators");
System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("a / b = " + (a / b));
System.out.println("a % b = " + (a % b));

//Logical Operator 
System.out.print("\nEnter your age: ");
int age = sc.nextInt();
System.out.print("Do you have an ID card? (true/false): ");
boolean hasID = sc.nextBoolean();
System.out.println("\nLogical Operators");
System.out.println("age > 18 && hasID: " + (age > 18 && hasID));
System.out.println("age < 18 || hasID: " + (age < 18 || hasID));
System.out.println("!(age > 18): " + !(age > 18));

// Assignment Operators
 int num = a;
 System.out.println("\nAssignment Operators");
num += 3;
System.out.println("num += 3: " + num);
num -= 2;
System.out.println("num -= 2: " + num);
num *= 4;
System.out.println("num *= 4: " + num);
num /= 2;
System.out.println("num /= 2: " + num);
num %= 3;
System.out.println("num %= 3: " + num);

// Bitwise Operators
System.out.println("\n Bitwise Operators");
System.out.println("a & b: " + (a & b));
System.out.println("a | b: " + (a | b));
System.out.println("a ^ b: " + (a ^ b));
System.out.println("~a: " + (~a));
System.out.println("a << 1: " + (a << 1));
System.out.println("a >> 1: " + (a >> 1));
sc.close();
    }
}