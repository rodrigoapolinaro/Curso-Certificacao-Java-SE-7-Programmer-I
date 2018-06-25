package b;

import a.A;
static import a.A.*;

//import static é o uso adequado, e não static import, erro na linha 3.

class B {
	void m() {
		A a = new A();
		a.executa(VALOR);
	}
}