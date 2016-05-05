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
import net.mybluemix.entity.MateriaPrima;

import org.hamcrest.Matcher;
import org.junit.BeforeClass;
import org.junit.Test;

public class MateriaPrimaTest 
{
	
    private static EntityManager manager;
    private static List<MateriaPrima> elist = new LinkedList<MateriaPrima>();

    @BeforeClass
	  public static void  beforeClass() {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
	        manager = factory.createEntityManager();
	        // prepare data for testing
	        
            elist.add(new MateriaPrima("Tecido Florido Verao 2016", "Tecido", "Cool stuff guys", "metro", 10, "2016-10-15", "2016-10-29" ));
            elist.add(new MateriaPrima("Tecido Rosa Choque", "Tecido", "Pantera Cor de Rosa", "metro", 20, "2016-10-09", "2016-11-03" ));
	        System.out.println(".. done");
	 }
    
	@Test
	public void testValiEmployees() {
		MateriaPrimaTest.createEmployees();
		List<MateriaPrima> employees = MateriaPrimaTest.listMateriaPrima();
		assertThat(employees, (Matcher) hasItem(elist.get(0)));
		assertThat(employees, (Matcher) hasItem(elist.get(0)));
	}	
	
	@Test
	public void testInvaliEmployees() {
		MateriaPrimaTest.createEmployees();
		List<MateriaPrima> employees = MateriaPrimaTest.listMateriaPrima();
		MateriaPrima e = new MateriaPrima("Materia que não tem", "Tecido", "Weird stuff guys", "metro", 20, "2016-10-09", "2016-11-03" );
		assertThat(employees,  not(hasItem(e)));
	}
	 
	 
	    private static void createEmployees() {
	        EntityTransaction tx = manager.getTransaction();
	        tx.begin();
	    
	        int nelements = manager.createQuery("Select a From MateriaPrima a", MateriaPrima.class).getResultList().size();
	        if (nelements == 0) {
	            for(MateriaPrima e: elist)
	            	manager.persist(e);
	        }
	        tx.commit();
	    }
	    
	    
	    private static List<MateriaPrima> listMateriaPrima() {
	        List<MateriaPrima> resultList = manager.createQuery("Select a From MateriaPrima a", MateriaPrima.class).getResultList();
	        System.out.println("num of employess:" + resultList.size());
	        return resultList;
	    }
	 
	 
	 
	 
}
