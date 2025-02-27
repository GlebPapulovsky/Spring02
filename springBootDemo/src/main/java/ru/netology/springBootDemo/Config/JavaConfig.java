package ru.netology.springBootDemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springBootDemo.Contoller.AuthorizationController;
import ru.netology.springBootDemo.Repository.UserRepository;
import ru.netology.springBootDemo.Service.AuthorizationService;

@Configuration
public class JavaConfig {
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
    @Bean
    public AuthorizationService authorizationService(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }
    @Bean
    public AuthorizationController authorizationController(AuthorizationService authorizationService) {
        return new AuthorizationController(authorizationService);
    }
}
