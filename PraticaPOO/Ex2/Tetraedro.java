public class Tetraedro extends FormaTri {

	public Tetraedro() {}

	public Tetraedro(double l, double h) {
		setL(l);
		setH(h);
	}

	public double obterArea() {
		setA(Math.pow(getL(), 2) * Math.sqrt(3));
		return getA();
	}

	public double obterVolume() {
		setV((Math.pow(getL(), 3) * Math.sqrt(2))/12);
		return getV();
	}
	
}
