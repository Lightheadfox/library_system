package lightheadfox.ru.library_system.web.rest;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BookController}.
 */
@Generated
public class BookController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'bookController'.
   */
  public static BeanDefinition getBookControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BookController.class);
    beanDefinition.setInstanceSupplier(BookController::new);
    return beanDefinition;
  }
}
