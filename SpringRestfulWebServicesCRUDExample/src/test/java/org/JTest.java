package org;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.arpit.java2blog.service.CountryService;
import org.arpit.java2blog.service.Adder;
import org.arpit.java2blog.bean.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(MockitoJUnitRunner.class)
@Configuration
public class JTest {
   @Autowired
   public void create() {
//	   cs = mock(CountryService.class);
//	   when(cs.getCountry(1).getCountryName()).thenReturn("Canada");
//	   when(cs.getCountry(4).getCountryName()).thenReturn("China");	 
//	   cs = new CountryService();
   }
	
   @Test
   public void testAdd() {

	   Adder adder = mock(Adder.class); 
	   when(adder.add(1,1)).thenReturn(2);
	   assertEquals(2, adder.add(1,1));

   }
   @Test
   public void testGetDisplayName() {
	   
	   CountryService cs;  
	   cs = new CountryService();
	   
	   String ctry = "";

	   ctry = cs.getCountry(1).getCountryName();
	   System.out.println("ctry = " + ctry);
       assertEquals("Canada", ctry);
//       assertEquals("Can", ctry);
	   ctry = cs.getCountry(4).getCountryName();
	   System.out.println("ctry = " + ctry);
       assertEquals("China", ctry);
//      added test  
	   ctry = cs.getCountry(5).getCountryName();
	   System.out.println("ctry = " + ctry);
       assertEquals("Chile", ctry);
   }
}
