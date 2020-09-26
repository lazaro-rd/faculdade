public class Caminhao extends Veiculo {

	private double capacidade;
	private int numeroEixos;

	public Caminhao(){}

	public Caminhao(String modelo, String placa, int ano, double valor, double capacidade, int numeroEixos) {
		super(modelo, placa, ano, valor);
		this.capacidade = capacidade;
		this.numeroEixos = numeroEixos;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public int getNumeroEixos() {
		return numeroEixos;
	}

	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}
	
	public void imprimirDados(){
		String i = "Modelo: " + getModelo() +
		           "\nPlaca: " + getPlaca() +
		           "\nAno: " + getAno()	+
		           "\nValor: " + getValor() +
			   "\nCapacidade: " + getCapacidade() +
			   "\nNumero de Eixos: " + getNumeroEixos();
		System.out.println(i);
	}
}
