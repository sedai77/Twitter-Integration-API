package com.demo.twitter.producer.EasyTwitter.repository;

import com.demo.twitter.producer.EasyTwitter.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {
}
