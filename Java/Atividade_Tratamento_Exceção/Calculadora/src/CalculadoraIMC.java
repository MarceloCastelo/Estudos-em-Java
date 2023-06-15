import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = 0;
        double altura = 0;

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite o peso em quilogramas: ");
                peso = scanner.nextDouble();

                System.out.print("Digite a altura em metros: ");
                altura = scanner.nextDouble();

                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar um número válido.");
                scanner.nextLine();
            }
        }

        double imc = calcularIMC(peso, altura);
        System.out.println("Seu IMC é: " + imc);
    }

    public static double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }
}
