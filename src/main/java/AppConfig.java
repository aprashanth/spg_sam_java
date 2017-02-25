import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spg.repository.CustomerRepository;
import com.spg.repository.HibernateCutomerRepositoryImpl;
import com.spg.service.CustomerService;
import com.spg.service.CustomerServiceImpl;

@Configuration
@ComponentScan("com.spg")
@PropertySource("app.properties")
public class AppConfig {
	
	public PropertyPlaceholderConfigurer getPropertyPlaceHolderConfigurer(){
		return new PropertyPlaceholderConfigurer();
	}
	
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService(){
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		//CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
////		customerService.setRepo(getCustomerRepository());
//		
//		return customerService; 
//	}
//	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCutomerRepositoryImpl();
//	}
	

}
