package consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CreateProduct {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IntegrationService service = applicationContext.getBean(IntegrationService.class);

		//
		Product product = new Product();
		product.setArticleId(128);
		product.setTitle("3a");
		product.setCategory("cameara11");

		String status = service.createProduct(product);

		System.out.println(status);

	}
}
