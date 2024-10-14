//package lightheadfox.ru.library_system.config;
//
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configurable
//@EnableWebSecurity
//public class Config {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(request ->
//                request.requestMatchers("/swagger-ui/**", "/api/**").permitAll().anyRequest().authenticated());
//        return http.csrf().and().cors().disable().build();
//    }
//
//
//}
