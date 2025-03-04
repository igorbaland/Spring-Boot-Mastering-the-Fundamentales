package com.codewithmosh.store.di_memory_refresh.registration;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
