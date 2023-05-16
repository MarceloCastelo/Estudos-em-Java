import java.util.ArrayList;

public class App {
    static ArrayList<Navio> navioGraneleiro = new ArrayList<Navio>();
    static ArrayList<Navio> navioContainer = new ArrayList<Navio>();  
    public static void main(String[] args) throws Exception {
        

        //Adiciona os navios
        navioGraneleiro.add(new NavioGraneleiro(10, "Estrela do mar", 4, 50000,  4));
        navioGraneleiro.add(new NavioGraneleiro(25, "Cruzeiro do sul", 3, 80000,  6));

        navioContainer.add(new NavioContainer(33, "Bela Fera", 2, 1000000, 2, 30));
        navioContainer.add(new NavioContainer(48, "Arrecifes", 2, 1200000, 2, 30));
        navioContainer.add(new NavioContainer(52, "Águas Belas", 1, 900000, 0, 25));
    }
}
