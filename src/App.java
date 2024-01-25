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
        App app = new App();
        int resultado = app.calculadora(10, 5, "+");
        System.out.println(resultado);
    }
}
