package br.com.brunoyamada.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.brunoyamada.project.entities.Category;
import br.com.brunoyamada.project.entities.Order;
import br.com.brunoyamada.project.entities.User;
import br.com.brunoyamada.project.entities.enums.OrderStatusEnum;
import br.com.brunoyamada.project.repositories.CategoryRepository;
import br.com.brunoyamada.project.repositories.OrderRepository;
import br.com.brunoyamada.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Bruno Yamada", "bruno@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Lauren Yamada", "lauren@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2023-10-20T19:53:07Z"), OrderStatusEnum.DELIVERED, u1);
		Order o2 = new Order(null, Instant.parse("2023-10-21T03:42:10Z"), OrderStatusEnum.CANCELED, u2);
		Order o3 = new Order(null, Instant.parse("2023-11-22T15:21:22Z"), OrderStatusEnum.PAID, u1); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	

}
