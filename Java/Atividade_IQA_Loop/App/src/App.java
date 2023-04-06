import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Insira seu id: ");
        int idMedicao = sc.nextInt();
        System.out.println("Insira a faixa");
        int faixa = sc.nextInt();
       
        MedicaoQualidadeAgua IQA = new MedicaoQualidadeAgua(idMedicao, faixa);
        
        if (faixa > 100){
            System.out.println("Valor não encontrado");
        } else {
             System.out.println(IQA.definirClassificacao());
        }
    }
}
