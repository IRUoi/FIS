package com.briup.fis.dao.basic;

import com.briup.fis.dao.bean.basic.BaseConfig;

public interface BaseConfigMapper {
    int deleteByPrimaryKey(Integer configId);

    int insert(BaseConfig record);

    int insertSelective(BaseConfig record);

    BaseConfig selectByPrimaryKey(Integer configId);

    int updateByPrimaryKeySelective(BaseConfig record);

    int updateByPrimaryKey(BaseConfig record);
}
