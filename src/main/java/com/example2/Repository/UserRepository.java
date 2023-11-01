package com.example2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
    User findByUserNameAndPassword(String userName, String password);
}
