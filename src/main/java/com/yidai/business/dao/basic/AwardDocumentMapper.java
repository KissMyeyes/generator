package com.yidai.business.dao.basic;

import com.yidai.model.entity.basic.AwardDocument;

public interface AwardDocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AwardDocument record);

    int insertSelective(AwardDocument record);

    AwardDocument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AwardDocument record);

    int updateByPrimaryKey(AwardDocument record);
}