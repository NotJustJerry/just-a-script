package com.just.repository.mapper;

import com.just.repository.models.Rainbow;

/**
* @author 22454
* @description 针对表【rainbow】的数据库操作Mapper
* @createDate 2022-03-25 00:37:38
* @Entity com.just.repository.models.Rainbow
*/
public interface RainbowMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Rainbow record);

    int insertSelective(Rainbow record);

    Rainbow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rainbow record);

    int updateByPrimaryKey(Rainbow record);

}
