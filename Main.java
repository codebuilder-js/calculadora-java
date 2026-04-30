import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exibirMenu();
    }

    public static void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarSoma();
                    break;
                case 2:
                    realizarSubtracao();
                    break;
                case 3:
                    realizarMultiplicacao();
                    break;
                case 4:
                    realizarDivisao();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static double lerNumero(String mensagem) {
        System.out.print(mensagem);

        return scanner.nextDouble();
    }

    public static void realizarSoma() {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        double resultado = a + b;

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarSubtracao() {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        double resultado = a - b;

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarMultiplicacao() {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        double resultado = a * b;

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarDivisao() {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        if (b == 0) {

            System.out.println("Não é possível dividir por zero.");

            return;
        }

        double resultado = a / b;

        System.out.println("Resultado: " + resultado);
    }
}
