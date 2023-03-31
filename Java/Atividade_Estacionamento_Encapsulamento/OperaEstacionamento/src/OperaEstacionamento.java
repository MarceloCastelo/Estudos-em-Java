public class OperaEstacionamento {
    public static void main(String[] args) throws Exception {
    
     Estacionamento est = new Estacionamento();
     
    //Cadastra estacionamento
    est.setCodigo(0001);
    est.setNome("Estacionamento da Cidade");
    est.setCidade("Recife");
    est.setQtdeVagas(50);
    est.setSituacao("desativado");
    est.setHorasFranquiaInicial(1);
    est.setValorFranquiaInicial(10);
    est.setValorAdicionalHora(2);


    //Mostra os dados do estacionamento

    System.out.println("Aqui estão os dados do estacionamento");
    System.out.println("seu código:................ " + est.getCodigo());
    System.out.println("Seu nome:.................. " + est.getNome());
    System.out.println("Cidade:.................... " + est.getCidade());
    System.out.println("Quantidade de vagas:....... " + est.getQtdeVagas());
    System.out.println("situação do estacionamento: " + est.getSituacao());

    //Ativa o estacionamento
    System.out.println("Analisando a situação do estacionamento...");
    est.ativar();


    
    //Mostra os dados do estacionamento
    System.out.println("Aqui estão os dados do estacionamento atualizados");
    System.out.println("seu código:................ " + est.getCodigo());
    System.out.println("Seu nome:.................. " + est.getNome());
    System.out.println("Cidade:.................... " + est.getCidade());
    System.out.println("Quantidade de vagas:....... " + est.getQtdeVagas());
    System.out.println("situação do estacionamento: " + est.getSituacao());



    //Calcula o valor do estacionamento de um veículo 
    est.calcularEstacionamento(3);
    System.out.println("você precisa pagar: " + est.getValorFranquiaInicial());




    //Se naõ estivar ativo, informar "estacionamento desativado"
    if (est.getSituacao().equals("desativado")){
    System.out.println("estacionamento desativado");
    }




    //Desativar estacionamento
    System.out.println("Desativando estacionamento...");
    est.desativar();
    //Calcular o valor do estacionamento de um veículo
    est.calcularEstacionamento(1);

    }
}
