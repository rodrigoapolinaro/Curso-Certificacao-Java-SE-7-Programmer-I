class ObjetoMeu {
	int valor;
}

class TesteReferencia {
	public static void main(String... args) {

		ObjetoMeu o1 = new ObjetoMeu();
		o1.valor = 10;
		ObjetoMeu o2 = o1;

		o1.valor = o1.valor + 5;

		System.out.println(o1.valor);
		System.out.println(o2.valor);

		int a = 10;
		int b = a;

		a = a + 5;

		System.out.println(a);
		System.out.println(b);
	}
}