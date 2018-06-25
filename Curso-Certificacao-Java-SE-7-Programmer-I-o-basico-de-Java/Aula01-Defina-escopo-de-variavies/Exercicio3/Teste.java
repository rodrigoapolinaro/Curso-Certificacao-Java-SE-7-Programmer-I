/*
 * Compila e imprime os números de 10 até 99.
 * Isso porque o acesso à variável estática pode 
 * ser feito através da instância da classe ou diretamente 
 * caso seja uma variável estática sendo acessada por um método estático.
 *
 */

class Teste {
	static int i = 3;
	public static void main(String[] a) {
		for (new Teste().i = 10; new Teste().i < 100; 
			new Teste().i++) {
			System.out.println(i);
		}
	}
}