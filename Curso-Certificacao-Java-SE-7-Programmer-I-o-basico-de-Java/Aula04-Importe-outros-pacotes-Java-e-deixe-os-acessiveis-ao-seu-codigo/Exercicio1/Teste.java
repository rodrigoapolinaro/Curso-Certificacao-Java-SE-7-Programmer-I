import modelo.Cliente.*;

//Ocorre um erro de compilação na classe Teste 
//ao tentar importar uma classe não acessível a outros pacotes.

class Teste {
	public static void main(String[] args) {
		new Cliente("rodrigo").imprime();
	}
}