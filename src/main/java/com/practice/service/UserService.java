package com.practice.service;
import com.practice.repository.User;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    public List<User> helloWold() {
        return List.of(
                new User(1L, "Sergey", "ser@mail.ru", LocalDate.of(1990, 1, 1), 33),
                new User(2L, "Ivan", "ivan@mail.ru", LocalDate.of(1990, 2, 2), 32),
                new User(3L, "Andrey", "andr@mail.ru", LocalDate.of(1990, 3, 3), 31)
                );
    }
}
