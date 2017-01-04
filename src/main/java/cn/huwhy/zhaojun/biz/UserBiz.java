package cn.huwhy.zhaojun.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.huwhy.zhaojun.dao.UserDao;
import cn.huwhy.zhaojun.model.User;

@Component
public class UserBiz {

    @Autowired
    private UserDao userDao;

    public User getByName(String name) {
        return userDao.getByName(name);
    }

}
