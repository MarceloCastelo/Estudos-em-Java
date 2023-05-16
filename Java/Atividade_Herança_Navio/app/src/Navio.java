public class Navio {
    
    private int id;
    private String nome;
    private int QuantidadePoroes;
    private double capacidadeCarga;
    private String disponibilidade;

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePoroes() {
        return QuantidadePoroes;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }


    public Navio(int id, String nome, int quantidadePoroes, double capacidadeCarga) {
        this.id = id;
        this.nome = nome;
        QuantidadePoroes = quantidadePoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = "Vazio";
    }



    public void iniciarCarregamento(){
        this.disponibilidade="Carregando";
    }
    
    public void bloquearCarregamento(){
        this.disponibilidade="Lotado";
    }

}
