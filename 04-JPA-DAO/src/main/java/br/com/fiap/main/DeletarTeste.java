package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ImovelDAO;
import br.com.fiap.dao.impl.ImovelDAOImpl;
import br.com.fiap.entity.Imovel;
import br.com.fiap.excecao.SearchNotFoundException;

public class DeletarTeste {
public static void main(String[] args) {
	
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
	
	
	ImovelDAO dao = new ImovelDAOImpl(em);
	
	
	try {
		dao.remover(1);
		dao.commit();
		
	} catch (SearchNotFoundException e) {
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
}
}
