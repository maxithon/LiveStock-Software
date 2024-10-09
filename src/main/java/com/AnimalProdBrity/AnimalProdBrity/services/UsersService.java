package com.AnimalProdBrity.AnimalProdBrity.services;

import com.AnimalProdBrity.AnimalProdBrity.entity.Users;
import com.AnimalProdBrity.AnimalProdBrity.repository.UsersRepository;
import com.AnimalProdBrity.AnimalProdBrity.repository.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UsersService {
    //define private field
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users addNew(Users users){
    users.setActive(true);
    users.setRegistrationDate(new Date(System.currentTimeMillis()));
    return usersRepository.save(users);
    }
    //add similar method like the one we added in UsersReposition to find users by email
    public Optional<Users> getUserByEmail(String email){
        return usersRepository.findByEmail(email);
    }
}
