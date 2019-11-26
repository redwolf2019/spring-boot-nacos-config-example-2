package com.example.nacosconfigexample2.dao;

import com.example.nacosconfigexample2.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserModel,Long> {
}
