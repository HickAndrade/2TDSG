package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
public static void main(String[] args) {
	//Criar um gerenciador de entidades(Enity Manager)
	//Primeiro riar a fabrica de entity manager
	
	//PERSISTENCE.XML
	
	
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
	
	em.close();
	fabrica.close();
}

}
