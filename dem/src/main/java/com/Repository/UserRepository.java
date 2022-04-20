package com.Repository;

import com.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 夏凯
 * @Description
 * @since 2021/4/2 15:29
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

      List<User> findByName(String name) ;
}
