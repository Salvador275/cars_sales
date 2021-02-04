package com.carbiz.ahan.repository;

import com.carbiz.ahan.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
