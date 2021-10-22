package com.example.web22.dao;

import com.example.web22.DwyqsdDo;
import com.example.web22.DwyqsdDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DwyqsdDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    long countByExample(DwyqsdDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int deleteByExample(DwyqsdDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int insert(DwyqsdDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int insertSelective(DwyqsdDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    List<DwyqsdDo> selectByExample(DwyqsdDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    DwyqsdDo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int updateByExampleSelective(@Param("record") DwyqsdDo record, @Param("example") DwyqsdDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int updateByExample(@Param("record") DwyqsdDo record, @Param("example") DwyqsdDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int updateByPrimaryKeySelective(DwyqsdDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    int updateByPrimaryKey(DwyqsdDo record);
}