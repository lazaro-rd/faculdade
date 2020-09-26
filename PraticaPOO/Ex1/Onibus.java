public class Onibus extends Veiculo {

	private int qtdePassageiros;

	public Onibus(){}

	public Onibus(String modelo, String placa, int ano, double valor, int qtdePassageiros) {
		super(modelo, placa, ano, valor);
		this.qtdePassageiros = qtdePassageiros;
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}
	
	public void imprimirDados(){
		String i = "Modelo: " + getModelo() +
		           "\nPlaca: " + getPlaca() +
		           "\nAno: " + getAno()	+
		           "\nValor: " + getValor() +
			   "\nQuantidade de Passageiros: " + getQtdePassageiros();
		System.out.println(i);
	}
}
