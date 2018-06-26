class Teste1 {

	// Declaração
	int idadade;

	System.out.println(idade); // erro de compilação

	// ------------------------------------------------- //

	// Declaração
	int idade;

	// Inicialização explícita de uma variável
	idade = 10;

	// Utlização da variávael
	System.out.println(idade); // ok

	// ------------------------------------------------- //

	// Declaração e inicialização explíxita na mesma linha
	double pi = 3.14;

	// ------------------------------------------------- //

	void metodo(int a) {
		double x;
		if (a > 1) {
			x = 6;
		}
		System.out.println(x); // talvez x não tenha sido 
								// inicializado, portanto não compila

		// ------------------------------------------------- //
	}
}

class Prova {
	double tempo;
}

// Implicitamente, na criação de um objeto Prova,
// o atributo tempo é iniciado com 0
Prova prova = new Prova();

// Utilização do atributo tempo
System.out.println(prova.tempo);

// ------------------------------------------------- //

int [] numeros = new int[10];
System.out.println(numeros[0]); // imprime 0

// ------------------------------------------------- //

// compila pois 737821237891232 é um double válido
System.out.println(737821237891232d);

// compila pois 737821237891232 é um long válido
System.out.println(737821237891232l);

// não compila pois 737821237891232 é um valor maior que
// o int aceito
System.out.println(737821237891232);

// ------------------------------------------------- //

// compila pois 737821237891232l é um long válido
long l = 737821237891232l;

// não compila pois o compilador não é bobo assim
int i = l;

// ------------------------------------------------- //

// booleanos
System.out.println(true); // booleano verdadeiro
System.out.println(false); // booleano falso

// números simples são considerados inteiros
System.out.println(1); // int

// números com casa decimal são considerados double.
// Também podemos colocar uma letra "D" ou "d" no final
System.out.println(1.0); // double
System.out.println(1.0D); // double

// números inteiros com a letra "L" ou "l"
// no final são considerados long.
System.out.println(1L); // Long

// números com casa decimal com a letra "F" ou "f"
// no final são considerados float.
System.out.println(1.0F); // float

// ------------------------------------------------- //

int i = 0761; // base octal
System.out.println(i); // saída: 497

int j = 0xAB3400; // base hexadecimal
System.out.println(j); // saída: 1121996B

int b = 0b100001011; // base binária
System.out.println(b); // saída : 267

int i 0769; // erro, base octal não pode usar 9

// ------------------------------------------------- //

double d = 3.1E2;;
System.out.println(d); // 310.0

float e = 2e3f;
System.out.println(e); // 2000.0

float f = 1E4F;
System.out.println(f); // 10000.0

// ------------------------------------------------- //

int a = 123_456_789;

// ------------------------------------------------- //

int v1 = 0_100_267_760;	// ok
int v2 = 0_x_4_13;		// erro, _ antes e depois do x
int v3 = 0b_x10_BA_75;	// erro, _ depois do b
int v4 = 0b_1000_10_11	// erro, _ depois do b
int v5 = 0xa10_AF_75;	// ok, apesar de ser letra
						// representa dígito
int v6 = _123_314; 		// erro, inicia com _
int v7 = 123_432_; 		// erro, termina com _
int v8 = 0x1_0A0_11; 	// ok
int v9 = 144__21_12; 	// ok

// ------------------------------------------------- // 

double d1 = 345.45_e3;        // erro, _ antes do e
double d2 = 345.45e_3;        // erro, _ depois do e
double d3 = 345.4_5e3;        // ok
double d4 = 34_5.45e3_2;    // ok
double d5 = 3_4_5.4_5e3;    // ok
double d6 = 345._45F;        // erro, _ depois do .
double d7 = 345_.45;        // erro, _ antes do .
double d8 = 345.45_F;        // erro, _ antes do indicador de 
                            // float
double d9 = 345.45_d;        // erro, _ antes do indicador de 
                            // double

// ------------------------------------------------- // 

char c = 'A';

char c = 65;
System.out.println(c); // imprime A

char sete = 7; // número, pois não está entre aspas simples
System.out.println(sete);  // Não imprime nada!!!!

char c = '\u03A9'; // unicode
System.out.println(c); // imprime a letra grega ômega

// ------------------------------------------------- // 

int umNome; // ok
int umnome;    // ok, diferente do anterior
int _num;    // ok
int $_ab_c; // ok
int x_y;    // ok
int false;    // inválido, palavra reservada
int x-y;     // inválido, traço
int 4num;     // inválido, começa com número
int av#f;     // inválido, #
int num.spc; // inválido, ponto no meio









































