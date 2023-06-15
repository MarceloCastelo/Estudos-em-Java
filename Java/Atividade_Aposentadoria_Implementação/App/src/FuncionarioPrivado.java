public class FuncionarioPrivado extends Funcionario {
    
    public FuncionarioPrivado(int idFuncionario, String nome, double salario) {
        super(idFuncionario, nome, salario);
    }

    public double aposentadoria() {
        double aposentadoria = getSalario() * 0.8; 
        double salarioMinimo = 1320;
        if (aposentadoria > (10 * salarioMinimo)) {
            aposentadoria = 10 * salarioMinimo;
        }
        return aposentadoria;
    }

}
