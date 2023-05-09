import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Viagem {
    private int idViagem;
    private String destino;
    private Date dataInicial;
    private Date dataFinal;
    private int kmPercorrido;
    private Veiculo veiculo;

    public Viagem(int idViagem, String destino, Date dataInicial, Date dataFinal, int kmPercorrido, Veiculo veiculo) {
        super();
        this.idViagem = idViagem;
        this.destino = destino;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.kmPercorrido = 0;
        this.veiculo = veiculo;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public String getDestino() {
        return destino;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public int getKmPercorrido() {
        return kmPercorrido;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public boolean iniciarViagem(Veiculo veiculo) {
        if (veiculo.getStatus() == 'D') {
            this.dataInicial = new Date();
            veiculo.registrarViagem();
            this.veiculo = veiculo;
            return true;
        } else {
            return false;
        }
    }

    public int calcularKmPercorrido(int kmOdometro) {
        return kmOdometro - veiculo.getKmOdometro();
    }

    public void finalizarViagem(int kmOdometro) {
        this.dataFinal = new Date();
        this.kmPercorrido = calcularKmPercorrido(kmOdometro);
        veiculo.registrarRetorno(kmOdometro);
    }
}