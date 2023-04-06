public class MedicaoQualidadeAgua {
    private int idMedicao;
    private int faixa;
    private String classificacao;
    
    public MedicaoQualidadeAgua(int idMedicao, int faixa) {
        this.idMedicao = idMedicao;
        this.faixa = faixa;
    }
    
    public String getClassificacao() {
        return classificacao;
    }
    public int getFaixa() {
        return faixa;
    }
    public int getIdMedicao() {
        return idMedicao;
    }
   
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    public String definirClassificacao(){
    
        if (faixa == 80 || faixa <=100){
        return "Ótima";
    } else if (faixa == 52 || faixa <= 79) {
        return "Boa";
    } else if (faixa == 37 || faixa <= 51){
        return "Razoável";
    } else if (faixa == 20 || faixa <= 36){
        return "Ruim";
    } else if (faixa == 0 || faixa <= 19){
        return "Péssima";
    }
    return null;

    

}
 
    


}
