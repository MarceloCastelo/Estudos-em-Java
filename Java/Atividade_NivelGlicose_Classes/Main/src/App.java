import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
    
    try (//Recebe informações do usuário.
    Scanner scanner = new Scanner (System.in)) {
        System.out.println("Insira seu ID");
        int idExame = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira seu nome");
        String nomePaciente = scanner.nextLine();    
        System.out.println("Insira sua glicose");
        int nivelGlicose = scanner.nextInt();    
        
        //Chama construtor.
        Exame exame = new Exame(idExame, nomePaciente, nivelGlicose);


        System.out.println("id:..........: " + exame.getIdExame() );
        System.out.println("nome:........: " + exame.getNomePaciente());
        System.out.println("glicose:.....: " + exame.getNivelGlicose());
        System.out.println("O resultado é: " + exame.obterDiagnostico());
    }



    }



}
