package com.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.model.User;
import com.user.repo.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public User saveUser(User user) {
    return repo.save(user);
  }

  public List<User> getListOfUsers() {
    return repo.findAll();
  }
}
