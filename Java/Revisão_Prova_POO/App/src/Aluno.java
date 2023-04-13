public class Aluno {

    //Atributos
    private String nome;
    private double nota;

    //Método Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
}

    //Get e Set

    //Recebe o valor da variável
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }


    //Altera o valor da variável
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }








}