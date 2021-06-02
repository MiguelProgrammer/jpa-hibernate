package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

//		Pessoa pessoa1 = new Pessoa(null, "Miguel Silva", "miguel.silva@mackenzie.br");
//		Pessoa pessoa2 = new Pessoa(null, "Miguel Pereira da Silva", "miguel.silva@mackenzista.com.br");
//		Pessoa pessoa3 = new Pessoa(null, "Jessica Silva", "jessica.silva@mackenzie.br");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplojpa");
		EntityManager em = emf.createEntityManager();
		
		//transação com o banco 
//		em.getTransaction().begin();
//		em.getTransaction().commit();
		
		//buscando
		//Pessoa p = em.find(Pessoa.class, 2);
		
		/*
		 * Para remoção, é necessário buscar o dado para então realizar a operação remove.
		 * Procedimento conhecido como Entidade Monitorada
		 */
		
		Pessoa p = em.find(Pessoa.class, 1);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println(p);
		
		System.out.println("Pronto");
		em.close();
		emf.close();
	}

}
