import java.net.InetAddress;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc  = new Scanner (System.in);



        //Cadastro
        System.out.println("Nome");
        String nome = sc.nextLine();
        System.out.println("idade");
        int idade = sc.nextInt();
        System.out.println("altura");
        double altura = sc.nextDouble();
        System.out.println("peso");
        double peso = sc.nextDouble();

        //Chamar construtor
        pessoa ps = new pessoa(nome, idade, altura, peso);

        
        if (ps.verificarMaioridade(idade) == false) {
            System.out.println("Você não pode continuar a aplicação.");
        } else {
            System.out.println("Nome:............... " + ps.getNome());
            System.out.println("Idade:............. " + ps.getIdade());
            System.out.println("Altura:........... " + ps.getAltura());
            System.out.println("Peso:............... " + ps.getPeso());
            double imc = ps.calcularIMC(peso);
            System.out.printf("IMC:.............. %.2f%n", imc);
            System.out.println("Situação: " + ps.classificarIMC(peso));
        }
        
    }
}
