package fr.afcepf.atod.business.customer.test;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod.business.customer.api.IBuCustomer;
import fr.afcepf.atod.vin.data.exception.WineException;

public class BuTest {
	private static Logger log = Logger.getLogger(BuTest.class);

	public static void main(String[] args) throws WineException {
		@SuppressWarnings("resource")
		BeanFactory bf = new ClassPathXmlApplicationContext("classpath:springBuCustomer.xml");
		IBuCustomer bu = (IBuCustomer) bf.getBean(IBuCustomer.class);
		
		/*Country country = new Country(null, "TE", "test");
		Customer test = new Customer(null, "test", "test", new Date(), "test", "test", "test", "test", new Date(), new Date(), Civility.MISS, true);
		
		test =bu.addNewCustomer(test);*/
		
		
		
		//		List<City> list = new ArrayList<City>();
//		list = bu.findAllCities();
//		for (City city : list) {
//			log.info("99999999"+city.getZipcode());
//		}
	}

}
