public class Eletrodomestico {

    //Atributos
    private int codigo;
    private String nome;
    private float potencia;
    private float tempUtilizacaoDiaria;
    //construtor
    public Eletrodomestico(int codigo, String nome, float potencia, float tempUtilizacaoDiaria) {
        this.codigo = codigo;
        this.nome = nome;
        this.potencia = potencia;
        this.tempUtilizacaoDiaria = tempUtilizacaoDiaria;
    }
    //get
    public int getCodigo() {
        return codigo;
    }  
    public String getNome() {
        return nome;
    }
    public float getPotencia() {
        return potencia;
    }
    public float getTempUtilizacaoDiaria() {
        return tempUtilizacaoDiaria;
    }
    //set 
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    public void setTempUtilizacaoDiaria(float tempUtilizacaoDiaria) {
        this.tempUtilizacaoDiaria = tempUtilizacaoDiaria;
    }
    //Calculo1
    public float wattsPorDia(){
        float WD = potencia*tempUtilizacaoDiaria;
            return WD;
    }
    //Calculo2
    public float wattsPorMes(){
        float WM = wattsPorDia()*30;
            return WM;
    }
    //Calculo3
    public float wattsPorAno(){
        float WA = wattsPorMes()*12;
            return WA;
    }
    //calculo4
    public float gastoMes (float precoKwatts){
        float GM = (wattsPorMes()/1000)*precoKwatts;
            return GM;
    }










}