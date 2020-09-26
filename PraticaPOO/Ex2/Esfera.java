public class Esfera extends FormaTri {

	public Esfera() {}

	public Esfera(double r) {
		setR(r);
	}

	public double obterArea() {
		setA(Math.pow(getR(), 2) * Math.PI * 4);
		return getA();
	}

	public double obterVolume() {
		setV((Math.pow(getR(), 3) * Math.PI * 4)/3);
		return getV();
	}
	
}
