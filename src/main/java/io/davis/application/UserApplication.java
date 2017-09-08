package io.davis.application;

import io.davis.entity.User;
import io.davis.service.UserService;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rai on 2017/9/8.
 */
@Service
public class UserApplication {

  @Autowired
  private transient UserService userService;

  public void create() {
    User user = new User();

    user.setName(RandomStringUtils.randomAlphanumeric(22));
    user.setEmail(RandomStringUtils.randomAlphanumeric(22));
    user.setAge(RandomUtils.nextInt(0, 100));

    userService.save(user);
  }
}
