package com.yidai.business.dao.basic;

import com.yidai.model.entity.basic.AwardCode;

public interface AwardCodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AwardCode record);

    int insertSelective(AwardCode record);

    AwardCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AwardCode record);

    int updateByPrimaryKey(AwardCode record);
}