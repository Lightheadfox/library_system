package lightheadfox.ru.library_system.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BookServiceImpl}.
 */
@Generated
public class BookServiceImpl__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'bookServiceImpl'.
   */
  public static BeanDefinition getBookServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BookServiceImpl.class);
    beanDefinition.setInstanceSupplier(BookServiceImpl::new);
    return beanDefinition;
  }
}
