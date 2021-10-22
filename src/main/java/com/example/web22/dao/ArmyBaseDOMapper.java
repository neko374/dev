package com.example.web22.dao;

import com.example.web22.ArmyBaseDO;
import com.example.web22.ArmyBaseDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArmyBaseDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    long countByExample(ArmyBaseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int deleteByExample(ArmyBaseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int deleteByPrimaryKey(Integer armyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int insert(ArmyBaseDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int insertSelective(ArmyBaseDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    List<ArmyBaseDO> selectByExample(ArmyBaseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    ArmyBaseDO selectByPrimaryKey(Integer armyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByExampleSelective(@Param("record") ArmyBaseDO record, @Param("example") ArmyBaseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByExample(@Param("record") ArmyBaseDO record, @Param("example") ArmyBaseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByPrimaryKeySelective(ArmyBaseDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_base_info
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByPrimaryKey(ArmyBaseDO record);

    ArmyBaseDO queryBaseInfo(Integer id);

    List<ArmyBaseDO> listAllInfo(int i);

    void updPassword(ArmyBaseDO armyBaseDO);

    void updInfo(ArmyBaseDO armyBaseDO);
}