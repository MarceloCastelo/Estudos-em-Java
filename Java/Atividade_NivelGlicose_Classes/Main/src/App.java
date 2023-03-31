import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
    
    
        Scanner scanner = new Scanner (System.in);
    System.out.println("Insira seu ID");
    int idExame = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Insira seu nome");
    String nomePaciente = scanner.nextLine();    
    System.out.println("Insira sua glicose");
    int nivelGlicose = scanner.nextInt();    
    
    Exame exame = new Exame();
    exame.setIdExame(idExame);
    exame.setNomePaciente(nomePaciente);
    exame.setNivelGlicose(nivelGlicose);



    System.out.println("id:..........: " + exame.getIdExame() );
    System.out.println("nome:........: " + exame.getNomePaciente());
    System.out.println("glicose:.....: " + exame.getNivelGlicose());
    System.out.println("O resultado é: " + exame.obterDiagnostico());



    }



}
