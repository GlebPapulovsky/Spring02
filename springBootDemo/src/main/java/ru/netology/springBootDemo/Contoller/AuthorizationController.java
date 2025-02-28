package ru.netology.springBootDemo.Contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springBootDemo.Authorities;
import ru.netology.springBootDemo.Service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    @Value("8080")
    private int port;

    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }
    @GetMapping("/port")
    public int getPort() {
        return port;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}