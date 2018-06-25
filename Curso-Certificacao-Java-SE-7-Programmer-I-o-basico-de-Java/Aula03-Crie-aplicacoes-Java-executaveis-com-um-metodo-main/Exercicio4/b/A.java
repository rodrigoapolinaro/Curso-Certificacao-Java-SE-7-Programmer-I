package b;

/*
 * Para rodar um programa dentro de um jar sem ter um manifesto, 
 * devemos usar o classpath customizado. Colocamos o jar no classpath 
 * e dizemos qual classe desejamos rodar: java -cp programa.jar b.A.
 *
 */

class A {
	public static void main(String[] args) {
		System.out.println(args[0]);
	}
}