package consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpdateProduct {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IntegrationService service = applicationContext.getBean(IntegrationService.class);
		Product product = new Product();
		product.setArticleId(128);
		product.setTitle("3aa");
		product.setCategory("cameara111");

		String status = service.updateProduct(product);

		System.out.println(status);

	}
}
