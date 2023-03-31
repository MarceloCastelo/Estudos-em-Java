
public class AppEspecial {
    public static void main(String[] args) throws Exception {
       ContaBancaria cb = new ContaBancaria();

    int idConta = 1;
    String Agencia = "001";
    String numeroConta = "10101-0";
    String tipo = "especial";
    double saldo = 0.0;
    double limiteCredito = 2000;

    cb.setIdConta(idConta); 
    cb.setAgencia(Agencia);
    cb.setNumeroConta(numeroConta);
    cb.setTipo(tipo);
    cb.setSaldo(saldo);
    cb.setLimiteCredito(limiteCredito);


    //Dados da Conta
    System.out.println("Id:............... " + cb.getIdConta());
    System.out.println("Agencia:.......... " + cb.getAgencia());
    System.out.println("Numero da conta:.. " + cb.getNumeroConta());
    System.out.println("Tipo:............. " + cb.getTipo());
    System.out.println("Saldo:............ " + cb.getSaldo());
    System.out.println("Limite de Crédito: " + cb.getLimiteCredito());

    //Deposito
    cb.registraDeposito(1000);
    System.out.println("Deposito realizado. Novo saldo: " + cb.getSaldo());

    cb.registraDeposito(500);
    System.out.println("Deposito realizado. Novo saldo: " + cb.getSaldo());    

    //Saque    
    //Saque
    if (cb.registraSaque(1000)) {
        System.out.println("Saque realizado com sucesso. Novo saldo: " + cb.getSaldo());
    } else {
        System.out.println("Saldo insuficiente");
    }
    if (cb.registraSaque(2000)) {
        System.out.println("Saque realizado com sucesso. Novo saldo: " + cb.getSaldo());
    } else {
        System.out.println("Saldo insuficiente");
    }
    if (cb.registraSaque(800)) {
        System.out.println("Saque realizado com sucesso. Novo saldo: " + cb.getSaldo());
    } else {
        System.out.println("Saldo insuficiente");
    }


   
    }
}