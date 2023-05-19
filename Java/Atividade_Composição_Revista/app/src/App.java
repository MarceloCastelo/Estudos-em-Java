import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os dados da revista:");
        System.out.println("codigo:");
        int codigo = scanner.nextInt();
        System.out.println("Titulo:");
        String titulo = scanner.nextLine();
        System.out.println("");
        
        Revista revista = new Revista(codigo, titulo);

        System.out.println("Adicionando edições...");
        revista.adicionarEdicao(52, 1000, 800);
        revista.adicionarEdicao(53, 900, 900);
        revista.adicionarEdicao(54, 1200, 1000);

        System.out.println("Reciclando edições...");
        

for (Edicao edicao : revista.getEdicoes()) {
    if (edicao.getNumero() == 52) {
        revista.reciclarEdicao(52);
        System.out.println("Retorno da reciclagem da edição 53: " + edicao.isReciclou());
        System.out.println("Reciclagem produzida pela revista: " + edicao.obterQuantidadeReciclagem());
    } else if (edicao.getNumero() == 53) {
        revista.reciclarEdicao(53);
        System.out.println("Retorno da reciclagem da edição 53: " + edicao.isReciclou());
        System.out.println("Reciclagem produzida pela revista: " + edicao.obterQuantidadeReciclagem());
    } else if (edicao.getNumero() == 54) {
        revista.reciclarEdicao(54);
        System.out.println("Retorno da reciclagem da edição 53: " + edicao.isReciclou());
        System.out.println("Reciclagem produzida pela revista: " + edicao.obterQuantidadeReciclagem());
    }
}


        }
    }

