
public class Veiculo {
private int idVeiculo;
private String placa;
private char status;
private int kmOdometro;

public int getIdVeiculo() {
	return idVeiculo;
}
public String getPlaca() {
	return placa;
}
public char getStatus() {
	return status;
}
public int getKmOdometro() {
	return kmOdometro;
}

public void setStatus(char status) {
	this.status = status;
}

public void setKmOdometro(int kmOdometro) {
	this.kmOdometro = kmOdometro;
}
public Veiculo(int idVeiculo, String placa, int kmOdometro) {
	this.idVeiculo = idVeiculo;
	this.placa = placa;
	this.status = 'D';
	this.kmOdometro = kmOdometro;
}

public void registrarViagem() {
this.status = 'V';
}
public void registrarRetorno(int kmOdometro) {
	this.status='D';
	this.kmOdometro = kmOdometro;
	
}
public void revisar() {
	this.status='M';
}


}
