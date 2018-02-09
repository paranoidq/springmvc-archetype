package me.archetype.service;

import me.archetype.dao.UserDao;
import me.archetype.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author paranoidq
 * @since 1.0.0
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUserAll() {
        return userDao.selectAll();
    }
}
