import java.util.*;


public class App {

    //Chama as bibliotecas.
    static Scanner scanner = new Scanner(System.in);
    static List<Aluno> alunos = new ArrayList<Aluno>();

    public static void main(String[] args) throws Exception {
 
    //Cadastra diversos alunos dentro da mesma váriavel.
    for (int i = 0; i < 5; i++) {
        System.out.println("CADASTRO DE ALUNO NUMERO: " + alunos.size());

        System.out.println("NOME DO ALUNO:");
        String nome = scanner.nextLine();

        //Adiciona os alunos dentro do ArrayList
        alunos.add(new Aluno(nome, i, i, i, i));
    }

    for (int i = 0; i < alunos.size(); i++){
        
    }


}

    //Calcula média do aluno no semestre 
    public double MediaAluno (double nota01, double nota02, double nota03, double nota04){
        double soma = 0;

        for (Aluno aluno : alunos){
            soma = aluno.getNota01() + aluno.getNota02() + aluno.getNota03() + aluno.getNota04();
        } return soma/4;
    }

}
