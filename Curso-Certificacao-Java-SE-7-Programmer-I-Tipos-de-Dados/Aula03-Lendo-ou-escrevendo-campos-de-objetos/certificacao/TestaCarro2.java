class Carro {
	String modelo;
	int ano;

	public Carro() {
		modelo = "Indefinido";	// acessando variável de
								// instância sem o this
		this.ano = 2014;				// acessando com o this.
	}

	public String getDadosDeImpressao() {
		return modelo + "::" + ano;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}
}

class TestaCarro2 {
	public static void main(String[] args) {
		Carro a = new Carro();
		a.modelo = "Palio"; // acessando diretamente o atributo
		a.setModel("Palio"); // acessando o atributo por método

		// acessando o método e passando o retorno como argumento para
		// o método println
		System.out.println(a.getDadosDeImpressao());
	}

}