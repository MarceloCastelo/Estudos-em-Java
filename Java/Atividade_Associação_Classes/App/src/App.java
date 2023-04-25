import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App {

	public static void main(String[] args) throws ParseException {
		// Definindo o formato da data
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataLancamento01 = formato.parse("05/01/2007");
        Date dataLancamento02 = formato.parse("06/01/2008");
        Date dataLancamento03 = formato.parse("07/01/2009");
        Date dataLancamento04 = formato.parse("08/01/2010");
        Date dataLancamento05 = formato.parse("10/01/2011");
        
     // Instanciando dois objeto da classe Editora
        Editora editora01 = new Editora (1, "Saraiva", "99999999", "Recife", "PE");
        Editora editora02 = new Editora (2, "Cultura", "99999998", "Recife", "PE");
        
     // Instanciar três objetos da classe Genero
       Genero genero01 = new Genero(1, "Terror");
       Genero genero02 = new Genero(2, "Romance");
       
     // Instanciar cinco objetos da classe Livro
       
       Livro livro01 = new Livro (1, genero01, editora01, "Bruxas", "aaaaa", 456, dataLancamento01);
       Livro livro02 = new Livro (2, genero01, editora01, "Monstros", "aaaab", 350, dataLancamento02); 
       Livro livro03 = new Livro (3, genero02, editora02, "Amor", "aaaac", 150, dataLancamento03);
       Livro livro04 = new Livro (4, genero02, editora02, "Amor 2, o retorno", "aaaad", 250, dataLancamento04); 
       Livro livro05 = new Livro (5, genero02, editora02, "Amor 3, a volta dos que não foram", "aaaae", 350, dataLancamento05);
	
       // Printa os dados
       System.out.println("\nTítulo: " + livro01.getTitulo() + 
    		              "\nNome do gênero: "+ livro01.getGenero().getNomeGenero() +
    		              "\nRazão Social: " + livro01.getEditora().getRazaoSocial() +
    		              "\nCidade da Editora: " + livro01.getEditora().getCidade());
       
       System.out.println("\nTítulo: " + livro02.getTitulo() + 
	              "\nNome do gênero: "+ livro02.getGenero().getNomeGenero() +
	              "\nRazão Social: " + livro02.getEditora().getRazaoSocial() +
	              "\nCidade da Editora: " + livro02.getEditora().getCidade());
       
       System.out.println("\nTítulo: " + livro03.getTitulo() + 
	              "\nNome do gênero: "+ livro03.getGenero().getNomeGenero() +
	              "\nRazão Social: " + livro03.getEditora().getRazaoSocial() +
	              "\nCidade da Editora: " + livro03.getEditora().getCidade());
       
       System.out.println("\nTítulo: " + livro04.getTitulo() + 
	              "\nNome do gênero: "+ livro04.getGenero().getNomeGenero() +
	              "\nRazão Social: " + livro04.getEditora().getRazaoSocial() +
	              "\nCidade da Editora: " + livro04.getEditora().getCidade());
       
       System.out.println("\nTítulo: " + livro05.getTitulo() + 
	              "\nNome do gênero: "+ livro05.getGenero().getNomeGenero() +
	              "\nRazão Social: " + livro05.getEditora().getRazaoSocial() +
	              "\nCidade da Editora: " + livro05.getEditora().getCidade());
       
	}

}