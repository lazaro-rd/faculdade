public class Main {
	
	public static void main(String[] args){
		
		Circulo c = new Circulo(10);
		Quadrado q = new Quadrado(10);
		Triangulo t = new Triangulo(10,10);
		Esfera esf = new Esfera(10);
		Cubo cub = new Cubo(10);
		Tetraedro tet = new Tetraedro(10, 10);

		Forma[]form = new Forma[6];
		
		form[0] = c;
		form[1] = q;
		form[2] = t;
		form[3] = esf;
		form[4] = cub;
		form[5] = tet;

		for(int i=0; i<6; i++){
			if(form[i] instanceof FormaTri){
				System.out.println("Area da forma tridimensional: " + form[i].obterArea());
				System.out.println("Volume da forma tridimensional: " + form[i].obterVolume());
			}else {
				System.out.println("Area da forma bidimensional: " + form[i].obterArea());
			}
		}
	}
}
