package lightheadfox.ru.library_system.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SpringConfig}.
 */
@Generated
public class SpringConfig__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springConfig'.
   */
  public static BeanDefinition getSpringConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringConfig.class);
    beanDefinition.setTargetType(SpringConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(SpringConfig.class);
    beanDefinition.setInstanceSupplier(SpringConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
