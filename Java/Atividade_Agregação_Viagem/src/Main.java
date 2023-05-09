import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = sdf.parse("10/05/2023");
        Date dataFinal = sdf.parse("15/05/2023");

        // Instanciar um veículo
        Veiculo veiculo = new Veiculo(1, "ABC1234", 10000);

        // Mostrar os dados do veículo inicialmente (status "D")
        System.out.println("Dados do veículo antes da viagem:");
        System.out.println("ID do Veículo: " + veiculo.getIdVeiculo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Status: " + veiculo.getStatus());
        System.out.println("Quilometragem do Odômetro: " + veiculo.getKmOdometro());

        // Programar uma viagem
        Viagem viagem = new Viagem(1, "IMBIRIBEIRA", dataInicial, dataFinal, 0, veiculo);

        // Registrar o início da viagem
        boolean viagemIniciada = viagem.iniciarViagem(veiculo);

        if (viagemIniciada) {
            System.out.println("\nViagem iniciada com sucesso!");
            System.out.println("Dados da viagem iniciada:");
            System.out.println("ID: " + viagem.getIdViagem());
            System.out.println("Destino: " + viagem.getDestino());
            System.out.println("Data Inicial: " + sdf.format(viagem.getDataInicial()));
            System.out.println("Data Final: " + sdf.format(viagem.getDataFinal()));
            System.out.println("Quilômetros Percorridos: " + viagem.getKmPercorrido());
            System.out.println("ID do Veículo: " + viagem.getVeiculo().getIdVeiculo());
            System.out.println("Status do Veículo: " + viagem.getVeiculo().getStatus());
        } else {
            System.out.println("\nFalha ao iniciar a viagem. O veículo não está disponível.");
        }

        // Registrar o fim da viagem
        int kmOdometroFinal = 10500;
        viagem.finalizarViagem(kmOdometroFinal);

        System.out.println("\nViagem finalizada!");
        System.out.println("Dados da viagem finalizada:");
        System.out.println("ID: " + viagem.getIdViagem());
        System.out.println("Destino: " + viagem.getDestino());
        System.out.println("Data Inicial: " + sdf.format(viagem.getDataInicial()));
        System.out.println("Data Final: " + sdf.format(viagem.getDataFinal()));
        System.out.println("Quilômetros Percorridos: " + viagem.getKmPercorrido());
        System.out.println("ID do Veículo: " + viagem.getVeiculo().getIdVeiculo());
        System.out.println("Status do Veículo: " + viagem.getVeiculo().getStatus());
        System.out.println("Quilometragem do Odômetro: " + viagem.getVeiculo().getKmOdometro());

        // Colocar o veículo em manutenção
        veiculo.revisar();
        System.out.println("\nDados do veículo em manutenção:");
		System.out.println("ID do Veículo: " + veiculo.getIdVeiculo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Status: " + veiculo.getStatus());
        System.out.println("Quilometragem do Odômetro: " + veiculo.getKmOdometro());
    }
}