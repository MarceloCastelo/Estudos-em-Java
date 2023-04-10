import java.util.*;






public class App {
    
    static Scanner scanner = new Scanner(System.in);
    static List<Eletrodomestico> eletrodomesticos = new ArrayList<Eletrodomestico>();
    private static int i;
    
    public static void main(String[] args) throws Exception {
    
    
    System.out.println("Cadastro eletrodomestico");
    System.out.println("digite o preço do Kwatts");
    float precoKwatts = scanner.nextFloat();
    
    for (i=0; i < 4; i++) {
        System.out.printf("\nDigite o código do %dº Eletrodoméstico: ", (i+1));
        int codigo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.printf("Digite o nome do  %dº Eletrodoméstico: ",  (i+1));
        String nome = scanner.nextLine();
        
        System.out.printf("Digite a potência do %dº Eletrodoméstico: ", (i+1));
        float potencia = scanner.nextFloat();
        
        System.out.printf("Digite o tempo de Utilização diária do %dº Eletrodoméstico: ", (i+1));
        float tempUtilizacaoDiaria = scanner.nextFloat();
        
        /*Pegando as informações necessária para cadastrar o Eletrodoméstico*/
        
        eletrodomesticos.add(new Eletrodomestico(codigo, nome, potencia, tempUtilizacaoDiaria));
    }

    System.out.println("\n===========================");
		System.out.println(" LISTA DE ELETRODOMÉSTICO  ");
		System.out.println("===========================");
		
	for (Eletrodomestico eletrodomestico : eletrodomesticos) {
			System.out.printf("\nCódigo...............: %d \n", eletrodomestico.getCodigo());
			System.out.printf("Nome.................: %s \n", eletrodomestico.getNome());
			System.out.printf("Potência.............: %.2f watts \n", eletrodomestico.getPotencia());
			System.out.printf("Tempo de Utilização..: %.2f horas/dia \n", eletrodomestico.getTempUtilizacaoDiaria());
			System.out.printf("Watts por Dia........: %.2f W \n", eletrodomestico.wattsPorDia());
			System.out.printf("Watts por Mês........: %.2f W \n", eletrodomestico.wattsPorMes());
			System.out.printf("Watts por Ano........: %.2f W \n", eletrodomestico.wattsPorAno());
			System.out.printf("Gasto do Mês.........: R$%.4f \n", eletrodomestico.gastoMes(precoKwatts));
			
			
		}





}


}