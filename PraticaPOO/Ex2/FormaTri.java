public class FormaTri extends Forma {

	private double a;//área
	private double v;//volume

	public FormaTri() {}

	public double getA() {
		return this.a;
	}

	public void setA(double i) {
		this.a = i;
	}

	public double getV() {
		return this.v;
	}

	public void setV(double i) {
		this.v = i;
	}


	public double obterArea() {
		return this.a;
	}

	public double obterVolume() {
		return this.v;
	}
	
}
