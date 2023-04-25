import java.util.Date;

public class Livro {
	private int idLivro;
	private String titulo;
	private String ISBN;
	private int numeroPaginas;
	private Date dataLancamento;
	private Genero genero;
	private Editora editora;
	
	public Livro(int idLivro, Genero genero, Editora editora, String titulo, String iSBN, int numeroPaginas, Date dataLancamento) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.ISBN = iSBN;
		this.numeroPaginas = numeroPaginas;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.editora = editora;
	}

	public int getIdLivro() {
		return idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}

	public Genero getGenero() {
		return genero;
	}

	public Editora getEditora() {
		return editora;
	}

	

}
