class Teste {

	int a = 10;
	int b = a;	// copiando o valor de a para b
	b++; // somando 1 em b
	System.out.println(a); // continua com 10
}

// --------------------------------------------------- //

class Objeto {
	int valor;
}

class Teste {
	public static void main(String args[]) {
		Objeto a new = Objeto();
		Objeto b = a; // agora b aponta para o mesmo objetpde a

		a.valor = 5;

		System.out.println(b.valor); // imprime 5

	}
}

// --------------------------------------------------- //

Objeto a = new Objeto();
a.valor = 5;

Objeto b = new Objeto();
b.valor = 5;

Objeto c = a;

System.out.println(a == b); // false
System.out.println(a == c); // true















