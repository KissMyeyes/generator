package com.yidai.business.dao.basic;

import com.yidai.model.entity.basic.UserAward;

public interface UserAwardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAward record);

    int insertSelective(UserAward record);

    UserAward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAward record);

    int updateByPrimaryKey(UserAward record);
}