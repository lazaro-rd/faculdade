public class Main {

    public static void main(String[] args) {
        Veiculo veic= new Veiculo("Fiat", "AAA-000", 2020, 20500);
	Carro car= new Carro("Fusca", "BBB-111", 2019, 15000, 2, "Gasolina");
	Onibus oni= new Onibus("Mercades", "CCC-222", 2018, 30000, 50);
	Caminhao cam= new Caminhao("Volvo", "DDD-333", 2017, 35000, 1000, 3);
	System.out.println("---===Veiculo===---");
        veic.imprimirDados();
	System.out.println("---===Carro===---");
	car.imprimirDados();
	System.out.println("---===Onibus===---");
	oni.imprimirDados();
	System.out.println("---===Caminhao===---");
	cam.imprimirDados();
    }
    
}
