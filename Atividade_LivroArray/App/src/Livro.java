import java.util.Date;

public class Livro {
    private int idLivro;
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private Date dataLancada;
    
    public Livro(int idLivro, String iSBN, String titulo, String autor, int numeroPaginas, Date dataLancada) {
        this.idLivro = idLivro;
        ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.dataLancada = dataLancada;
    }
    
    public int getIdLivro() {
        return idLivro;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Date getDataLancada() {
        return dataLancada;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }


}
