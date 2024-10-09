package com.AnimalProdBrity.AnimalProdBrity.repository;

import com.AnimalProdBrity.AnimalProdBrity.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersTypeRepository extends JpaRepository<UsersType, UUID> {
}
