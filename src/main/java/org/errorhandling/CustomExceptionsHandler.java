package org.errorhandling;

public class CustomExceptionsHandler {

    public CustomExceptionsHandler() {}

    public void division(double a, double b) {
        try {
            if (b == 0)
                throw new ArithmeticException("No se puede dividir por cero");
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.print("Error: " + ae.getMessage());
        } catch (Exception e) {
            System.out.print("Error inesperado: " + e.getMessage());
        }
    }
}
