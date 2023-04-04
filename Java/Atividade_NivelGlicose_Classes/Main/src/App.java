import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	//static Exame[] exames = new Embarcacao[5];
	static List<Exame> exames = new ArrayList();
	
	static Scanner input = new Scanner(System.in);		
	
	public static void main(String[] args) {

		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar Exame");
			System.out.println("2 - Consultar Exame");
			System.out.println("3 - Alterar Exame");
			System.out.println("4 - Excluir Exame");
			System.out.println("5 - Listar Exame");
			System.out.println("0 - Finalizar");

			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				cadastraExame();
				break;
			case 2:
				consultaExame();
				break;
			case 3:
				alteraExame();
				break;
			case 4:
				excluiExame();
				break;
			case 5:
				listaExame();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");			
			}
			
		} while (opcao !=0);
		input.close();
	}
	
	public static Exame pesquisaExamePorCodigo(int idExame) {
		for (Exame exame : exames) {
			if (idExame == exame.getIdExame()) {
				return exame;
			}
			
		}
		return null;
	}
	
	
	public static void cadastraExame() {
		System.out.println("\n*** Cadastro de Exame ***\n");
		
		input.nextLine();
		System.out.printf("\nCódigo do exame: ");
		int idExame = input.nextInt();
		
		if (pesquisaExamePorCodigo(idExame) != null) {
			System.out.println("\n-- Código já cadastrado --\n");
			return;
		}	

		System.out.printf("\nInsira o seu nome: ");
		String nomePaciente = input.nextLine();
		
		input.nextLine();
		
		System.out.printf("\nInsira o seu nível de glicose: ");
		int nivelGlicose = input.nextInt();
		
		exames.add(new Exame(idExame, nomePaciente, nivelGlicose));
		System.out.println("\n-- Cadastro efetuado --\n");				
		
	}
	
	public static void consultaExame() {
		System.out.println("\n*** Consulta de Exames ***\n");
		if (exames.size() ==0) {
			System.out.println("Lista vazia");
			return;
		}
		
		input.nextLine();
		System.out.printf("\nSeu id: ");
		int idExame = input.nextInt();
		
		Exame exame = pesquisaExamePorCodigo(idExame);
		
		if (exame == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nID...............: %s\n", exame.getIdExame());
		System.out.printf("\nNome.............: %s", exame.getNomePaciente());
		System.out.printf("\nSituação...........: %d", exame.getNivelGlicose());
		System.out.printf("\nDiagnóstico........: %s", exame.obterDiagnostico());
				
	}
	
	
	public static void alteraExame() {
		System.out.println("\n*** Alteração do Exame ***\n");
		if (exames.size() ==0) {
			System.out.println("Lista vazia");
			return;
		}

		input.nextLine();
		System.out.printf("\nSeu ID: ");
		int idExame = input.nextInt();
		
		Exame exame = pesquisaExamePorCodigo(idExame);
		
		if (exame == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nID...............: %s\n", exame.getIdExame());
		System.out.printf("\nNome.............: %s", exame.getNomePaciente());
		System.out.printf("\nSituação...........: %d", exame.getNivelGlicose());
		System.out.printf("\nDiagnóstico........: %s", exame.obterDiagnostico());

		System.out.println("\nNova Glicose: ");
		int novaGlicose = input.nextInt();
		exame.setNivelGlicose(novaGlicose);
		System.out.println("Nivel de Glicose alerado");
	}
	
	
	public static void excluiExame() {
		System.out.println("\n*** Exclusão de Embarcacao ***\n");
		if (exames.size() ==0) {
			System.out.println("Lista vazia");
			return;
		}
		
		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		int idExame = input.nextInt();
		
		Exame exame = pesquisaExamePorCodigo(idExame);
		
		if (exame == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nID...............: %s\n", exame.getIdExame());
		System.out.printf("\nNome.............: %s", exame.getNomePaciente());
		System.out.printf("\nSituação...........: %d", exame.getNivelGlicose());
		System.out.printf("\nDiagnóstico........: %s", exame.obterDiagnostico());

		char confirma;
		do {
			System.out.printf("\nConfirma exclusão [S/N]: ");
			confirma = input.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);
		
		if (confirma=='S') {
			
			exames.remove(exame);
						
			System.out.println("-- Exclusão efetuada");	

		}
		else {
			System.out.println("-- Exclusão cancelada");
		}				
	}
	
	public static void listaExame() {
		System.out.println("\n*** Listagem do exame ***\n");
		
		if (exames.size() ==0) {
			System.out.println("Lista vazia");
			return;
		}
		
		System.out.println("=====================================");
		System.out.println("ID 		NOME 		GLICOSE 		DIAGNÓSTICO");
		System.out.println("=====================================");

		for (Exame exame : exames) {
			System.out.printf("%-6d %-11s %10d %10s", 
			  		  exame.getIdExame(),
					  exame.getNomePaciente(),
					  exame.getNivelGlicose(),
					exame.obterDiagnostico());
					  				
	}		
	System.out.println("=====================================");		
}
	
}	
	