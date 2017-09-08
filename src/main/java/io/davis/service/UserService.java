package io.davis.service;

import io.davis.entity.User;
import io.davis.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rai on 2017/9/8.
 */
@Service
public class UserService {

  @Autowired
  private transient UserRepository repository;

  public void save(User user) {
    repository.save(user);
  }

  public void batchSave(List<User> users) {
    repository.save(users);
  }
}
