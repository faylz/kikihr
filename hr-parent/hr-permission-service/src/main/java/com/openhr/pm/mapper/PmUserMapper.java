package com.openhr.pm.mapper;

import com.openhr.pm.entity.PmUser;
import com.openhr.pm.entity.PmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmUserMapper {
    int countByExample(PmUserExample example);

    int deleteByExample(PmUserExample example);

    int deleteByPrimaryKey(String fid);

    int insert(PmUser record);

    int insertSelective(PmUser record);

    List<PmUser> selectByExample(PmUserExample example);

    PmUser selectByPrimaryKey(String fid);

    int updateByExampleSelective(@Param("record") PmUser record, @Param("example") PmUserExample example);

    int updateByExample(@Param("record") PmUser record, @Param("example") PmUserExample example);

    int updateByPrimaryKeySelective(PmUser record);

    int updateByPrimaryKey(PmUser record);
}