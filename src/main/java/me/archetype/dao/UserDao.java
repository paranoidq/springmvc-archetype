package me.archetype.dao;

import me.archetype.domain.User;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @author paranoidq
 * @since 1.0.0
 */
@Component
public interface UserDao {

    List<User> selectAll();
}
