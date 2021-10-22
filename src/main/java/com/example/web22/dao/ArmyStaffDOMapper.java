package com.example.web22.dao;

import com.example.web22.ArmyStaffDO;
import com.example.web22.ArmyStaffDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArmyStaffDOMapper {
    List<ArmyStaffDO> list();

    List<ArmyStaffDO> listByAreaId(@Param("ids") String[] ids);

    long countByExample(ArmyStaffDOExample example);

    int deleteByExample(ArmyStaffDOExample example);

    int deleteByPrimaryKey(Integer staffid);

    int insert(ArmyStaffDO record);

    int insertSelective(ArmyStaffDO record);

    List<ArmyStaffDO> selectByExample(ArmyStaffDOExample example);

    ArmyStaffDO selectByPrimaryKey(Integer staffid);

    int updateByExampleSelective(@Param("record") ArmyStaffDO record, @Param("example") ArmyStaffDOExample example);

    int updateByExample(@Param("record") ArmyStaffDO record, @Param("example") ArmyStaffDOExample example);

    int updateByPrimaryKeySelective(ArmyStaffDO record);

    int updateByPrimaryKey(ArmyStaffDO record);
}