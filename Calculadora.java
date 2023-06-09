import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]) {
        // Calculadora
        Scanner sc = new Scanner(System.in);

        System.out.println("Que operacion realizara?? ('+', '-', '*', '/', '%')");
        String operacion = sc.next();

        System.out.println("Ingrese 2 operandos");
        System.out.println("operando 1: ");
        int x = sc.nextInt();
        System.out.println("operando 2: ");
        int y = sc.nextInt();

        // Evaluamos la operación ingresada y realizamos la operación correspondiente
        switch (operacion) {
            case "+":
                int resultadoSuma = suma(x, y);
                System.out.println("El resultado de la suma es: " + resultadoSuma);
                break;
            case "-":
                int resultadoResta = resta(x, y);
                System.out.println("El resultado de la resta es: " + resultadoResta);
                break;
            case "*":
                int resultadoMultiplicacion = mult(x, y);
                System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                break;
            case "/":
                int resultadoDivision = div(x, y);
                System.out.println("El resultado de la división es: " + resultadoDivision);
                break;
            case "%":
                int resultadoResto = mod(x, y);
                System.out.println("El resultado del resto es: " + resultadoResto);
                break;
            default:
                System.out.println("Operación inválida");
                break;
        }

    }

    // insertar métodos
    public static int suma(int x, int y) {
        return x + y;
    }

    public static int resta(int x, int y) {
        return x - y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
    
}