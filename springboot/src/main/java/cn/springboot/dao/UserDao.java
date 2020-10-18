package cn.springboot.dao;

import cn.springboot.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();
}
