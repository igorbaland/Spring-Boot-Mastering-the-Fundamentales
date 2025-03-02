package com.codewithmosh.store.registration;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
