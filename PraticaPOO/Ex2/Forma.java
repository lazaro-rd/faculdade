public class Forma {

	private double h;//altura
	private double l;//largura
	private double r;//raio
	private double a;//area
	private double v;//volume

	public Forma() {}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double obterArea(){
		return this.a;
	}
	public double obterVolume(){
		return this.v;
	}
}
