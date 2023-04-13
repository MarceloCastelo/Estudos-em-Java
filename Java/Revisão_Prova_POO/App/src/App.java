import java.util.*;


public class App {

    //Chama as bibliotecas.
    static Scanner scanner = new Scanner(System.in);
    static List<Aluno> alunos = new ArrayList<Aluno>();

    public static void main(String[] args) throws Exception {

    
    System.out.println("CADASTRO DE ALUNO NUMERO: " + alunos.size() );

    for (int i = 0; i < 5; i++) {
        System.out.println("NOME DO ALUNO:");
        String nome = scanner.nextLine();
        System.out.println("NOTA DO ALUNO:");
        double nota = scanner.nextDouble();
        alunos.add(new Aluno(nome, nota));
    }






}
}
