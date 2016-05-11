package net.mybluemix.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.mybluemix.entity.Fornecedor;



public class BaseDAO<T>{

    protected EntityManager manager;
	private Class<T> _classType;

    
    public BaseDAO(Class<T> classType) {
		_classType = classType; 
    	this.connect();
    }

    private void connect() {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        manager = factory.createEntityManager();
    }
    
    public void create(Object beanObject) throws Exception {
    	EntityTransaction tx = manager.getTransaction();
    	tx.begin();
    	manager.persist(beanObject);
    	tx.commit();
    }	
    
    public void update(Object f, Object key) throws Exception {
    	EntityTransaction tx = manager.getTransaction();
    	tx.begin();
    	Object fbd = manager.find(_classType, key);
    	fbd = f;
    	tx.commit();
    }
    	
    
    public List<T> createQuery(String SQL, Class c) {
    	 return  manager.createQuery(SQL, c).getResultList();
    }
    
    public T createSingleQuery(String SQL, Class c) {
   	 return  (T) manager.createQuery(SQL, c).getSingleResult();
    }
    
}