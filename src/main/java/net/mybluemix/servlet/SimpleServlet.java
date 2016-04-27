package net.mybluemix.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mybluemix.dao.BaseDAO;
import net.mybluemix.dao.DepartmentDAO;
import net.mybluemix.dao.EmployeeDAO;
import net.mybluemix.entity.Department;
import net.mybluemix.entity.Employee;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    EmployeeDAO edao = new EmployeeDAO();
    DepartmentDAO ddao = new DepartmentDAO();
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	    	
    	
    	this.createEmployees();
    	
	List<Employee> resultList =  this.listEmployees();
	String listemployees = "Employees <BR><BR>";

	for (Employee e : resultList) {
    		listemployees += e + "<BR>"	

    	System.out.println(".. done");
    	
    	
    	response.setContentType("text/html");
        response.getWriter().print(listemployees);
        

}



private void createEmployees() {
//int numOfEmployees = manager.createQuery("Select a From Employee a", Employee.class).getResultList().size();
//if (numOfEmployees == 0) {
	try {
    Department department = new Department("java");
    ddao.create(department);
    System.out.println("Saving dept");
    edao.create(new Employee("Jakab Gipsz",department));
    edao.create(new Employee("Captain Nemo",department));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
//}
}

private List<Employee> listEmployees() {
List<Employee> resultList = (List<Employee>) edao.createQuery("Select a From Employee a", Employee.class);
return resultList;
}

}

