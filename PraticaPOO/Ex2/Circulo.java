public class Circulo extends FormaBi {

	public Circulo() {}

	public Circulo(double r) {
		setR(r);
	}

	public double obterArea() {
		setA(Math.pow(getR(), 2) * Math.PI);
		return getA();
	}
	
}
