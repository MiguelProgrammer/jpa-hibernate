package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(1,"Miguel Silva","miguel.silva@mackenzie.br");
		Pessoa pessoa2 = new Pessoa(2,"Miguel Pereira da Silva","miguel.silva@mackenzista.com.br");
		Pessoa pessoa3 = new Pessoa(3,"Jessica Silva","jessica.silva@mackenzie.br");

		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}

}
