/*
 * Compila e roda, imprimindo de 0 até 19 e depois 15. 
 * Repare que a variável i declarada no for, só é visível dentro do for,
 * por isso podemos declará-la novamente logo em seguida.
 * 
 */

class Teste {
	public static void main(String[] agrs) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		int i = 15;
		System.out.println(i);
	}
}