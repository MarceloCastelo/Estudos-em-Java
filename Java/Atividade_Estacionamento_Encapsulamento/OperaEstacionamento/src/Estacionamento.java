public class Estacionamento {

//Atributos
private int codigo, qtdeVagas, horasFranquiaInicial;
private String nome, cidade, situacao;
private double valorFranquiaInicial, valorAdicionalHora;

//Getter and Setter
public int getCodigo() {
    return codigo;
}
public void setCodigo(int codigo) {
    this.codigo = Podigo;
}
public int getQtdeVagas() {
    return qtdeVagas;
}
public void setQtdeVagas(int qtdeVagas) {
    this.qtdeVagas = qtdeVagas;
}
public int getHorasFranquiaInicial() {
    return horasFranquiaInicial;
}
public void setHorasFranquiaInicial(int horasFranquiaInicial) {
    this.horasFranquiaInicial = horasFranquiaInicial;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCidade() {
    return cidade;
}
public void setCidade(String cidade) {
    this.cidade = cidade;
}
public String getSituacao() {
    return situacao;
}
public void setSituacao(String situacao) {
    this.situacao = situacao;
}
public double getValorFranquiaInicial() {
    return valorFranquiaInicial;
}
public void setValorFranquiaInicial(double valorFranquiaInicial) {
    this.valorFranquiaInicial = valorFranquiaInicial;
}
public double getValorAdicionaHora() {
    return valorAdicionalHora;
}
public void setValorAdicionalHora(double valorAdicionalHora) {
    this.valorAdicionalHora = valorAdicionalHora;
}

//Métodos
public void ativar(){
if (situacao.equals("desativado")){
situacao = "ativado";
System.out.println("Ótimo! Agora está ativado");
} else {
    System.out.println("O estacionamento já está ativado");;
}

}

public void desativar(){
if (situacao.equals("ativado")){
situacao = "Desativado";
System.out.println("O estacionamento foi desativado");
} else{
    System.out.println("O estacionamento já está desativado");;
}


}


public double calcularEstacionamento(double horasEstacionado){
    if (horasEstacionado <= horasFranquiaInicial) {
        return valorFranquiaInicial;
        } else {
        valorFranquiaInicial = (valorFranquiaInicial-valorAdicionalHora) + (horasEstacionado*valorAdicionalHora);
        return valorFranquiaInicial;
        }
        
        }
    
}



