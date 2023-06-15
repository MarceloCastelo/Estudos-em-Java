public class Funcionario {

    private int idFuncionario;
    private String nome;
    private double salario;


    public Funcionario(int idFuncionario, String nome, double salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.salario = salario;
    }

    
    public int getIdFuncionario() {
        return idFuncionario;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
