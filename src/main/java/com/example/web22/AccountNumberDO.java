package com.example.web22;

import java.util.ArrayList;
import java.util.List;

public class AccountNumberDO {

    private Integer id;


    private String dwname;


    private String loginname;


    private String password;


    private String ercirz;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwzhgl.id
     *
     * @return the value of dwzhgl.id
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwzhgl.id
     *
     * @param id the value for dwzhgl.id
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwzhgl.dwname
     *
     * @return the value of dwzhgl.dwname
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public String getDwname() {
        return dwname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwzhgl.dwname
     *
     * @param dwname the value for dwzhgl.dwname
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public void setDwname(String dwname) {
        this.dwname = dwname == null ? null : dwname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwzhgl.loginname
     *
     * @return the value of dwzhgl.loginname
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwzhgl.loginname
     *
     * @param loginname the value for dwzhgl.loginname
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwzhgl.password
     *
     * @return the value of dwzhgl.password
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwzhgl.password
     *
     * @param password the value for dwzhgl.password
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwzhgl.ercirz
     *
     * @return the value of dwzhgl.ercirz
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public String getErcirz() {
        return ercirz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwzhgl.ercirz
     *
     * @param ercirz the value for dwzhgl.ercirz
     *
     * @mbg.generated Tue Oct 12 17:14:18 CST 2021
     */
    public void setErcirz(String ercirz) {
        this.ercirz = ercirz == null ? null : ercirz.trim();
    }

    @Override
    public String toString() {
        return "AccountNumberDO{" +
                "id=" + id +
                ", dwname='" + dwname + '\'' +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", ercirz='" + ercirz + '\'' +
                '}';
    }
}