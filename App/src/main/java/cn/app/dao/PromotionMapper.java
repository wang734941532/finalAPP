package cn.app.dao;

import cn.app.pojo.Promotion;

public interface PromotionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Promotion record);

    int insertSelective(Promotion record);

    Promotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Promotion record);

    int updateByPrimaryKey(Promotion record);
}