import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<String> historico = new ArrayList<>();

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
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("7 - Porcentagem");
            System.out.println("8 - Histórico");
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
                case 5:
                    realizarPotencia();
                    break;
                case 6:
                    realizarRaizQuadrada();
                    break;
                case 7:
                    realizarPorcentagem();
                    break;
                case 8:
                    exibirHistorico();
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
        while (true) {
            try {
                System.out.print(mensagem);

                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Entrada inválida.");

                scanner.nextLine();
            }
        }
    }

    public static void realizarSoma() {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        double resultado = a + b;

        String operacao = a + " + " + b + " = " + resultado;

        historico.add(operacao);

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarSubtracao() {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        double resultado = a - b;

        String operacao = a + " - " + b + " = " + resultado;

        historico.add(operacao);

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarMultiplicacao() {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        double resultado = a * b;

        String operacao = a + " * " + b + " = " + resultado;

        historico.add(operacao);

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

        String operacao = a + " / " + b + " = " + resultado;

        historico.add(operacao);

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarPotencia() {
        double base = lerNumero("Base: ");
        double expoente = lerNumero("Expoente: ");

        double resultado = Math.pow(base, expoente);

        String operacao = base + " ^ " + expoente + " = " + resultado;

        historico.add(operacao);

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarRaizQuadrada() {
        double numero = lerNumero("Número: ");

        if (numero < 0) {
            System.out.println("Não existe raiz real para número negativo.");

            return;
        }

        double resultado = Math.sqrt(numero);

        String operacao = "√ " + numero + " = " + resultado;

        historico.add(operacao);

        System.out.println("Resultado: " + resultado);
    }

    public static void realizarPorcentagem() {
        double valor = lerNumero("Valor: ");
        double porcentagem = lerNumero("Porcentagem: ");

        double resultado = (valor * porcentagem) / 100;

        String operacao = porcentagem + "% de " + valor + " = " + resultado;

        historico.add(operacao);

        System.out.println("Resultado: " + resultado);
    }

    public static void exibirHistorico() {
        if(historico.isEmpty()) {
            System.out.println("Nenhuma operação realizada.");

            return;
        }

        System.out.println("\n=== HISTÓRICO ===");

        for(String operacao : historico) {
            System.out.println(operacao);
        }
    }
}
