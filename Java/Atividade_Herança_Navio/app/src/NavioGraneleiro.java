public class NavioGraneleiro extends Navio {
    
    private int quantidadeEscotilhas;

    public int getQuantidadeEscotilhas() {
        return quantidadeEscotilhas;
    }

    public NavioGraneleiro(int id, String nome, int quantidadePoroes, double capacidadeCarga,int quantidadeEscotilhas) {
        super(id, nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

    }

