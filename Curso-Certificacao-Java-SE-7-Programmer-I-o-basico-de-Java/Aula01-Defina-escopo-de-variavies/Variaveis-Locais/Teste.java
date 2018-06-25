public class Teste {
    
    public void m1() { // inicio do bloco do metódo
        int x = 10; // variável local do método
        
        if (x >= 10) { // início do bloco do if
            int y = 50; // variável local do if
            System.out.println(y);
        } // fim do bloco do if
    } // fim do bloco do método
    
	public static void main(String[] args) {
        Teste t = new Teste();
        t.m1();
	}

}

