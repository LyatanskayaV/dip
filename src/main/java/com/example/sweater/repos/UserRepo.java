package com.example.sweater.repos;

import com.example.sweater.domain.Feedback;
import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Map;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);

    @Override
    Iterable<User> findAll();

    User findByActivationCode(String code);

 /*   public void saveUser(User user, String username, Map<String, String> form) {
        user.setUsername(username);

        Set<String> roles = Arrays.stream(Role.values())
                .map(Role::name)
                .collect(Collectors.toSet());

        user.getRoles().clear();

        for (String key : form.keySet()) {
            if (roles.contains(key)) {
                user.getRoles().add(Role.valueOf(key));
            }
        }

        userRepo.save(user);
    }*/}
