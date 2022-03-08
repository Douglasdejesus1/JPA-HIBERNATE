package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		/*Pessoa p1 = new Pessoa(null, "Douglas","douglas@gmail.com");
		Pessoa p2 = new Pessoa(null, "Flavia","flavia@gmail.com");
		Pessoa p3 = new Pessoa(null, "Rodrigo","rodrigo@gmail.com");*/
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		em.getTransaction().begin();
		Pessoa p =em.find(Pessoa.class, 2);
		em.remove(p);
		System.out.println("Pronto!");
		em.getTransaction().commit();
		
		
		
		em.close();
		emf.getClass();

	}

}
