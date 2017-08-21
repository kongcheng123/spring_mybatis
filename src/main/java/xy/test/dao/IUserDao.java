package xy.test.dao;

import xy.test.model.User;

import java.util.List;

/**
 * Created by xy on 2017-08-21 22:17
 */
public interface IUserDao {

    void save(User user);

    boolean update(User user);

    boolean delete(int id);

    User findById(int id);

    List<User> findAll();
}
