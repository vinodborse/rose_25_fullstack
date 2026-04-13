package com.skillio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillio.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
