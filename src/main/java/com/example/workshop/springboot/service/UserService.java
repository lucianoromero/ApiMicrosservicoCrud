package com.example.workshop.springboot.service;

import com.example.workshop.springboot.model.UserModel;
import com.example.workshop.springboot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

  @Autowired
  private final UserRepository userRepository;

  // @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Iterable<UserModel> getUsers() {
    log.info("Recuperando todos users");
    log.info("teste do Github Action");
    return userRepository.findAll();
  }

  public UserModel getUser(Integer id) {
    log.info("Recuperando user pelo id {}", id);
  
    return userRepository.findById(id).orElseThrow(() -> {
      return new RuntimeException(String.format("User=[%s] não foi encontrado", id));
    });
  }

  public UserModel delete(Integer id) {
    log.info("Apagando user pelo id {}", id);
    UserModel user = userRepository.findById(id).orElseThrow(() -> {
      return new RuntimeException(String.format("User=[%s] não foi encontrado", id));
    });
    userRepository.deleteById(id);
    return user;
  }

  public UserModel createUser(String name, String email) {
    UserModel user = UserModel.builder().name(name).email(email).build();
    log.info("Criando {}", user);
    log.info("teste do Github Action");
    return userRepository.save(user);
  }

  public UserModel updateUser(Integer id, String name, String email) {
    log.info("Atualizando user pelo id {}", id);
    UserModel user = userRepository.findById(id).orElseThrow(() -> {
      return new RuntimeException(String.format("User=[%s] não foi encontrado", id));
    });

    if (name != null) {
      user.setName(name);
    }

    if (email != null) {
      user.setEmail(email);
    }

    userRepository.save(user);
    return user;
  }

  public Iterable<UserModel> getUsersbyName(String name) {
     log.info("Recuperando user pelo Nome {}", name);
     Iterable<UserModel> user = userRepository.findByName(name);
     return user;   
  }

}