package com.endriwbento.workshopmongo.domain.services;

import com.endriwbento.workshopmongo.domain.User;
import com.endriwbento.workshopmongo.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
