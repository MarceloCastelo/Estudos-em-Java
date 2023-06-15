public class FuncionarioPublico extends Funcionario{

    private String orgaoOrigem;

    public FuncionarioPublico(int idFuncionario, String nome, double salario, String orgaoOrigem) {
        super(idFuncionario, nome, salario);
        this.orgaoOrigem = orgaoOrigem;
    }
    public String getOrgaoOrigem() {
        return orgaoOrigem;
    }

    public double aposentadoria(){
        return getSalario();
    }




}