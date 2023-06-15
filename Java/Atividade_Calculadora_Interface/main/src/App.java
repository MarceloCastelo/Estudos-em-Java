public class App {

    public static void main(String[] args)
{
        Calculadora calculadora = new SuaClasseConcreta();
        int resultadoSoma = calculadora.soma(10, 5);
        int resultadoSubtracao = calculadora.subtracao(10, 5);
        int resultadoMultiplicacao = calculadora.multiplicacao(10, 5);
        int resultadoDivisao = calculadora.divisao(10, 5);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}