class Motor {

}

class Carro {
	int ano = 1567;
	char primeiraLetra;
	boolean usado;
	Motor motor;
	String marca;
}

public class Teste {

	public static void main(String[] agrs) {

		char sete = '\u03A9';
		System.out.println(sete + "<-- aqui ele");

		boolean bonitão567345567543673 = true;
		boolean ricão$$$$$$;
		boolean bonito_e_rico = false;
		boolean bonitoERico;
		boolean $valor;
		boolean _valor;

		int idade = 1;
		int IDADE = 2;
		int Idade = 3;

		boolean valor = true;

		long x2 = 1_234_567_891_234l;
		System.out.println(x2);

		int x = 0xF__________F;
		System.out.println(x);

		double v = 10.2;
		long l = 13l;
		float f = 13.1f;

		double d2 = 3.1E2;
		System.out.println(d2);

		float f2 = 2e3f;
		System.out.println(f2);

		int i = 0b1___00;
		System.out.println(i);

		String[] valores = new String[10];
		System.out.println(valores[0]);

		Carro carro = new Carro();
		System.out.println(carro.ano);
		System.out.println(carro.primeiraLetra == 0);
		System.out.println(carro.usado);
		System.out.println(carro.motor);
		System.out.println(carro.marca);

		int idade = 15;
		System.out.println(idade);
	}
}