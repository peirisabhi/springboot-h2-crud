package com.peirisabhi.springbooth2crud.repository;

import com.peirisabhi.springbooth2crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 11/07/2023
 * Time: 14:53
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
