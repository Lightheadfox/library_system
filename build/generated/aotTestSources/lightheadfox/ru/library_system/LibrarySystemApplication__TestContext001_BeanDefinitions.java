package lightheadfox.ru.library_system;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link LibrarySystemApplication}.
 */
@Generated
public class LibrarySystemApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'librarySystemApplication'.
   */
  public static BeanDefinition getLibrarySystemApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LibrarySystemApplication.class);
    beanDefinition.setTargetType(LibrarySystemApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(LibrarySystemApplication.class);
    beanDefinition.setInstanceSupplier(LibrarySystemApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
