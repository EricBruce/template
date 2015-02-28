package eric.yxs.test.service.impl;

import eric.yxs.test.dao.UserDao;
import eric.yxs.test.domain.User;
import eric.yxs.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Jony on 2015/2/28.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public User getUser(User user) {
        return userDao.getUserById(user);
    }
}
