public class Cubo extends FormaTri {

	public Cubo() {}

	public Cubo(double l) {
		setL(l);
	}

	public double obterArea() {
		setA(Math.pow(getL(), 2) * 6);
		return getA();
	}

	public double obterVolume() {
		setV(Math.pow(getL(), 3));
		return getV();
	}
	
}
