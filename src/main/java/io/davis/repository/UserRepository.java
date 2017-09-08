package io.davis.repository;

import io.davis.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rai on 2017/9/8.
 */
public interface UserRepository extends JpaRepository<User, String> {

}
