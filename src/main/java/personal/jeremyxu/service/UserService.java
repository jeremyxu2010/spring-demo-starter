package personal.jeremyxu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import personal.jeremyxu.mapper.UserMapper;

/**
 * Created by jeremy on 2017/6/14.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = {RuntimeException.class})
    public void createUser(String name, Integer age, String address){
        userMapper.insert(name, age, address);
//        throw new IllegalArgumentException("xxxx");
    }
}
