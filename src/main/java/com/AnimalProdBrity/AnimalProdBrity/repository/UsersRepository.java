package com.AnimalProdBrity.AnimalProdBrity.repository;

import com.AnimalProdBrity.AnimalProdBrity.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, UUID> {
//method to find users by email
    Optional<Users> findByEmail(String email);
}
