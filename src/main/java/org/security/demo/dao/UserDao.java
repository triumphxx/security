package org.security.demo.dao;

import org.security.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author:wangyupeng
 * @Date:2020/4/16
 * @Time:19:13
 * @desc:用户数据库操作类
 **/
public interface UserDao extends JpaRepository<User,Long> {
    User findUsersByUsername(String username);
}
