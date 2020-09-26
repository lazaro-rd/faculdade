import java.util.Scanner;

public class Veiculo {

	private String modelo;
	private String placa;
	private int ano;
	private double valor;	

	public Veiculo(){}

	public Veiculo(String modelo, String placa, int ano, double valor) {
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void depreciarValor(){
		Scanner i = new Scanner(System.in);
		System.out.println("Indique a taxa de depreciacao(em %)");
		int taxa = i.nextInt();
		this.valor = this.valor*taxa/100;
	}	
	
	public void imprimirDados(){
		String i = "Modelo: " + getModelo() +
		           "\nPlaca: " + getPlaca() +
		           "\nAno: " + getAno()	+
		           "\nValor: " + getValor();
		System.out.println(i);
	}
}
