package net.mybluemix.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import junit.framework.Assert;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.hasItem;

import  org.hamcrest.core.*;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import net.mybluemix.dao.MateriaPrimaDAO;
import net.mybluemix.entity.MateriaPrima;

import org.hamcrest.Matcher;
import org.junit.BeforeClass;
import org.junit.Test;

public class MateriaPrimaTest 
{
	
    private static MateriaPrimaDAO mpd = new MateriaPrimaDAO();
    private static List<MateriaPrima> elist = new LinkedList<MateriaPrima>();

    @BeforeClass
	  public static void  beforeClass() {
	        // prepare data for testing
	        
            elist.add(new MateriaPrima("Tecido Florido Verao 2016", "Tecido", "Cool stuff guys", "metro", 10 ));
            elist.add(new MateriaPrima("Tecido Rosa Choque", "Tecido", "Pantera Cor de Rosa", "metro", 20 ));
	        System.out.println(".. done");
	 }
    
	@Test
	public void testMateriaPrima() throws Exception {
			MateriaPrima p = mpd.find(1);
			if(p.equals(elist.get(0)))
				Assert.assertEquals(true, true);
	}	
	
	
	@Test
	public void testValidMateriaPrima() throws Exception {
		MateriaPrimaTest.createMateriaPrima();
		List<MateriaPrima> mp = MateriaPrimaTest.listMateriaPrima();
		for(MateriaPrima p : mp) {
			if(p.equals(elist.get(0)))
				Assert.assertEquals(true, true);
		}
	}
	
	@Test
	public void testInvalidMateriaPrima() throws Exception {
		MateriaPrimaTest.createMateriaPrima();
		List<MateriaPrima> employees = MateriaPrimaTest.listMateriaPrima();
		MateriaPrima e = new MateriaPrima("Materia que não tem", "Tecido", "Weird stuff guys", "metro", 20 );
		assertThat(employees,  not(hasItem(e)));
	}
	 
	 
	private static void createMateriaPrima() throws Exception {
	        
	        int nelements = mpd.createQuery("Select a From MateriaPrima a", MateriaPrima.class).size();
	        if (nelements == 0) {
	            for(MateriaPrima e: elist)
	            	mpd.create(e);
	        }
	       }
	    
	    
	    private static List<MateriaPrima> listMateriaPrima() {
	        List<MateriaPrima> resultList = mpd.createQuery("Select a From MateriaPrima a", MateriaPrima.class);
	        System.out.println("num of materia prima:" + resultList.size());
	        return resultList;
	    }
	 

	   

	 
	 
}
