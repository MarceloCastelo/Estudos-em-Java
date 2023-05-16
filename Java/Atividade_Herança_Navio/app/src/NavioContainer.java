public class NavioContainer extends Navio {
    
    private int quantidadeGuindastes;
    private int quantidadeCamadas;
    
    public int getQuantidadeGuindastes() {
        return quantidadeGuindastes;
    }

    public int getQuantidadeCamadas() {
        return quantidadeCamadas;
    }

    public NavioContainer(int id, String nome, int quantidadePoroes, double capacidadeCarga, int quantidadeGuindastes,
     int quantidadeCamadas) {
        super(id, nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamadas = quantidadeCamadas;
    }

}