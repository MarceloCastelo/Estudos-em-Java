
public class Aluno {

    //Atributos
    private String nome;
    private double nota01;
    private double nota02;
    private double nota03;
    private double nota04;
    
    //Construtor
    public Aluno (String nome, double nota01, double nota02, double nota03, double nota04){
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
    }
    
    //Get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota01() {
        return nota01;
    }
    public double getNota02() {
        return nota02;
    }
    public double getNota03() {
        return nota03;
    }
    public double getNota04() {
        return nota04;
    }
    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }
    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }
    public void setNota03(double nota03) {
        this.nota03 = nota03;
    }
    public void setNota04(double nota04) {
        this.nota04 = nota04;
    }






}