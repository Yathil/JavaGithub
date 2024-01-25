import java.util.Scanner;

public class App {

    private int calculadora(int num1, int num2, String operacion) {
        int resultado = 0;
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operacion invalida");
                break;
        }
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Introduce el operador (+, -, *, /):");
        String operador = scanner.next();

        App app = new App();
        int resultado = app.calculadora(num1, num2, operador);

        System.out.println("El resultado es: " + resultado);
    }
}
