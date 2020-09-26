public class Carro extends Veiculo {

	private int numeroPortas;
	private String combustivel;

	public Carro(){}

	public Carro(String modelo, String placa, int ano, double valor, int numeroPortas, String combustivel) {
		super(modelo, placa, ano, valor);
		this.numeroPortas = numeroPortas;
		this.combustivel = combustivel;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void imprimirDados(){
		String i = "Modelo: " + getModelo() +
		           "\nPlaca: " + getPlaca() +
		           "\nAno: " + getAno()	+
		           "\nValor: " + getValor() +
			   "\nNumero de Portas: " + getNumeroPortas() +
			   "\nCombustivel: " + getCombustivel();
		System.out.println(i);
	}
}
