package edu.hnit.action;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.hnit.dao.PersonDao;


public class TestAction {
	ApplicationContext apt = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testXML() {
		DataSource source = (DataSource) apt.getBean("datasource");
		System.out.println(source);
	}
	@Test
	public void testPersonDao() {
		System.out.println((int) (Math.abs(Math.random() * 1000)));
	}
	@Test
	public void testPersons() {
	  
	}

}
