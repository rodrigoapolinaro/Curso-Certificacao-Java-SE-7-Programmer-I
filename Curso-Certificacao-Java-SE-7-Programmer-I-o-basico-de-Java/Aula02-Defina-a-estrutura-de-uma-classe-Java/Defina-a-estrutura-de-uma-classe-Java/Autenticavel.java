/*
 * Além de classes, também podemos declarar interfaces em nossos arquivos java. 
 * Para definir uma interface usamos a palavra reservada interface:
 *
 */

interface Autenticavel {

	final int TAMANHO_SENHA = 8;

	void autentica(String login, String senha);
}