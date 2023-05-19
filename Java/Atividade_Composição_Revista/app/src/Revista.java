import java.util.ArrayList;
import java.util.List;

public class Revista {
    private int codigo;
    private String titulo;
    private int reciclagemProduzida;
    private List<Edicao> edicoes;

    public Revista(int codigo, String titulo) {
        super();
        this.codigo = codigo;
        this.titulo = titulo;
        this.reciclagemProduzida = 0;
        this.edicoes = new ArrayList<Edicao>();
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setReciclagemProduzida(int reciclagemProduzida) {
        this.reciclagemProduzida = reciclagemProduzida;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getReciclagemProduzida() {
        return reciclagemProduzida;
    }
    public List<Edicao> getEdicoes() {
        return edicoes;
    }
    public void setEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
    }
   
    public void adicionarEdicao(int numero, int tiragem, int quantidadeVendida){
        edicoes.add(new Edicao(numero, tiragem, quantidadeVendida));
    }

    public void removerEdicao(Edicao edicao){
        edicoes.remove(edicao);
    }

    public String reciclarEdicao(int numero){
            // Verifica se a edição existe na lista de edições da revista
            
            for (Edicao edicao : edicoes) {

                boolean edicaoEncontrada = edicao.isReciclou();
                
                if (edicao.getNumero() == numero) {
                    edicaoEncontrada = true;
                    
                    // Verifica se a edição já foi reciclada
                    if (edicao.isReciclou()) {
                        return "Edição já reciclada";
                    }
                    
                    // Verifica se há exemplares para reciclar
                    if (edicao.obterQuantidadeReciclagem() == 0) {
                        return "Não houve exemplares para reciclar";
                    }
                    
                    // Realiza a reciclagem
                    reciclagemProduzida += edicao.obterQuantidadeReciclagem();
                    edicao.reciclarExemplares();
                    
                    return "Reciclagem realizada";
                }
            }
            
            // Edição não encontrada na lista
            return "Edição não encontrada";
        }
        
    }






