public class ContaBancaria {
    
    //Condicional
    private int idConta;
    private String agencia;
    private String numeroConta;
    private String tipo;
    private double saldo;
    private double limiteCredito;



    //getter e Setter
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }



    //Metodo
    public void registraDeposito(double valor){
     this.saldo = saldo+valor;
    }


    public boolean registraSaque(double valor) {
        if (tipo.equals("normal") && saldo - valor < 0.0) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        else if (tipo.equals("especial") && saldo - valor < -limiteCredito) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        saldo -= valor;
        return true;
    }
}
    