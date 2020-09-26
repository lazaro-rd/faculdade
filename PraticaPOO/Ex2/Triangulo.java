public class Triangulo extends FormaBi {

	public Triangulo() {}

	public Triangulo(double l, double h) {
		setL(l);
		setH(h);
	}

	public double obterArea() {
		setA((getL() * getH())/2);
		return getA();
	}
	
}
