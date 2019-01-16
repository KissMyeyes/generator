package com.yidai.business.dao.basic;

import com.yidai.model.entity.basic.AwardPackage;

public interface AwardPackageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AwardPackage record);

    int insertSelective(AwardPackage record);

    AwardPackage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AwardPackage record);

    int updateByPrimaryKey(AwardPackage record);
}