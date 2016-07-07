package spring.mistery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import spring.mistery.service.IExampleService;

public class SpringBeanMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml" });
//		nameg
//		MetadataReaderFactory
		IExampleService service = (IExampleService) context.getBean("abc");
		service.say();
		org.springframework.jdbc.datasource.DataSourceTransactionManager transactionManager = null;

		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = transactionManager.getTransaction(def);
	}

}
