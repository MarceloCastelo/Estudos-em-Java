
import java.util.Date;


public class Edicao {
   private int numero;
   private Date data;
   private int tiragem;
   private int quantidadeVendida;
   private boolean reciclou;

   

   public Edicao(int numero, int tiragem, int quantidadeVendida) {
    this.numero = numero;
    this.tiragem = tiragem;
    this.quantidadeVendida = quantidadeVendida;
    this.data = new Date();
    this.reciclou = false;
}

public int getNumero() {
    return numero;
}
public Date getData() {
    return data;
}
public int getTiragem() {
    return tiragem;
}
public int getQuantidadeVendida() {
    return quantidadeVendida;
}
public boolean isReciclou() {
    return reciclou;
}
public void setNumero(int numero) {
    this.numero = numero;
}
public void setTiragem(int tiragem) {
    this.tiragem = tiragem;
}
public void setQuantidadeVendida(int quantidadeVendida) {
    this.quantidadeVendida = quantidadeVendida;
}
public void setReciclou(boolean reciclou) {
    this.reciclou = reciclou;
}




public void reciclarExemplares(){
    this.reciclou = true;
}
public int obterQuantidadeReciclagem(){
    return tiragem-quantidadeVendida;
}
}
