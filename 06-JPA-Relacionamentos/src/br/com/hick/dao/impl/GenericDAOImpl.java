package br.com.hick.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.hick.dao.generic.GenericDAO;
import br.com.hick.excecao.CommitException;
import br.com.hick.excecao.NotFoundException;

public abstract class GenericDAOImpl<T,K> implements GenericDAO<T,K> {
	EntityManager em;
	private Class<T> clazz; 
	
	
	
	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		super();
		this.em = em;
		this.clazz = (Class<T>) ((ParameterizedType) 
				getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}

	@Override
	public void create(T entity) {
	em.persist(entity);
		
	}

	@Override
	public T read(K key) throws NotFoundException {
		T entity = em.find(clazz, key);
		
		if (entity == null) {
			throw new NotFoundException();
		}
		return entity;
	}

	@Override
	public void update(T entity) {
		em.merge(entity);
	
	}

	@Override
	public void delete(K key) throws NotFoundException {
		
		em.remove(read(key));
		
	}

	@Override
	public void commit() throws CommitException {
		
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CommitException();
			
			}
		
	}

}
