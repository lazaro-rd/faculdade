public class Quadrado extends FormaBi {

	private double a;//área

	public Quadrado() {}

	public Quadrado(double l) {
		setL(l);
	}

	public double obterArea() {
		setA(Math.pow(getL(), 2));
		return getA();
	}
	
}
