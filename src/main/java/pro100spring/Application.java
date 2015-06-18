package pro100spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*@Configuration
@ComponentScan
public class Application {

	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			
			@Override
			public String getMessage() {
				return "Hello World!";
			}
		};
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
	}
}*/
