package com.example.web22.dao;

import com.example.web22.ArmyAbilityDO;
import com.example.web22.ArmyAbilityDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArmyAbilityDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    long countByExample(ArmyAbilityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int deleteByExample(ArmyAbilityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int deleteByPrimaryKey(Integer abilityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int insert(ArmyAbilityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int insertSelective(ArmyAbilityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    List<ArmyAbilityDO> selectByExample(ArmyAbilityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    ArmyAbilityDO selectByPrimaryKey(Integer abilityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByExampleSelective(@Param("record") ArmyAbilityDO record, @Param("example") ArmyAbilityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByExample(@Param("record") ArmyAbilityDO record, @Param("example") ArmyAbilityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByPrimaryKeySelective(ArmyAbilityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table army_ability
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    int updateByPrimaryKey(ArmyAbilityDO record);
}