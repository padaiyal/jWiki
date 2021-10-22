/**
 * Java does both compilation and interpretation.
 * JVM - Java virtual machine.
 * Java comes with 2 key components - The compiler (javac) and the interpreter (java).
 *
 *
 * abc.java ----compile----> abc.class
 *                           Bytecode - The format the JVM understands
 *
 * abc.class ----interpret----> machine readable form.
 *
 *
 * JDK - Java Development Kit - Contains the compiler, libraries and the JRE (interpreter).
 *
 * JRE - Java Runtime Environment - Contains the interpreter.
 *
 */
public class Sample {

    public static void main(String[] args) {
        System.out.println("Hola!");
    }

}
