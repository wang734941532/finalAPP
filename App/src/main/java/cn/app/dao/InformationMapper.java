package cn.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.app.pojo.Information;

public interface InformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Information record);

    int insertSelective(Information record);

    Information selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);
    
    public List<Information> getInfoByStatusId(@Param("statusId")int statusId,
    		@Param("pageCount")int pageCount,
    		@Param("pageSize")int pageSize);
    
    public Information getInfoById(int id);
    
    int getInfoCount();
    
    int updateStatus(@Param("value")int value,
    		@Param("id")int id);
}