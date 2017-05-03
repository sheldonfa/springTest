package spring.demo_10_transaction.impl;

import com.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;
import spring.demo_10_transaction.UserService;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
@Service
public class User2ServiceImpl implements UserService{

    private UserMapper userMapper;

    @Override
    public void addUser() {
        userMapper.findUserById(1);
    }

    @Override
    public void updateUser() {
        System.out.println("update");

    }

    @Override
    public void deleteUser() {
        System.out.println("delete");
    }
}
