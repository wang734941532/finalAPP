package cn.app.dao;

import cn.app.pojo.Version;

public interface VersionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
    
    //���ڹ���Ա�������չʾ�汾��
    public Version getVersionById(int id);
}