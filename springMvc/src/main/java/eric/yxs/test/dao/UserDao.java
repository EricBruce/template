package eric.yxs.test.dao;

import eric.yxs.test.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Jony on 2015/2/28.
 */
@Repository
public class UserDao {
    @Resource
    private SqlSessionTemplate sqlSession;

    public User getUserById(User user) {
        return (User)sqlSession.selectOne("eric.yxs.test.domain.User.getUser", user);
    }

}
