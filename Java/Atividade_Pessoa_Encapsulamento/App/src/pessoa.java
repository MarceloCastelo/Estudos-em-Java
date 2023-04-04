public class pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    //Construtor
    public pessoa(String nome, int idade, double altura, double peso){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    }

    //Get
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    
    //Set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Calcular IMC
    public double calcularIMC (double imc){
        this.imc = peso/(altura*2);
        return this.imc;
    }

    //Classificar IMC
    public String classificarIMC (double imc){
        
        if (imc < 18.5){
                return "abaixo do peso";
        } else if (imc>= 18.5 || imc<= 24.9){
                return "peso normal";
        }else if (imc>=25 || imc <=29.9){
                return "sobrepeso";
        }else if (imc>=30 || imc <= 34.9){
                return "obesidade grau 1";
        }else if (imc>=35 || imc <= 39.9){
                return "obesidade grau 2";
        }else {
            return "obesidade grau 3";
        }
    }
  
    //Verificar maioridade
    public boolean verificarMaioridade (int idade){
        
        if (idade>18){
            return true;
        } else{
            return false;
        }
    }





}






