package com.example.web22.dao;

import com.example.web22.UsersDO;
import com.example.web22.UsersDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersDOMapper {
    void updatePoint(UsersDO user);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_users
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    long countByExample(UsersDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_users
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    int deleteByExample(UsersDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_users
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    int insert(UsersDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_users
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    int insertSelective(UsersDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_users
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    List<UsersDO> selectByExample(UsersDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_users
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    int updateByExampleSelective(@Param("record") UsersDO record, @Param("example") UsersDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_users
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    int updateByExample(@Param("record") UsersDO record, @Param("example") UsersDOExample example);

    int deleteByPrimaryKey(Integer id);
}