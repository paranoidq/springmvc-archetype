package me.archetype.dao;

import me.archetype.domain.User;

import java.util.List;

/**
 * @author paranoidq
 * @since 1.0.0
 */
public interface UserDao {

    List<User> selectAll();
}
