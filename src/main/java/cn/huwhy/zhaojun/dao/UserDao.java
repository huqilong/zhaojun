package cn.huwhy.zhaojun.dao;

import org.apache.ibatis.annotations.Param;

import com.comblife.util.mybatis.BaseDao;

import cn.huwhy.zhaojun.model.User;

public interface UserDao extends BaseDao<User, Long> {
    User getByName(@Param("username") String name);
}
