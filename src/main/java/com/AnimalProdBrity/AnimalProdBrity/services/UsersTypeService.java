package com.AnimalProdBrity.AnimalProdBrity.services;

import com.AnimalProdBrity.AnimalProdBrity.entity.UsersType;
import com.AnimalProdBrity.AnimalProdBrity.repository.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {
    private final UsersTypeRepository usersTypeRepository;

    @Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository){
        this.usersTypeRepository = usersTypeRepository;
    }
    public List<UsersType> getAll(){
        return usersTypeRepository.findAll();
    }
}
