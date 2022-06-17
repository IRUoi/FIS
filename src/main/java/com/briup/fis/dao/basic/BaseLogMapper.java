package com.briup.fis.dao.basic;

import com.briup.fis.dao.bean.basic.BaseLog;

public interface BaseLogMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(BaseLog record);

    int insertSelective(BaseLog record);

    BaseLog selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(BaseLog record);

    int updateByPrimaryKey(BaseLog record);
}
