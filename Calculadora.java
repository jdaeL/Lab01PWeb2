import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]) {
        // Calculadora
        Scanner sc = new Scanner(System.in);

        System.out.println("Que operacion realizara?? ('+', '-', '*', '/')");
        String operacion = sc.next();

        System.out.println("Ingrese 2 operandos");
        System.out.println("operando 1: ");
        int x = sc.nextInt();
        System.out.println("operand2 2: ");
        int y = sc.nextInt();

    }

    public int suma(int x, int y) {
        return x + y;
    }

    public int resta(int x, int y) {
        return x - y;
    }
}