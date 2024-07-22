package com.iudigital.Senado.Repositorios;

import org.springframework.security.core.userdetails.User;

public interface UserRepository {
    User findByUsername(String username);
}
