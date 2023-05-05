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
                int resultadoMultiplicacion = multiplicacion(x, y);
                System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                break;
            case "/":
                int resultadoDivision = division(x, y);
                System.out.println("El resultado de la división es: " + resultadoDivision);
                break;
            case "%":
                int resultadoResto = resto(x, y);
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

    public int resta(int x, int y) {
        return x - y;
    }

    public int mod(int x, int y) {
        return x % y;
    }
    public int mult(int x, int y) {
        return x * y;
    }
}