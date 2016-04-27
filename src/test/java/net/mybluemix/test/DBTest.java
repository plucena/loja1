package net.mybluemix.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.mybluemix.entity.Department;
import net.mybluemix.entity.Employee;

import org.junit.BeforeClass;
import org.junit.Test;

public class DBTest {
    private static EntityManager manager;

	@Test
	public void test() {
		DBTest.createEmployees();
		DBTest.listEmployees();
		fail("Not yet implemented");
	}

	
	 @BeforeClass
	  public static void  beforeClass() {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
	        manager = factory.createEntityManager();
	        System.out.println(".. done");
	    }
	 
	    private static void createEmployees() {
	        EntityTransaction tx = manager.getTransaction();
	        tx.begin();
	    
	        int numOfEmployees = manager.createQuery("Select a From Employee a", Employee.class).getResultList().size();
	        if (numOfEmployees == 0) {
	            Department department = new Department("java");
	            manager.persist(department);
	 
	            manager.persist(new Employee("Jakab Gipsz",department));
	            manager.persist(new Employee("Captain Nemo",department));
	        }
	        tx.commit();
	    }
	    
	    
	    private static  void listEmployees() {
	        List<Employee> resultList = manager.createQuery("Select a From Employee a", Employee.class).getResultList();
	        System.out.println("num of employess:" + resultList.size());
	        for (Employee next : resultList) {
	            System.out.println("next employee: " + next);
	        }
	    }
	 
	 
	 
	 
}
