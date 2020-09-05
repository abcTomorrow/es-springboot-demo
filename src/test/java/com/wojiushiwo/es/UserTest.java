package com.wojiushiwo.es;

import com.wojiushiwo.es.entity.User;
import com.wojiushiwo.es.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by myk
 * 2020/9/5 下午3:20
 */
public class UserTest extends ApplicationTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testFindOne() {

        User user = userMapper.selectById(1L);
        Assert.assertNotNull(user.toString());

    }

}
