package net.mybluemix.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.hasItem;
import  org.hamcrest.core.*;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.not;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import net.mybluemix.entity.Department;
import net.mybluemix.entity.Employee;

import org.hamcrest.Matcher;
import org.junit.BeforeClass;
import org.junit.Test;

public class DBTest 
{
	
    private static EntityManager manager;
    private static List<Employee> elist = new LinkedList<Employee>();
    private static Department department  = new Department("java");

    @BeforeClass
	  public static void  beforeClass() {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
	        manager = factory.createEntityManager();
	        // prepare data for testing
            elist.add(new Employee("Jakab Gipsz",department));
            elist.add(new Employee("Captain Nemo",department));
	        System.out.println(".. done");
	 }
    
	@Test
	public void testValiEmployees() {
		DBTest.createEmployees();
		List<Employee> employees = DBTest.listEmployees();
		assertThat(employees, (Matcher) hasItem(elist.get(0)));
		assertThat(employees, (Matcher) hasItem(elist.get(0)));
	}	
	
	@Test
	public void testInvaliEmployees() {
		DBTest.createEmployees();
		List<Employee> employees = DBTest.listEmployees();
		Employee e = new Employee("nulo",department);
		assertThat(employees,  not(hasItem(e)));
	}
	 
	 
	    private static void createEmployees() {
	        EntityTransaction tx = manager.getTransaction();
	        tx.begin();
	    
	        int numOfEmployees = manager.createQuery("Select a From Employee a", Employee.class).getResultList().size();
	        if (numOfEmployees == 0) {
	            manager.persist(department);
	            for(Employee e: elist)
	            	manager.persist(e);
	        }
	        tx.commit();
	    }
	    
	    
	    private static List<Employee> listEmployees() {
	        List<Employee> resultList = manager.createQuery("Select a From Employee a", Employee.class).getResultList();
	        System.out.println("num of employess:" + resultList.size());
	        return resultList;
	    }
	 
	 
	 
	 
}
