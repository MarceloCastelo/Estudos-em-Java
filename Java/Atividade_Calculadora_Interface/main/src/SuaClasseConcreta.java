public class SuaClasseConcreta implements Calculadora{
    @Override
    public int soma(int a, int b){
    return a+b;
    }
    @Override
    public int subtracao(int a, int b){
        return a-b;
    }
    @Override
    public int multiplicacao(int a, int b){
        return a*b;
    }
    @Override
    public int divisao(int a, int b){
        return a/b;
    }
}